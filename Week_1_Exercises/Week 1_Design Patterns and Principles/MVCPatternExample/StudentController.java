package mvcPattern;

public class StudentController {
    private Student student;
    private StudentView view;

    // Constructor
    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    // Method to set student name
    public void setStudentName(String name) {
        student.setName(name);
    }

    // Method to get student name
    public String getStudentName() {
        return student.getName();
    }

    // Method to set student ID
    public void setStudentId(int id) {
        student.setId(id);
    }

    // Method to get student ID
    public int getStudentId() {
        return student.getId();
    }

    // Method to set student grade
    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    // Method to get student grade
    public String getStudentGrade() {
        return student.getGrade();
    }

    // Method to update view
    public void updateView() {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}

