public class MHz3200Ram implements Ram{

    private String name;
    private int price;
    private String speed;

    public MHz3200Ram(){
        this.name = "8 GB DDR4 Ram";
        this.speed = "3200 MHz";
        this.price = 2950;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setSpeed(String speed){
        this.speed = speed;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice(){
        return this.price;
    }
}
