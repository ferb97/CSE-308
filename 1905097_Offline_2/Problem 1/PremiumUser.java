import java.util.Scanner;

public class PremiumUser extends User{

    public PremiumUser(Server server){
        this.server = server;
        this.userID = ++ID;
        this.server.addUser(this);
        this.curServer = ABC_SERVER;
    }

    public void premiumUserStateChange(String prev, String cur){
        System.out.println("\nPremium user with userID: " + this.userID);
        System.out.println("ABC Server has changed state from " + prev + " to " + cur);
    }
    @Override
    public void operationalToPartiallyDown(String msg) {
        premiumUserStateChange("Operational", "Partially Down");
        System.out.println(msg);
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.print("Enter an Option: ");
            String str  = scn.nextLine();
            try {
                int option = Integer.parseInt(str);
                if (option == 1) {
                    System.out.println("Now you are using partial service from ABC Server and partial service from DEF Server");
                    break;
                } else if (option == 2) {
                    System.out.println("Now you are using full service from DEF Server");
                    setCurServer(DEF_SERVER);
                    break;
                } else {
                    System.out.println("Incorrect input");
                }
            }
            catch(Exception e){
                System.out.println("Incorrect input");
            }
        }
    }

    @Override
    public void operationalToFullyDown(String msg) {
        setCurServer(DEF_SERVER);
        premiumUserStateChange("Operational", "Fully Down");
        System.out.println(msg);
    }

    @Override
    public void partiallyDownToOperational(String msg) {
        premiumUserStateChange("Partially Down", "Operational");
        if(getCurServer().equalsIgnoreCase(DEF_SERVER)){
            System.out.println(msg);
            setCurServer(ABC_SERVER);
        }
    }

    @Override
    public void partiallyDownToFullyDown(String msg) {
        premiumUserStateChange("Partially Down", "Fully Down");
        if(getCurServer().equalsIgnoreCase(ABC_SERVER)) {
            System.out.println(msg);
            setCurServer(DEF_SERVER);
        }
    }

    @Override
    public void fullyDownToOperational(String msg) {
        premiumUserStateChange("Fully Down", "Operational");
        System.out.println(msg);
        setCurServer(ABC_SERVER);
    }

    @Override
    public void fullyDownToPartiallyDown() {
        premiumUserStateChange("Fully Down", "Partially Down");
    }
}
