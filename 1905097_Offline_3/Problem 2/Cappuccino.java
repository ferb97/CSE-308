public class Cappuccino extends CoffeeDecorator{

    public Cappuccino(Coffee coffee) {
        super(coffee);
        this.name = "Cappuccino";
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void addCup() {
        this.coffee.addCup();
        this.price = this.coffee.getPrice();
    }

    @Override
    public void makeCoffee() {
        this.coffee.makeCoffee();
        this.price = this.coffee.getPrice();

        System.out.println("Additional components for " + name + ": ");
        addCinnamonPowder();

    }

    private void addCinnamonPowder() {

        Components c = new CinnamonPowder();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }
}
