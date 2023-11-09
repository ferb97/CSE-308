public abstract class State {

    protected VendingMachine vendingMachine;

    public State(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    public void setVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public abstract boolean selectProduct();
    public abstract void payAmount();
    public abstract boolean remainingAmount(int amount);
    public abstract void cancelProduct();
    public abstract void refillVendingMachine();
    public abstract void returnMoney();
}
