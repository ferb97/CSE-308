public class RemainingMoney extends State{

    public RemainingMoney(VendingMachine vendingMachine){
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
        if(amount + this.vendingMachine.getAmountCollected() >= this.vendingMachine.getProduct().getPrice()){
            this.vendingMachine.setChangedAmount(amount + this.vendingMachine.getAmountCollected() - this.vendingMachine.getProduct().getPrice());
            this.vendingMachine.setAmountCollected(0);
            this.vendingMachine.setState(new GiveChange(this.vendingMachine));
            return true;
        }
        else{
            this.vendingMachine.setAmountCollected(amount + this.vendingMachine.getAmountCollected());
            return false;
        }
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
        System.out.println("Return Money is not done in this stage");
    }
}
