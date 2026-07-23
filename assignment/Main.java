interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}
interface Taxable {
    double calculateTax();
    void generateTaxInvoice();
}
interface Loggable {
    void logActivity(String action);
}
class CreditCardPayment implements Payable, Taxable, Loggable {
    private String cardNumber;
    private String status = "Pending";
    private double amount;
    private double tax;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    // Getters and Setters
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }
    public double getTax() {
        return tax;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment method: Credit Card");
    }
    @Override
    public String getPaymentStatus() {
        return status;
    }
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding Rs. " + amount +
                " to card ending with " +
                cardNumber.substring(cardNumber.length() - 4));
    }
    @Override
    public double calculateTax() {
        return amount * 0.18;
    }
    @Override
    public void generateTaxInvoice() {
        System.out.println("\n------ TAX INVOICE ------");
        System.out.println("Card Number : XXXX-XXXX-XXXX-" +
                cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount      : Rs. " + amount);
        System.out.println("GST (18%)   : Rs. " + tax);
        System.out.println("Total       : Rs. " + (amount + tax));
    }
    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action);
    }
}
// Business Logic Class
class PaymentService {
    public void makePayment(CreditCardPayment payment, double amount) {
        // Business Rule 1: Validate Amount
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }
        // Business Rule 2: Store Amount
        payment.setAmount(amount);
        // Business Rule 3: Calculate Tax
        double tax = payment.calculateTax();
        payment.setTax(tax);
        // Business Rule 4: Process Payment
        payment.processPayment(amount);
        payment.setStatus("Payment Successful");
        // Business Rule 5: Log Activity
        payment.logActivity("Payment Processed");
    }
    public void refund(CreditCardPayment payment, double amount) {
        if (amount > payment.getAmount()) {
            System.out.println("Refund amount cannot exceed payment amount.");
            return;
        }
        payment.refundPayment(amount);
        payment.setStatus("Refund Successful");
        payment.logActivity("Refund Processed");
    }
}
public class Main {
    public static void main(String[] args) {
        CreditCardPayment payment =
                new CreditCardPayment("1234567812345678");
        PaymentService service = new PaymentService();
        // Business Logic Execution
        service.makePayment(payment, 5000);
        System.out.println("Payment Status : "
                + payment.getPaymentStatus());
        payment.generateTaxInvoice();
        service.refund(payment, 1000);
        System.out.println("Updated Status : "
                + payment.getPaymentStatus());
    }
}