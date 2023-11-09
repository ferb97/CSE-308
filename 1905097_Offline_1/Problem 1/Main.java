import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void printOption2(){
        System.out.println("1 - PC1");
        System.out.println("2 - PC2");
        System.out.println("3 - PC3");
        System.out.println("4 - Gaming PC");
        System.out.print("Select a PC: ");
    }

    public static void printOption1(){
        System.out.println("Order - O");
        System.out.println("Exit - E");
        System.out.print("Select an Option:  ");
    }

    public static void printOption3(){
        System.out.println("8 GB DDR4 RAM 2666 MHz - Press '1'");
        System.out.println("8 GB DDR4 RAM 3200 MHz - Press '2'");
        System.out.println("2 GB Graphics Card - Press '3'");
        System.out.println("4 GB Graphics Card - Press '4'");
        System.out.println("Press 'E' to exit");
        System.out.print("Add any one or exit: ");
    }

    public static void main(String[] args) {

        boolean flag = false;
        Scanner scn = new Scanner(System.in);
        String[] pcName = {"PC1", "PC2", "PC3", "Gaming PC"};
        String[] option3 = {"1", "2", "3", "4"};
        List<PC> listPC = new ArrayList<>();

        while(true) {

            printOption1();
            String str = scn.nextLine();

            if(str.equalsIgnoreCase("O")) {

                flag = true;
                Director director = new Director();
                PCBuilderFactory pcBuilderFactory = new PCBuilderFactory();

                printOption2();
                String str1 = scn.nextLine();
                boolean flag2 = false;

                while(true){

                    for(int i = 0; i < pcName.length; i++){
                        if(pcName[i].equalsIgnoreCase(str1)){
                            flag2 = true;
                            break;
                        }
                    }

                    if(flag2){
                        break;
                    }

                    else {
                        System.out.println("Invalid Input");
                        printOption2();
                        str1 = scn.nextLine();
                    }
                }

                PCBuilder pcBuilder = pcBuilderFactory.getPCBuilder(str1);
                director.construct(pcBuilder);

                String str2;
                flag2 = false;

                while(true){

                    flag2 = false;
                    printOption3();
                    str2 = scn.nextLine();

                    if(str2.equalsIgnoreCase("E")){
                        break;
                    }

                    for(int i = 0; i < option3.length; i++){
                        if(option3[i].equalsIgnoreCase(str2)){
                            flag2 = true;
                            break;
                        }
                    }

                    if(!flag2){
                        System.out.println("Invalid Input");
                        continue;
                    }

                    String str3;

                    if(str2.equalsIgnoreCase("1")){
                        str3 = "2666 MHz";
                        RamFactory ramFactory = new RamFactory();
                        Ram ram = ramFactory.getRam(str3);
                        director.addRamPC(ram);
                    }

                    else if(str2.equalsIgnoreCase("2")){
                        str3 = "3200 MHz";
                        RamFactory ramFactory = new RamFactory();
                        Ram ram = ramFactory.getRam(str3);
                        director.addRamPC(ram);
                    }

                    else if(str2.equalsIgnoreCase("3")){
                        str3 = "2 GB";
                        GraphicsCardFactory graphicsCardFactory = new GraphicsCardFactory();
                        GraphicsCard graphicsCard = graphicsCardFactory.getGraphicsCard(str3);
                        director.addGraphicsCardPC(graphicsCard);
                    }

                    else if(str2.equalsIgnoreCase("4")){
                        str3 = "4 GB";
                        GraphicsCardFactory graphicsCardFactory = new GraphicsCardFactory();
                        GraphicsCard graphicsCard = graphicsCardFactory.getGraphicsCard(str3);
                        director.addGraphicsCardPC(graphicsCard);
                    }

                }

                PC pc = pcBuilder.getPC();
                listPC.add(pc);
            }

            else if(str.equalsIgnoreCase("E") && flag){
                break;
            }

            else if(str.equalsIgnoreCase("E")){
                System.out.println("You need to place minimum 1 order");
            }

            else{
                System.out.println("Wrong Input");
            }

        }

        for(int i = 0; i < listPC.size(); i++){

            int l = i + 1;
            System.out.println("PC number " + l);
            listPC.get(i).print();
            System.out.println();

        }

    }
}
