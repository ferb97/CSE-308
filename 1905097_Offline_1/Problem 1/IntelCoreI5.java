public class IntelCoreI5 implements Processor {

    private String name;
    private int price;

    public IntelCoreI5(){
        this.name = "11th Gen Intel Core i5";
        this.price = 20000;
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
