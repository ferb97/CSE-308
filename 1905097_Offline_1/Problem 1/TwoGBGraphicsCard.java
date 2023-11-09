public class TwoGBGraphicsCard implements GraphicsCard{

    private String name;
    private int price;

    public TwoGBGraphicsCard(){
        this.name = "2 GB Graphics Card";
        this.price = 6500;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}
