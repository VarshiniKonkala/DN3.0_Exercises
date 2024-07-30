package dependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // In a real application, this would query a database or another data source.
        // Here, I am simulating this with a simple example.
        return new Customer(id, "Varshini", "abc@gmail.com");
    }
}

