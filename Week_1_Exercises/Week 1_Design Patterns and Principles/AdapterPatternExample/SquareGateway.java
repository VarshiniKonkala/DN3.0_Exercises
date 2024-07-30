package adapterPattern;

public class SquareGateway {
    public void processTransaction(double amount) {
        System.out.println("Processing $" + amount + " through Square.");
    }
}

