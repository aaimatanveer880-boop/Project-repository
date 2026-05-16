import java.util.ArrayList;

class DiscountService {
    private ArrayList<Discount> discounts = new ArrayList<>();

    public DiscountService() {
        // Predefined coupons
        discounts.add(new Discount("SAVE10", 10));
        discounts.add(new Discount("SAVE20", 20));
    }

    public double applyCoupon(String code, double price) {
        for (Discount d : discounts) {
            if (d.getCode().equalsIgnoreCase(code)) {
                double newPrice = d.applyDiscount(price);
                System.out.println("Coupon Applied! New Price: " + newPrice);
                return newPrice;
            }
        }
        System.out.println("Invalid Coupon!");
        return price;
    }
}