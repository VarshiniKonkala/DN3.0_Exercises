package dependencyInjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create a concrete implementation of CustomerRepository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Find a customer by ID
        Customer customer = customerService.getCustomerById(1);

        // Display the customer details
        System.out.println("Customer Details: " + customer);
    }
}

