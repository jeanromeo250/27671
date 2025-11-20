package R27671.QUESTION_5;
import java.util.Date;
public class LeaveRequest extends AttendanceRecord {
    private Date requestDate;
    private String reason;
    private boolean approved;
    public LeaveRequest(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String attendanceStudentID, String sessionID, String status, Date requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, attendanceStudentID, sessionID, status);
        if (reason == null || reason.trim().isEmpty()) throw new IllegalArgumentException("Reason cannot be empty");
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }
    public Date getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }
}