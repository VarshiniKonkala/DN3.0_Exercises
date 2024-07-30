package sortingCustomerOrders;
public class Main {
    public static void main(String[] args) {
        // Create orders
        Order[] orders = {
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 180.20)
        };

        // Bubble Sort
        System.out.println("Orders sorted by Bubble Sort:");
        BubbleSort.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Create orders again (for Quick Sort)
        orders = new Order[]{
            new Order(1, "Alice", 250.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 300.00),
            new Order(4, "David", 180.20)
        };

        // Quick Sort
        System.out.println("\nOrders sorted by Quick Sort:");
        QuickSort.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
