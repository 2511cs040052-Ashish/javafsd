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
//---------------- Credit Card Payment ----------------
class CreditCardPayment implements Payable, Taxable, Loggable {
    private String cardNumber;
    private String status = "Pending";
    private double amount;
    private double tax;
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        tax = calculateTax();
        System.out.println("\nProcessing Credit Card Payment...");
        System.out.println("Card Number : XXXX-XXXX-XXXX-" +
                cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount : Rs. " + amount);
        status = "Payment Successful";
        logActivity("Credit Card Payment");
    }
    @Override
    public String getPaymentStatus() {
        return status;
    }
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunded Rs. " + amount + " to Credit Card.");
        status = "Refund Successful";
    }
    @Override
    public double calculateTax() {
        return amount * 0.18;
    }
    @Override
    public void generateTaxInvoice() {
        System.out.println("\n--- Credit Card Invoice ---");
        System.out.println("Amount : Rs. " + amount);
        System.out.println("GST : Rs. " + tax);
        System.out.println("Total : Rs. " + (amount + tax));
    }
    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action);
    }
}
//---------------- PayPal Payment ----------------
class PayPalPayment implements Payable, Taxable, Loggable {
    private String email;
    private String status = "Pending";
    private double amount;
    private double tax;
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        tax = calculateTax();
        System.out.println("\nProcessing PayPal Payment...");
        System.out.println("PayPal Email : " + email);
        System.out.println("Amount : Rs. " + amount);
        status = "Payment Successful";
        logActivity("PayPal Payment");
    }
    @Override
    public String getPaymentStatus() {
        return status;
    }
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunded Rs. " + amount + " to PayPal Account.");
        status = "Refund Successful";
    }
    @Override
    public double calculateTax() {
        return amount * 0.18;
    }
    @Override
    public void generateTaxInvoice() {
        System.out.println("\n--- PayPal Invoice ---");
        System.out.println("Amount : Rs. " + amount);
        System.out.println("GST : Rs. " + tax);
        System.out.println("Total : Rs. " + (amount + tax));
    }
    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action);
    }
}
//---------------- UPI Payment ----------------
class UpiPayment implements Payable, Taxable, Loggable {
    private String upiId;
    private String status = "Pending";
    private double amount;
    private double tax;
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        tax = calculateTax();
        System.out.println("\nProcessing UPI Payment...");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : Rs. " + amount);
        status = "Payment Successful";
        logActivity("UPI Payment");
    }
    @Override
    public String getPaymentStatus() {
        return status;
    }
    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunded Rs. " + amount + " to UPI ID.");
        status = "Refund Successful";
    }
    @Override
    public double calculateTax() {
        return amount * 0.18;
    }
    @Override
    public void generateTaxInvoice() {
        System.out.println("\n--- UPI Invoice ---");
        System.out.println("Amount : Rs. " + amount);
        System.out.println("GST : Rs. " + tax);
        System.out.println("Total : Rs. " + (amount + tax));
    }
    @Override
    public void logActivity(String action) {
        System.out.println("[LOG] " + action);
    }
}
//---------------- Main Class ----------------
public class Main {
    public static void main(String[] args) {
        Payable[] payments = {
                new CreditCardPayment("1234567812345678"),
                new PayPalPayment("ashish@gmail.com"),
                new UpiPayment("ashish@upi")
        };
        for (Payable p : payments) {
            p.processPayment(5000);
            System.out.println("Status : " + p.getPaymentStatus());
            ((Taxable) p).generateTaxInvoice();
            p.refundPayment(1000);
            System.out.println("Updated Status : " + p.getPaymentStatus());
            System.out.println("");
        }
    }
}