package R27671.QUESTION_3;

public class Payment extends TaxAssessment {
    private String paymentDate; // YYYY-MM-DD
    private double paymentAmount; // > 0

    public Payment(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeTIN,
                   String declarationMonth, double totalIncome,
                   String assessmentDate, double assessedTax,
                   String paymentDate, double paymentAmount) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);
        setPaymentDate(paymentDate);
        setPaymentAmount(paymentAmount);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || !paymentDate.matches("\\d{4}-\\d{2}-\\d{2}"))
            throw new TaxDataException("paymentDate must be YYYY-MM-DD");
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        if (paymentAmount <= 0) throw new TaxDataException("paymentAmount must be > 0");
        this.paymentAmount = paymentAmount;
    }
}
