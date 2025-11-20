package R27671.QUESTION_3;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    private double credits;

    public TaxRecord(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     String assessmentDate, double assessedTax,
                     String paymentDate, double paymentAmount,
                     String receiptNo, double credits) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        setReceiptNo(receiptNo);
        setCredits(credits);
        this.totalTax = computeTax();
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        if (receiptNo == null || receiptNo.trim().isEmpty()) throw new TaxDataException("receiptNo cannot be empty");
        this.receiptNo = receiptNo;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if (credits < 0) throw new TaxDataException("credits cannot be negative");
        this.credits = credits;
    }

    /**
     * computeTax = (salary * rate) - credits
     */
    public double computeTax() {
        double rate = getRate();
        double salary = getSalary();
        double tax = (salary * rate) - credits;
        if (tax < 0) tax = 0;
        return tax;
    }
}
