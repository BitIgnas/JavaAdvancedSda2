package Composition.Example2;

public class Product {

    private String productName;
    private int quality;
    private int productPrice;

    public Product(){

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Product(String productName, int quality, int productPrice) {
        this.productName = productName;
        this.quality = quality;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quality=" + quality +
                ", productPrice=" + productPrice +
                '}';
    }
}
