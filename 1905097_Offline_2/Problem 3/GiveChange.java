public class GiveChange extends State{

    public GiveChange(VendingMachine vendingMachine){
        super(vendingMachine);
    }

    @Override
    public boolean selectProduct() {
        System.out.println("Select Product is not done in this stage");
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
        System.out.println("Refill Vending Machine is not done in this stage");
    }

    @Override
    public void returnMoney() {
        System.out.println("\nTake your change: " + this.vendingMachine.getChangedAmount() + " tk");
        this.vendingMachine.setChangedAmount(0);
        System.out.println("The product is given to the customer");
        this.vendingMachine.getProduct().setRemainingProduct(this.vendingMachine.getProduct().getRemainingProduct() - 1);
        if(this.vendingMachine.getProduct().getRemainingProduct() > 0) {
            this.vendingMachine.setState(new SelectProduct(this.vendingMachine));
        }

        else{
            this.vendingMachine.setState(new OutOfStock(this.vendingMachine));
        }
    }
}
