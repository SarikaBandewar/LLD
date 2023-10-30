package lld2.observer;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        EmailSender emailSender = new EmailSender();
        AnalyticSender analyticSender = new AnalyticSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        
        amazon.orderPlaced();
        amazon.orderCancelled();
    }
}
