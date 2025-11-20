package R27671.QUESTION_4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) {
        if (orgName == null || orgName.trim().isEmpty()) throw new IllegalArgumentException("orgName cannot be empty");
        this.orgName = orgName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) throw new IllegalArgumentException("address cannot be empty");
        this.address = address;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("contactEmail is invalid");
        this.contactEmail = contactEmail;
    }
}
