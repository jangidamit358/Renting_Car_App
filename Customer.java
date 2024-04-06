import java.time.Instant;
import java.util.UUID;

class Customer {
    private String id;
    private String email;
    private String password;

    public Customer(String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
