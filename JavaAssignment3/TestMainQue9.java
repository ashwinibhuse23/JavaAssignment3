package assignment;

public class TestMainQue9 {
	public static void main(String[] args) {
        ProductQue9 product1 = new ProductQue9("Laptop", 999.99);
        ProductQue9 product2 = new ProductQue9("Phone", 699.99);
        ProductQue9 product3 = new ProductQue9("Headphones", 99.99);

        ShoppingCartQue9 cart = new ShoppingCartQue9();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.displayCart();
    }
}



