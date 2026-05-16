class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Encapsulation (getters)
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}