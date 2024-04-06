import java.util.HashMap;
import java.util.Map;

public class RegisterCustomer {

    private static Map<String, Customer> customers;

    RegisterCustomer() {
        customers = new HashMap<>();
    }
   
    public boolean signUp(String email, String password) {

        if(customers.containsKey(email)) {
            System.out.println("user already Please login");
            return false;
        }

        Customer customer = new Customer(email, password);
        customers.put(email, customer);
        System.out.println("Successfully register");
        return true;
    }

    public boolean logIn(String email, String password) {

        if(!customers.containsKey(email)) {
            System.out.println("User doesn't exist");
        } else {
            Customer customer = customers.get(email);
            if(customer.getPassword().equals(password)) {
                return true;
            }
            System.out.println("Please enter valid password");
        }

        return false;
    }

    public Customer getCustomers(String email) {
        return customers.get(email);
    }
}
