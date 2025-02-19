public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("12345");
        Order order2 = new Order("67890");

        // Inject EmailNotifier
        OrderProcessor emailProcessor = new OrderProcessor(new EmailNotifier());
        emailProcessor.processOrder(order1);

        // Inject SMSNotifier
        OrderProcessor smsProcessor = new OrderProcessor(new SMSNotifier());
        smsProcessor.processOrder(order2);
    }
}
