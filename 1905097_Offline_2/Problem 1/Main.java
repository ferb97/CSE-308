import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Server server = new ABCServer();
        User premiumUser = new PremiumUser(server);
        User regularUser = new RegularUser(server);
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("Current state of the server: " + server.getState().getName());
            System.out.println("1 - Operational");
            System.out.println("2 - Partially Down");
            System.out.println("3 - Fully Down");
            System.out.println("Press any other key to exit");
            System.out.print("Enter a state: ");
            String str = scn.nextLine();
            try {
                int option = Integer.parseInt(str);
                if (option == 1) {
                    server.setState(new Operational());
                } else if (option == 2) {
                    server.setState(new PartiallyDown());
                } else if (option == 3) {
                    server.setState(new FullyDown());
                } else {
                    break;
                }
            }
            catch (Exception e){
                break;
            }
            System.out.println();
        }
    }
}