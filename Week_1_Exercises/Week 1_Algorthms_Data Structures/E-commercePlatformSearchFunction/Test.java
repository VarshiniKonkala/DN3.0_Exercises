package ecommercePlatformSearchFunction;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Coffee Maker", "Appliances")
        };

        // Sorting the array by productId for binary search
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));

        // Test Linear Search
        Product foundProductLinear = LinearSearch.linearSearch(products, 2);
        System.out.println("Linear Search Result: " + foundProductLinear);

        // Test Binary Search
        Product foundProductBinary = BinarySearch.binarySearch(products, 2);
        System.out.println("Binary Search Result: " + foundProductBinary);
    }
}
