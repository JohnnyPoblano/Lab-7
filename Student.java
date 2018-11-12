/*
**  John G
**  CIS 131
**  Lab 7
*/

public class Student {

    // Fields
    private String studentID;
    private int grade;

    // No-arg constructor
    Student() {
        studentID = "";
        grade = 0;
    }

    // Constructor with args
    Student(String i, int g) {
        this.studentID = i;
        this.grade = g;
    }

    // Mutator methods
    public void setStudentID(String ID) {
        this.studentID = ID;
    }

    public void setGrade(int g) {
        this.grade = g;
    }

    // Accessor methods
    public String getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

}