public class OutOfStock extends State{

    public OutOfStock(VendingMachine vendingMachine){
        super(vendingMachine);
    }
    @Override
    public boolean selectProduct() {
        System.out.println("\nNo products available now. Request declined");
        return false;
    }

    @Override
    public void payAmount() {
        System.out.println("Pay Amount is not done in this stage");
    }

    @Override
    public boolean remainingAmount(int amount) {
        System.out.println("Remaining Amount is not done in this stage");
        return false;
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
        System.out.println("One Product added to the vending machine");
        this.vendingMachine.setState(new SelectProduct(this.vendingMachine));
    }

    @Override
    public void returnMoney() {
        System.out.println("Return Money is not done in this stage");
    }
}
