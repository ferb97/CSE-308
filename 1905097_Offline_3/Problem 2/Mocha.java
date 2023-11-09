public class Mocha extends CoffeeDecorator{

    public Mocha(Coffee coffee) {
        super(coffee);
        this.name = "Mocha";
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
        addChocolateSauce();

    }

    private void addChocolateSauce() {

        Components c = new ChocolateSauce();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }
}
