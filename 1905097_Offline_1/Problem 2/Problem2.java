import java.util.Scanner;

interface Car{
    public String getColor();
    public String getCountry();
    public String getEngine();
    public String getDriveTrain();
    public String getName();

}

class Toyota implements Car{

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public String getCountry() {
        return "Japan";
    }

    @Override
    public String getEngine() {
        return "Hydrogen Fuel Cells";
    }

    @Override
    public String getDriveTrain() {
        return "Rear Wheel";
    }

    @Override
    public String getName() {
        return "Toyota";
    }
}

class BMW implements Car{

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getCountry() {
        return "Germany";
    }

    @Override
    public String getEngine() {
        return "Electric";
    }

    @Override
    public String getDriveTrain() {
        return "Rear Wheel";
    }

    @Override
    public String getName() {
        return "BMW";
    }
}

class Tesla implements Car{

    @Override
    public String getColor() {
        return "White";
    }

    @Override
    public String getCountry() {
        return "US";
    }

    @Override
    public String getEngine() {
        return "Electric";
    }

    @Override
    public String getDriveTrain() {
        return "All Wheels";
    }

    @Override
    public String getName() {
        return "Tesla";
    }
}

class CarFactory{

    public Car createCar(String str){
        if(str.equalsIgnoreCase("Asia")){
            return  new Toyota();
        }
        else if(str.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if(str.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        else{
            System.out.println("Wrong Location");
            return null;
        }
    }
}

public class Problem2 {

    public static void main(String[] args) {
        System.out.print("Enter Location: ");
        Scanner scn = new Scanner(System.in);
        String location = scn.nextLine();
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar(location);
        if(car==null){
            return;
        }
        System.out.println("Car Name: " + car.getName());;
        System.out.println("Color: " + car.getColor());
        System.out.println("Manufacturing Country: " + car.getCountry());
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Drive Train: " + car.getDriveTrain());
    }
}
