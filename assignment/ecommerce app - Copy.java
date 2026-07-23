import java.util*;
class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();
        System.out.println("Order Created: " + orderId);
    }
    public double calculateDiscount() {
        return totalAmount * 0.05; // 5% discount
    }
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: $" + totalAmount);
        System.out.println("Date: " + orderDate);
    }
}
class PremiumOrder extends Order {
    private String membershipTier;
    private double cashback;
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {
        super(orderId, totalAmount);
        this.membershipTier = membershipTier;
        this.cashback = totalAmount * 0.10;
        System.out.println("Premium Order with " + membershipTier + " Membership");
    }
    @Override
    public double calculateDiscount() {
        double baseDiscount = super.calculateDiscount();
        double premiumDiscount = totalAmount * 0.10;
        double finalDiscount = baseDiscount + premiumDiscount;
        System.out.println("Premium Discount Applied: $" + finalDiscount);
        return finalDiscount;
    }
    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Membership: " + membershipTier);
        System.out.println("Cashback: $" + cashback);
    }
}
public class EcommerceApp {
    public static void main(String[] args) {
        PremiumOrder order = new PremiumOrder("ORD123", 5000, "Gold");
        System.out.println("\nOrder Details:");
        order.displayOrder();
        System.out.println("\nTotal Discount: $" + order.calculateDiscount());
    }
}