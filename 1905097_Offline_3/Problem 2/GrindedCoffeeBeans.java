public class GrindedCoffeeBeans implements Components{

    private String name;
    private int price;

    public GrindedCoffeeBeans(){
        name = "Grinded Coffee Beans";
        price = 30;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
