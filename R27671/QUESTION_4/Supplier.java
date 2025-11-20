package R27671.QUESTION_4;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                    String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        setSupplierName(supplierName);
        setSupplierTIN(supplierTIN);
        setContact(contact);
    }

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty()) throw new IllegalArgumentException("supplierName cannot be empty");
        this.supplierName = supplierName;
    }

    public String getSupplierTIN() { return supplierTIN; }
    public void setSupplierTIN(String supplierTIN) {
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}")) throw new IllegalArgumentException("supplierTIN must be 9 digits");
        this.supplierTIN = supplierTIN;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) {
        if (contact == null || !contact.matches("\\d{10}")) throw new IllegalArgumentException("contact must be 10 digits");
        this.contact = contact;
    }
}
