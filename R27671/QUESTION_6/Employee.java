package R27671.QUESTION_6;

public class Employee extends Department {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        if (employeeID < 1000) throw new IllegalArgumentException("employeeID must be >= 1000");
        if (fullName == null || fullName.trim().isEmpty()) throw new IllegalArgumentException("fullName required");
        if (position == null || position.trim().isEmpty()) throw new IllegalArgumentException("position required");
        if (baseSalary <= 0) throw new IllegalArgumentException("baseSalary must be > 0");
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public int getEmployeeID() { return employeeID; }
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public boolean isRssbRegistered() { return rssbRegistered; }

    public void setEmployeeID(int employeeID) { if (employeeID < 1000) throw new IllegalArgumentException("employeeID must be >= 1000"); this.employeeID = employeeID; }
    public void setFullName(String fullName) { if (fullName == null || fullName.trim().isEmpty()) throw new IllegalArgumentException("fullName required"); this.fullName = fullName; }
    public void setPosition(String position) { if (position == null || position.trim().isEmpty()) throw new IllegalArgumentException("position required"); this.position = position; }
    public void setBaseSalary(double baseSalary) { if (baseSalary <= 0) throw new IllegalArgumentException("baseSalary must be > 0"); this.baseSalary = baseSalary; }
    public void setRssbRegistered(boolean rssbRegistered) { this.rssbRegistered = rssbRegistered; }
}
