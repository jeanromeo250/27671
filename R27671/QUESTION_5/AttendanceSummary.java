package R27671.QUESTION_5;
import java.util.Date;
public final class AttendanceSummary extends LeaveRequest {
    private Date reportDate;
    private int totalPresent;
    private int totalAbsent;
    private int totalSessions;
    public AttendanceSummary(int id, Date createdDate, Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, Date sessionDate, String topic, String attendanceStudentID, String sessionID, String status, Date requestDate, String reason, boolean approved, Date reportDate, int totalPresent, int totalAbsent, int totalSessions) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, attendanceStudentID, sessionID, status, requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
        this.totalSessions = totalSessions;
    }
    public Date getReportDate() { return reportDate; }
    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }
    public int getTotalSessions() { return totalSessions; }
    public double generateSummary() {
        if (totalSessions == 0) return 0.0;
        return (totalPresent * 100.0) / totalSessions;
    }
}