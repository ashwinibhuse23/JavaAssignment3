package assignment;

import java.util.ArrayList;

public class ShoppingCartQue9 {
	private ArrayList<ProductQue9> cart;

    public ShoppingCartQue9() {
        this.cart = new ArrayList<>();
    }

    public void addProduct(ProductQue9 product) {
        cart.add(product);
    }

    public double calculateTotalCost() {
        double totalCost=0;
        for (ProductQue9 product : cart) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (ProductQue9 product : cart) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Total cost: $" + calculateTotalCost());
    }
}



