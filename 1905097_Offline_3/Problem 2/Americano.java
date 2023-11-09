public class Americano extends CoffeeDecorator{

    public Americano(Coffee coffee) {
        super(coffee);
        this.name = "Americano";
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
        addGrindedCoffeeBeans();

    }

    private void addGrindedCoffeeBeans() {

        Components c = new GrindedCoffeeBeans();
        System.out.println(c.getName() + ": " + c.getPrice() + " tk");
        this.price += c.getPrice();
    }


}
