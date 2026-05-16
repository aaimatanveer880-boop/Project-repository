class Discount {
    private String code;
    private double discountPercent;

    public Discount(String code, double discountPercent) {
        this.code = code;
        this.discountPercent = discountPercent;
    }

    public String getCode() {
        return code;
    }

    public double applyDiscount(double price) {
        return price - (price * discountPercent / 100);
    }
}