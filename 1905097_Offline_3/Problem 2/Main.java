import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int totalPrice = 0;

        while(true){
            System.out.println("0 - Finish Order");
            System.out.println("1 - Americano");
            System.out.println("2 - Espresso");
            System.out.println("3 - Cappuccino");
            System.out.println("4 - Mocha");
            System.out.print("Choose an option: ");
            try {
                int option = scn.nextInt();

                if(option == 0){
                    break;
                }

                else if(option == 1){
                    Coffee blackCoffee = new BlackCoffee();
                    CoffeeDecorator americano = new Americano(blackCoffee);
                    americano.addCup();
                    americano.makeCoffee();

                    americano.showPrice();
                    totalPrice += americano.getPrice();
                    System.out.println("Total Order Price: " + totalPrice + " tk");
                }

                else if(option == 2){
                    Coffee blackCoffee = new BlackCoffee();
                    CoffeeDecorator espresso = new Espresso(blackCoffee);
                    espresso.addCup();
                    espresso.makeCoffee();

                    espresso.showPrice();
                    totalPrice += espresso.getPrice();
                    System.out.println("Total Order Price: " + totalPrice + " tk");
                }

                else if(option == 3){
                    Coffee milkCoffee = new MilkCoffee();
                    CoffeeDecorator cappuccino = new Cappuccino(milkCoffee);
                    cappuccino.addCup();
                    cappuccino.makeCoffee();

                    cappuccino.showPrice();
                    totalPrice += cappuccino.getPrice();
                    System.out.println("Total Order Price: " + totalPrice + " tk");
                }

                else if(option == 4){
                    Coffee milkCoffee = new MilkCoffee();
                    CoffeeDecorator mocha = new Mocha(milkCoffee);
                    mocha.addCup();
                    mocha.makeCoffee();

                    mocha.showPrice();
                    totalPrice += mocha.getPrice();
                    System.out.println("Total Order Price: " + totalPrice + " tk");
                }

                else{
                    System.out.println("Invalid input");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input");
                scn.nextLine();
            }
            System.out.println();
        }

        System.out.println("Your total order price: " + totalPrice + " tk");
    }
}
