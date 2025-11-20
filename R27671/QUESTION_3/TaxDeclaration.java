package R27671.QUESTION_3;

public class TaxDeclaration extends Employee {
    private String declarationMonth; // YYYY-MM
    private double totalIncome; // >= 0

    public TaxDeclaration(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                          String categoryName, double rate, String code,
                          String tin, String taxpayerName, String address,
                          String employerName, String employerTIN, String contact,
                          String employeeName, double salary, String employeeTIN,
                          String declarationMonth, double totalIncome) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN);
        setDeclarationMonth(declarationMonth);
        setTotalIncome(totalIncome);
    }

    public String getDeclarationMonth() {
        return declarationMonth;
    }

    public void setDeclarationMonth(String declarationMonth) {
        if (declarationMonth == null || !declarationMonth.matches("\\d{4}-\\d{2}"))
            throw new TaxDataException("declarationMonth must be YYYY-MM");
        this.declarationMonth = declarationMonth;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        if (totalIncome < 0) throw new TaxDataException("totalIncome must be >= 0");
        this.totalIncome = totalIncome;
    }
}
