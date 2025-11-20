package R27671.QUESTION_3;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        setCategoryName(categoryName);
        setRate(rate);
        setCode(code);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        if (categoryName == null || categoryName.trim().isEmpty())
            throw new TaxDataException("categoryName cannot be empty");
        this.categoryName = categoryName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate <= 0) throw new TaxDataException("rate must be > 0");
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || code.trim().length() < 3)
            throw new TaxDataException("code must be at least 3 characters");
        this.code = code;
    }
}
