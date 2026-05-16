import java.util.*;

class ShoppingService {

    private ArrayList<Product> products = new ArrayList<>();

    public ShoppingService() {
        loadProducts();
    }

    private void loadProducts() {

        products.add(new Product("Shoes", 2000));
        products.add(new Product("Shirt", 1500));
        products.add(new Product("Watch", 3000));
        products.add(new Product("Bag", 2500));
        products.add(new Product("Phone", 50000));
        products.add(new Product("Laptop", 120000));
        products.add(new Product("Headphones", 4000));
        products.add(new Product("Charger", 1000));
        products.add(new Product("Keyboard", 3500));
        products.add(new Product("Mouse", 1500));
        products.add(new Product("Tablet", 30000));
        products.add(new Product("Speaker", 6000));
        products.add(new Product("Camera", 45000));
        products.add(new Product("Watch Ultra", 55000));
        products.add(new Product("Power Bank", 2500));
        products.add(new Product("USB Cable", 500));
        products.add(new Product("Monitor", 20000));
        products.add(new Product("Printer", 18000));
        products.add(new Product("Router", 4000));
        products.add(new Product("Smart TV", 90000));
    }

    // Show products with separator
    public void showProducts() {
        for (int i = 0; i < products.size(); i++) {
    
            Product p = products.get(i);
    
            System.out.println("ID: " + i);
            System.out.println("Name: " + p.getName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("-----------------------------");
        }
    }
    public Product getProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
}