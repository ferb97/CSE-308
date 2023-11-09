public class ChocolateSauce implements Components{

    private String name;
    private int price;

    public ChocolateSauce(){
        name = "Chocolate Sauce";
        price = 60;
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
