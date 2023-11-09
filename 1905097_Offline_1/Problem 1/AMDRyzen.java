public class AMDRyzen implements Processor {

    private String name;
    private int price;

    public AMDRyzen(){
        this.name = "AMD Ryzen 7 5700X";
        this.price = 28000;
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