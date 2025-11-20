package R27671.QUESTION_3;

public class TaxAssessment extends TaxDeclaration {
    private String assessmentDate; // YYYY-MM-DD
    private double assessedTax; // >= 0

    public TaxAssessment(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         String assessmentDate, double assessedTax) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        setAssessmentDate(assessmentDate);
        setAssessedTax(assessedTax);
    }

    public String getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(String assessmentDate) {
        if (assessmentDate == null || !assessmentDate.matches("\\d{4}-\\d{2}-\\d{2}"))
            throw new TaxDataException("assessmentDate must be YYYY-MM-DD");
        this.assessmentDate = assessmentDate;
    }

    public double getAssessedTax() {
        return assessedTax;
    }

    public void setAssessedTax(double assessedTax) {
        if (assessedTax < 0) throw new TaxDataException("assessedTax must be >= 0");
        this.assessedTax = assessedTax;
    }
}
