package taskManagementSystem;
public class Test {
    public static void main(String[] args) {
        // Create a SinglyLinkedList instance
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Create some Task objects
        Task task1 = new Task(1, "Design Database", "In Progress");
        Task task2 = new Task(2, "Implement API", "Not Started");
        Task task3 = new Task(3, "Write Documentation", "Completed");

        // Add tasks to the list
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Traverse and display all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for Task with ID 2:");
        Task foundTask = taskList.searchTask(2);
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting Task with ID 1:");
        taskList.deleteTask(1);

        // Traverse and display all tasks after deletion
        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
