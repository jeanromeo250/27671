package R27671.QUESTION_6;

public class PayrollPeriod extends Employee {
    private int month;
    private int year;
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, String startDate, String endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) throw new IllegalArgumentException("month must be 1-12");
        if (year < 2000) throw new IllegalArgumentException("year must be >= 2000");
        if (startDate == null || startDate.trim().isEmpty()) throw new IllegalArgumentException("startDate required");
        if (endDate == null || endDate.trim().isEmpty()) throw new IllegalArgumentException("endDate required");
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMonth() { return month; }
    public int getYear() { return year; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }
}
