public class Milk implements Components{

    private String name;
    private int price;

    public Milk(){
        name = "Milk";
        price = 50;
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
