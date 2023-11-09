public class IntelCoreI9 implements Processor {

    private String name;
    private int price;

    public IntelCoreI9(){
        this.name = "11th Gen Intel Core i9";
        this.price = 65000;
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