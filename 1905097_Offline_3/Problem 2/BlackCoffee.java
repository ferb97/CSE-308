import java.util.ArrayList;
import java.util.List;

public class BlackCoffee implements Coffee{

    private String type;
    private int price;

    public BlackCoffee() {
        this.type = "Black Coffee";
        this.price = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void addCup() {
        System.out.println("Adding coffee mug: ");
        addHandmadeFancyMug();
    }

    private void addHandmadeFancyMug() {
        Components c = new HandmadeFancyMug();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }

    @Override
    public void makeCoffee() {
        System.out.println("Adding components for black coffee: ");
        Components c = new GrindedCoffeeBeans();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }
}
