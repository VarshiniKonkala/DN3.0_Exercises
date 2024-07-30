package libraryManagementSystem;
import java.util.Arrays;

public class BinarySearch {
    public static Book binarySearch(Book[] books, String targetTitle) {
        // Sort the books array based on title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books[mid];

            int cmp = midBook.getTitle().compareToIgnoreCase(targetTitle);
            if (cmp == 0) {
                return midBook;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    }
}
