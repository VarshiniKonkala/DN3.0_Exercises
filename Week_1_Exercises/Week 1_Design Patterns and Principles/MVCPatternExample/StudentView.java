package mvcPattern;

public class StudentView {
    // Method to display student details
    public void displayStudentDetails(String studentName, int studentId, String studentGrade) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Grade: " + studentGrade);
    }
}

