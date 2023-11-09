public class VendingMachine {

    private State state;
    private Product product;
    private int amountCollected;
    private int changedAmount;

    public int getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getChangedAmount() {
        return changedAmount;
    }

    public void setChangedAmount(int changedAmount) {
        this.changedAmount = changedAmount;
    }

    public VendingMachine(Product product) {
        this.product = product;
        this.amountCollected = 0;
        this.changedAmount = 0;
        if(this.product.getRemainingProduct() == 0){
            this.state = new OutOfStock(this);
        }
        else{
            this.state = new SelectProduct(this);
        }
    }

    public int getRemainingProducts(){
        return this.getProduct().getRemainingProduct();
    }

    public void refill(){
        this.state.refillVendingMachine();
    }

    public boolean selectProduct(){
        return this.state.selectProduct();
    }

    public void payMoney(){
        this.state.payAmount();
    }

    public void cancelOrder(){
        this.state.cancelProduct();
    }

    public void showRemainingPayment(){
        System.out.println("\nYou need to pay " + (getProduct().getPrice() - amountCollected) + " tk more");
    }

    public boolean isPaid(int amount){
        return this.state.remainingAmount(amount);
    }

    public void returnMoney(){
        this.state.returnMoney();
    }

}
