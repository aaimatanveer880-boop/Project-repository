import java.util.*;

class Cart {

    private ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
    }

    public void showCart() {
        for (Product p : items) {
            System.out.println(p.getName());
        }
    }

    // Replace Temp with Query (calculation moved here)
    public int getTotal() {
        int total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}