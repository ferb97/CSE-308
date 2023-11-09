public class Product {
    private String name;
    private int remainingProduct;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRemainingProduct() {
        return remainingProduct;
    }

    public void setRemainingProduct(int remainingProduct) {
        this.remainingProduct = remainingProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int remainingProduct, int price) {
        this.remainingProduct = remainingProduct;
        this.price = price;
        this.name = "Product";
    }

    public Product(String name, int remainingProduct, int price) {
        this.name = name;
        this.remainingProduct = remainingProduct;
        this.price = price;
    }
}
