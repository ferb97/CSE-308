public class LiquidCooler implements Cooler {

    private String name;
    private int price;

    public LiquidCooler(){
        this.name = "Liquid";
        this.price = 17000;
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