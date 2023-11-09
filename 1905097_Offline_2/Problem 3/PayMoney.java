public class PayMoney extends State{

    public PayMoney(VendingMachine vendingMachine){
        super(vendingMachine);
    }

    @Override
    public boolean selectProduct() {
        System.out.println("Select Product is not done in this stage");
        return true;
    }

    @Override
    public void payAmount() {
        System.out.println("\nProceed for payment");
        this.vendingMachine.setState(new RemainingMoney(this.vendingMachine));
    }

    @Override
    public boolean remainingAmount(int amount) {
        System.out.println("Remaining Amount is not done in this stage");
        return true;
    }

    @Override
    public void cancelProduct() {
        System.out.println("\nProduct purchase cancelled");
        this.vendingMachine.setState(new SelectProduct(this.vendingMachine));
    }

    @Override
    public void refillVendingMachine() {
        System.out.println("Refill Vending Machine is not done in this stage");
    }

    @Override
    public void returnMoney() {
        System.out.println("Return Money is not done in this stage");
    }
}
