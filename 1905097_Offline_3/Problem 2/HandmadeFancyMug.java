public class HandmadeFancyMug implements Components{

    private String name;
    private int price;

    public HandmadeFancyMug(){
        name = "Handmade Fancy Mug";
        price = 100;
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
