public class CinnamonPowder implements Components{

    private String name;
    private int price;

    public CinnamonPowder(){
        name = "Cinnamon Powder";
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
