public class RegularCooler implements Cooler {

    private String name;
    private int price;

    public RegularCooler(){
        this.name = "Regular";
        this.price = 36000;
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
