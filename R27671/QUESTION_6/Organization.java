package R27671.QUESTION_6;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("orgName required");
        if (orgCode == null || orgCode.trim().length() < 3) throw new IllegalArgumentException("orgCode must be >= 3 chars");
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("rssbNumber must be 8 digits");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("invalid email");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }

    public void setOrgName(String orgName) { if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("orgName required"); this.orgName = orgName; }
    public void setOrgCode(String orgCode) { if (orgCode == null || orgCode.trim().length() < 3) throw new IllegalArgumentException("orgCode must be >= 3 chars"); this.orgCode = orgCode; }
    public void setRssbNumber(String rssbNumber) { if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("rssbNumber must be 8 digits"); this.rssbNumber = rssbNumber; }
    public void setContactEmail(String contactEmail) { if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("invalid email"); this.contactEmail = contactEmail; }
}
