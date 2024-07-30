package inventoryManagementSystem;
public class InventoryManagerTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Create and add products
        Product product1 = new Product(1, "Tv", 10, 999.99);
        Product product2 = new Product(2, "Fridge", 20, 499.99);

        manager.addProduct(product1);
        manager.addProduct(product2);

        // Print all products
        System.out.println("All Products:");
        manager.printAllProducts();

        // Update a product
        Product updatedProduct = new Product(1, "Telephone", 8, 1199.99);
        manager.updateProduct(updatedProduct);

        // Print all products again
        System.out.println("\nAfter Update:");
        manager.printAllProducts();

        // Delete a product
        manager.deleteProduct(2);

        // Print all products again
        System.out.println("\nAfter Deletion:");
        manager.printAllProducts();
    }
}
