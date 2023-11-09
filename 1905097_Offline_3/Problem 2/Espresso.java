public class Espresso extends CoffeeDecorator{

    public Espresso(Coffee coffee) {
        super(coffee);
        this.name = "Espresso";
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
        addDairyCream();

    }

    private void addDairyCream() {

        Components c = new DairyCream();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }
}
