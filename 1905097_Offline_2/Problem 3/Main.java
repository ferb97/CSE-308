import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Product Price: ");
        int price = scn.nextInt();
        System.out.print("Enter Total Number of Products: ");
        int count = scn.nextInt();

        Product product = new Product(count, price);
        VendingMachine vendingMachine = new VendingMachine(product);
        String str = scn.nextLine();

        while(true){
            System.out.println("\nRemaining Products: " + vendingMachine.getRemainingProducts());
            System.out.println("1 - Buy Product");
            System.out.println("2 - Refill Vending Machine");
            System.out.println("Press any other key to exit");
            System.out.print("Enter an option: ");
            str = scn.nextLine();
            //System.out.println("This is " + str);
            if(str.equalsIgnoreCase("1")){
                if(!vendingMachine.selectProduct()){
                    continue;
                }
                System.out.println("1 - Make Payment");
                System.out.println("2 - Cancel Order");
                while(true){
                    System.out.print("Enter an option: ");
                    str = scn.nextLine();
                    if(str.equalsIgnoreCase("1")){
                        vendingMachine.payMoney();
                        while(true){
                            vendingMachine.showRemainingPayment();
                            System.out.print("Enter your money: ");
                            try{
                                str = scn.nextLine();
                                int amount = Integer.parseInt(str);

                                boolean isPaid = vendingMachine.isPaid(amount);
                                if(isPaid){
                                    break;
                                }
                            }
                            catch(Exception e){
                                System.out.println("Invalid input");
                            }
                        }
                        vendingMachine.returnMoney();
                        break;
                    }

                    else if(str.equalsIgnoreCase("2")){
                        vendingMachine.cancelOrder();
                        break;
                    }

                    else{
                        System.out.println("Invalid input");
                    }
                }
            }

            else if(str.equalsIgnoreCase("2")){
                vendingMachine.refill();
            }

            else{
                break;
            }

        }
    }
}
