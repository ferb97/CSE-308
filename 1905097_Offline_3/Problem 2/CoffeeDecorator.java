public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;
    protected String name;
    protected int price;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
        this.price = this.coffee.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showPrice(){
        System.out.println("Price for " + name + " coffee: " + price + " tk");
    }
}
