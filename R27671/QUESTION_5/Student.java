
package R27671.QUESTION_5;
public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;
    public Student(int id, java.util.Date createdDate, java.util.Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone);
        if (studentName == null || studentName.trim().isEmpty()) throw new IllegalArgumentException("Student name cannot be empty");
        if (studentID == null || studentID.trim().isEmpty()) throw new IllegalArgumentException("Student ID cannot be empty");
        if (age <= 0) throw new IllegalArgumentException("Age must be > 0");
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }
    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }
}