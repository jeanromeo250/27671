package R27671.QUESTION_6;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("deptName required");
        if (deptCode == null || deptCode.trim().length() < 3) throw new IllegalArgumentException("deptCode must be >= 3 chars");
        if (managerName == null || managerName.trim().isEmpty()) throw new IllegalArgumentException("managerName required");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }

    public void setDeptName(String deptName) { if (deptName == null || deptName.trim().isEmpty()) throw new IllegalArgumentException("deptName required"); this.deptName = deptName; }
    public void setDeptCode(String deptCode) { if (deptCode == null || deptCode.trim().length() < 3) throw new IllegalArgumentException("deptCode must be >= 3 chars"); this.deptCode = deptCode; }
    public void setManagerName(String managerName) { if (managerName == null || managerName.trim().isEmpty()) throw new IllegalArgumentException("managerName required"); this.managerName = managerName; }
}
