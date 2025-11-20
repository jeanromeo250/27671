package R27671.QUESTION_5;
public class AttendanceRecord extends ClassSession {
    private String studentID;
    private String sessionID;
    private String status;
    public AttendanceRecord(int id, java.util.Date createdDate, java.util.Date updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead, String courseName, String courseCode, int credits, String instructorName, String email, String phone, String studentName, String studentID, int age, java.util.Date sessionDate, String topic, String attendanceStudentID, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        if (!"Present".equals(status) && !"Absent".equals(status)) throw new IllegalArgumentException("Status must be Present or Absent");
        this.studentID = attendanceStudentID;
        this.sessionID = sessionID;
        this.status = status;
    }
    public String getAttendanceStudentID() { return studentID; }
    public String getSessionID() { return sessionID; }
    public String getStatus() { return status; }
}