package libraryManagementSystem;
public class Test {
    public static void main(String[] args) {
        // Create some Book objects
        Book[] books = {
            new Book(1, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "Moby-Dick", "Herman Melville")
        };

        // Test Linear Search
        System.out.println("Linear Search Result:");
        Book foundBookLinear = LinearSearch.linearSearch(books, "1984");
        if (foundBookLinear != null) {
            System.out.println(foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        // Test Binary Search
        System.out.println("\nBinary Search Result:");
        Book foundBookBinary = BinarySearch.binarySearch(books, "1984");
        if (foundBookBinary != null) {
            System.out.println(foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
