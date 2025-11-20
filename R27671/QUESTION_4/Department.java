package R27671.QUESTION_4;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail, String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        setDeptName(deptName);
        setDeptCode(deptCode);
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) {
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("deptName cannot be empty");
        this.deptName = deptName;
    }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) {
        if (deptCode == null || deptCode.trim().length() < 3 || !deptCode.matches("[A-Za-z0-9]+")) throw new IllegalArgumentException("deptCode must be alphanumeric and >= 3 chars");
        this.deptCode = deptCode;
    }
}
