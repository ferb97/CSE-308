public class FourGBGraphicsCard implements GraphicsCard{

    private String name;
    private int price;

    public FourGBGraphicsCard(){
        this.name = "4 GB Graphics Card";
        this.price = 7600;
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