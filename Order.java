class Order {

    private static int counter = 1;

    private int orderId;
    private int totalAmount;
    private String status;

    public Order(int totalAmount) {
        this.orderId = counter++;
        this.totalAmount = totalAmount;
        this.status = "Placed";
    }

    public int getOrderId() {
        return orderId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}