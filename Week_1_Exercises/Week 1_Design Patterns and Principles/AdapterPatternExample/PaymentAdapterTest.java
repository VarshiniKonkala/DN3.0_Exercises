package adapterPattern;

public class PaymentAdapterTest {
    public static void main(String[] args) {
        // Create instances of the gateways
        SquareGateway g1 = new SquareGateway();
        BrainTreeGateway g2 = new BrainTreeGateway();
        
        // Create adapters for each gateway
        PaymentProcessor P1 = new SquareAdapter(g1);
        PaymentProcessor P2 = new BrainTreeAdapter(g2);
        
        // Process payments using the adapters
        processPayment(P1, 1234.5);
        processPayment(P2, 9678.4);
    }

    private static void processPayment(PaymentProcessor processor, double amount) {
        processor.processPayment(amount);
    }

}
