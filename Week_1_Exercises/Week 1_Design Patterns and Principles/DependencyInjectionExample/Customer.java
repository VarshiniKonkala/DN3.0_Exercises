package dependencyInjection;

public class Customer {
    private int id;
    private String name;
    private String email;

    // Constructor
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // ToString method for easy display
    @Override
    public String toString() {
        return "\nId=" + id + ", \nName=" + name + ",\nEmail=" + email ;
    }
}

