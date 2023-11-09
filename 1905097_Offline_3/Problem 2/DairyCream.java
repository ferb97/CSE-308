public class DairyCream implements Components{

    private String name;
    private int price;

    public DairyCream(){
        name = "Dairy Cream";
        price = 40;
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
