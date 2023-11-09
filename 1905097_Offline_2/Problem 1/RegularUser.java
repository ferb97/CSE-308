import java.util.Scanner;

public class RegularUser extends User{

    public RegularUser(Server server){
        this.server = server;
        this.userID = ++ID;
        this.server.addUser(this);
        this.curServer = ABC_SERVER;
    }

    public void regularUserStateChange(String prev, String cur){
        System.out.println("\nRegular user with userID: " + this.userID);
        System.out.println("ABC Server has changed state from " + prev + " to " + cur);
    }
    @Override
    public void operationalToPartiallyDown(String msg) {
        regularUserStateChange("Operational", "Partially Down");
        System.out.println(msg);
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.print("Enter an Option: ");
            String str = scn.nextLine();
            try {
                int option = Integer.parseInt(str);
                if (option == 1) {
                    System.out.println("Now you are using partial service from ABC Server");
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
        regularUserStateChange("Operational", "Fully Down");
        System.out.println(msg);
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.print("Enter an Option: ");
            String str = scn.nextLine();
            try {
                int option = Integer.parseInt(str);
                if (option == 1) {
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
    public void partiallyDownToOperational(String msg) {
        regularUserStateChange("Partially Down", "Operational");
        if(getCurServer().equalsIgnoreCase(DEF_SERVER)){
            System.out.println(msg);
            setCurServer(ABC_SERVER);
        }
    }

    @Override
    public void partiallyDownToFullyDown(String msg) {
        regularUserStateChange("Partially Down", "Fully Down");
    }

    @Override
    public void fullyDownToOperational(String msg) {
        regularUserStateChange("Fully Down", "Operational");
        if(getCurServer().equalsIgnoreCase(DEF_SERVER)){
            System.out.println(msg);
            setCurServer(ABC_SERVER);
        }
    }

    @Override
    public void fullyDownToPartiallyDown() {
        regularUserStateChange("Fully Down", "Partially Down");
    }
}
