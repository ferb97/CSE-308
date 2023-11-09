import java.util.ArrayList;
import java.util.List;

public class MilkCoffee implements Coffee{

    private String type;
    private int price;

    public MilkCoffee() {
        this.type = "Milk Coffee";
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
        System.out.println("Adding components for milk coffee: ");
        Components c1 = new Milk();
        System.out.println(c1.getName() + ": " + c1.getPrice() + " tk");
        this.price += c1.getPrice();

        Components c2 = new GrindedCoffeeBeans();
        System.out.println(c2.getName() + ": " + c2.getPrice() + " tk");
        this.price += c2.getPrice();
    }
}
