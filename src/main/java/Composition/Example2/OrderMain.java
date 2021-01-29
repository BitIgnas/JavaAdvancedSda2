package Composition.Example2;

import java.util.ArrayList;
import java.util.List;

/*
Order can exist as without product.
 */
public class OrderMain {
    public static void main(String[] args) {
        Product product1 = new Product("Kede", 5, 50);
        Product product2 = new Product("Stalas", 3, 150);

        List<Product> products = new ArrayList<>();
        //If only want object Product product

        products.add(product1);
        products.add(product2);

        Order order = new Order(products);
        System.out.println(order);

        order.getProduct().get(0).setQuality(2);
        System.out.println(order);

        for(Product product : products){
            if(product.getProductName().equals("Kede")){
                order.getProduct().remove(product);
            }
        }
    }
}
