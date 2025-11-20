package R27671.QUESTION_3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        setAuthorityName(authorityName);
        setRegion(region);
        setEmail(email);
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        if (authorityName == null || authorityName.trim().isEmpty())
            throw new TaxDataException("authorityName cannot be empty");
        this.authorityName = authorityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region == null || region.trim().isEmpty())
            throw new TaxDataException("region cannot be empty");
        this.region = region;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            throw new TaxDataException("email is invalid");
        this.email = email;
    }
}
