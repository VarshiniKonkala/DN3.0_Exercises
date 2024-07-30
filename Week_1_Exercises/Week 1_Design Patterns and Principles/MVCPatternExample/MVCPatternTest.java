package mvcPattern;

public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a student model
        Student student = new Student("Varshini", 597, "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create a controller to manage student data and view
        StudentController controller = new StudentController(student, view);

        // Update the view
        controller.updateView();

        // Change student details
        controller.setStudentName("Harshini");
        controller.setStudentId(456);
        controller.setStudentGrade("A+");

        // Update the view with new details
        controller.updateView();
    }
}

