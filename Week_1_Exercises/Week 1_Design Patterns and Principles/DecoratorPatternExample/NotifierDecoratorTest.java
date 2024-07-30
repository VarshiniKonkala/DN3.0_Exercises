package decoraterPattern;

public class NotifierDecoratorTest {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier email = new EmailNotifier();
        
        // Decorate with SMS functionality
        Notifier sms = new SMSNotifierDecorator(email);
        
        // Decorate further with Slack functionality
        Notifier slack = new SlackNotifierDecorator(sms);
        
        // Send a message
        slack.send("Welcome");
    }
}
