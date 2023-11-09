public class SelectProduct extends State{

    public SelectProduct(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    public boolean selectProduct() {
        System.out.println("\nPrice: " + this.vendingMachine.getProduct().getPrice() + " tk");
        System.out.println("Do you wish to buy this product?");
        this.vendingMachine.setState(new PayMoney(this.vendingMachine));
        return true;
    }

    @Override
    public void payAmount() {
        System.out.println("Pay Amount is not done in this stage");
    }

    @Override
    public boolean remainingAmount(int amount) {
        System.out.println("Remaining Amount is not done in this stage");
        return true;
    }

    @Override
    public void cancelProduct() {
        System.out.println("Cancel Product is not done in this stage");
    }

    @Override
    public void refillVendingMachine() {
        int count = this.vendingMachine.getProduct().getRemainingProduct();
        count++;
        this.vendingMachine.getProduct().setRemainingProduct(count);
        System.out.println("\nOne Product added to the vending machine");
    }

    @Override
    public void returnMoney() {
        System.out.println("Return Money is not done in this stage");
    }
}
