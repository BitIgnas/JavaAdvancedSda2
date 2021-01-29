package Composition.Example2;

import java.util.List;

public class Order {

    private List<Product> product;

    public Order(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                '}';
    }


}
