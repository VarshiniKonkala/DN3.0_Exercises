package strategyPattern;

public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create different payment strategies
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();

        // Create the context and set the payment strategy
        PaymentContext paymentContext = new PaymentContext(creditCard);

        // Execute payment using Credit Card
        System.out.println("Testing Credit Card Payment:");
        paymentContext.executePayment(597.0);

        // Change strategy to PayPal and execute payment
        paymentContext.setPaymentStrategy(paypal);
        System.out.println("\nTesting PayPal Payment:");
        paymentContext.executePayment(258.54);
    }

}
