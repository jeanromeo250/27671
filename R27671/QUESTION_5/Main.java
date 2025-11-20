
package R27671.QUESTION_5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int id = InputValidator.getPositiveInt("Enter entity ID: ");
        Date createdDate = InputValidator.getDate("Enter created date (yyyy-MM-dd): ");
        Date updatedDate = InputValidator.getDate("Enter updated date (yyyy-MM-dd): ");
        String institutionName = InputValidator.getNonEmptyString("Enter institution name: ");
        String code = InputValidator.getCode("Enter institution code: ");
        String address = InputValidator.getNonEmptyString("Enter institution address: ");
        String departmentName = InputValidator.getNonEmptyString("Enter department name: ");
        String departmentHead = InputValidator.getNonEmptyString("Enter department head: ");
        String courseName = InputValidator.getNonEmptyString("Enter course name: ");
        String courseCode = InputValidator.getNonEmptyString("Enter course code: ");
        int credits = InputValidator.getCredits("Enter course credits: ");
        String instructorName = InputValidator.getNonEmptyString("Enter instructor name: ");
        String email = InputValidator.getEmail("Enter instructor email: ");
        String phone = InputValidator.getPhone("Enter instructor phone (10 digits): ");
        String studentName = InputValidator.getNonEmptyString("Enter student name: ");
        String studentID = InputValidator.getNonEmptyString("Enter student ID: ");
        int age = InputValidator.getPositiveInt("Enter student age: ");
        Date sessionDate = InputValidator.getDate("Enter session date (yyyy-MM-dd): ");
        String topic = InputValidator.getNonEmptyString("Enter session topic: ");
        String attendanceStudentID = InputValidator.getNonEmptyString("Enter attendance student ID: ");
        String sessionID = InputValidator.getNonEmptyString("Enter session ID: ");
        String status = InputValidator.getStatus("Enter attendance status (Present/Absent): ");
        Date requestDate = InputValidator.getDate("Enter leave request date (yyyy-MM-dd): ");
        String reason = InputValidator.getNonEmptyString("Enter leave reason: ");
        boolean approved = InputValidator.getBoolean("Is leave approved");
        Date reportDate = InputValidator.getDate("Enter report date (yyyy-MM-dd): ");
        int totalPresent = InputValidator.getPositiveInt("Enter total present: ");
        int totalAbsent = InputValidator.getPositiveInt("Enter total absent: ");
        int totalSessions = InputValidator.getPositiveInt("Enter total sessions: ");
        AttendanceSummary summary = new AttendanceSummary(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, attendanceStudentID, sessionID, status, requestDate, reason, approved, reportDate, totalPresent, totalAbsent, totalSessions);
        System.out.println("\n--- Attendance Summary Report ---");
        System.out.println("Report Date: " + summary.getReportDate());
        System.out.println("Total Present: " + summary.getTotalPresent());
        System.out.println("Total Absent: " + summary.getTotalAbsent());
        System.out.println("Total Sessions: " + summary.getTotalSessions());
        System.out.printf("Attendance Percentage: %.2f%%\n", summary.generateSummary());
    }
}