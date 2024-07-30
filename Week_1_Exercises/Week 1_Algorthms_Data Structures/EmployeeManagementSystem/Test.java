package employeeManagementSystem;
public class Test {
    public static void main(String[] args) {
        // Create an EmployeeManager instance with a capacity of 5
        EmployeeManager manager = new EmployeeManager(5);

        // Create some Employee objects
        Employee emp1 = new Employee(1, "Alice", "Developer", 60000);
        Employee emp2 = new Employee(2, "Bob", "Designer", 55000);
        Employee emp3 = new Employee(3, "Charlie", "Manager", 75000);
        Employee emp4 = new Employee(4, "David", "Analyst", 50000);
        Employee emp5 = new Employee(5, "Eve", "Tester", 45000);

        // Add employees to the manager
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);
        manager.addEmployee(emp4);
        manager.addEmployee(emp5);

        // Attempt to add one more employee to test capacity
        System.out.println("Adding employee beyond capacity:");
        manager.addEmployee(new Employee(6, "Frank", "HR", 40000)); // Should indicate array is full

        // Traverse and display all employees
        System.out.println("\nAll Employees:");
        manager.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for Employee with ID 3:");
        Employee searchedEmp = manager.searchEmployee(3);
        if (searchedEmp != null) {
            System.out.println(searchedEmp);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting Employee with ID 2:");
        manager.deleteEmployee(2);

        // Traverse and display all employees after deletion
        System.out.println("\nAll Employees After Deletion:");
        manager.traverseEmployees();

        // Try searching for the deleted employee
        System.out.println("\nSearching for Deleted Employee with ID 2:");
        searchedEmp = manager.searchEmployee(2);
        if (searchedEmp != null) {
            System.out.println(searchedEmp);
        } else {
            System.out.println("Employee not found
