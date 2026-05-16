import java.util.*;

class AuthService {

    private ArrayList<User> users = new ArrayList<>();

    // Signup
    public void signup(String username, String password) {

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                System.out.println("User already exists!");
                return;
            }
        }

        users.add(new User(username, password));
        System.out.println("Signup successful!");
    }

    // Login
    public boolean login(String username, String password) {

        for (User u : users) {
            if (u.getUsername().equals(username) &&
                u.getPassword().equals(password)) {

                System.out.println("Login successful!");
                return true;
            }
        }

        System.out.println("Invalid credentials!");
        return false;
    }
}