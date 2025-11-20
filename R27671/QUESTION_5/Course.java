package R27671.QUESTION_5;
public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;
    public Course(int id, java.util.Date createdDate, java.util.Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);
        if (courseName == null || courseName.trim().isEmpty()) throw new IllegalArgumentException("Course name cannot be empty");
        if (courseCode == null || courseCode.trim().isEmpty()) throw new IllegalArgumentException("Course code cannot be empty");
        if (credits <= 0) throw new IllegalArgumentException("Credits must be > 0");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
}