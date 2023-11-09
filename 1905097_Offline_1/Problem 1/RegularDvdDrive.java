public class RegularDvdDrive implements DvdDrive{

    private String name;
    private int price;

    public RegularDvdDrive(){
        this.name = "Regular";
        this.price = 6000;
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
