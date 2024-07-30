package logger;

public class LoggerTest {
    public static void main(String[] args) {
        // Get instances of Logger
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        // Check if both instances are the same
        if (l1 == l2) {
            System.out.println("logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}

