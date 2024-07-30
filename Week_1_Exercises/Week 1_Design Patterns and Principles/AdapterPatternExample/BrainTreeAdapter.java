package adapterPattern;

public class BrainTreeAdapter implements PaymentProcessor {
    private BrainTreeGateway braintreeGateway;

    public BrainTreeAdapter(BrainTreeGateway braintreeGateway) {
        this.braintreeGateway = braintreeGateway;
    }

    @Override
    public void processPayment(double amount) {
        braintreeGateway.executePayment(amount);
    }
}
