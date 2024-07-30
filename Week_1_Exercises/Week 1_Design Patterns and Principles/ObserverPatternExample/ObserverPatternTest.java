package observerPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a StockMarket instance
        StockMarket stock = new StockMarket();

        // Create observer instances
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        // Register observers
        stock.registerObserver(mobile);
        stock.registerObserver(web);

        // Set stock price and notify observers
        stock.setStockPrice(296.547);
        stock.setStockPrice(12597.96357);

        // Deregister an observer
        stock.deregisterObserver(mobile);

        // Set stock price again and notify remaining observers
        stock.setStockPrice(5476.195);
    }
}
