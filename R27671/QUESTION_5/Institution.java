package R27671.QUESTION_5;
public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;
    public Institution(int id, java.util.Date createdDate, java.util.Date updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code == null || code.length() < 3) throw new IllegalArgumentException("Code must be at least 3 characters");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }
    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
}