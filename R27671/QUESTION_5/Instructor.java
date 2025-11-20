package R27671.QUESTION_5;
import java.util.regex.Pattern;
public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;
    public Instructor(int id, java.util.Date createdDate, java.util.Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        if (instructorName == null || instructorName.trim().isEmpty()) throw new IllegalArgumentException("Instructor name cannot be empty");
        if (!isValidEmail(email)) throw new IllegalArgumentException("Invalid email");
        if (!isValidPhone(phone)) throw new IllegalArgumentException("Phone must be 10 digits");
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }
    private boolean isValidEmail(String email) {
        return email != null && Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }
    private boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}