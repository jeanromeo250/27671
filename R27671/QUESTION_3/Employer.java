package R27671.QUESTION_3;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN; // 9 digits
    private String contact; // 10-digit phone

    public Employer(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        setEmployerName(employerName);
        setEmployerTIN(employerTIN);
        setContact(contact);
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        if (employerName == null || employerName.trim().isEmpty()) throw new TaxDataException("employerName cannot be empty");
        this.employerName = employerName;
    }

    public String getEmployerTIN() {
        return employerTIN;
    }

    public void setEmployerTIN(String employerTIN) {
        if (employerTIN == null || !employerTIN.matches("\\d{9}")) throw new TaxDataException("employerTIN must be 9 digits");
        this.employerTIN = employerTIN;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || !contact.matches("\\d{10}")) throw new TaxDataException("contact must be 10 digits");
        this.contact = contact;
    }
}
