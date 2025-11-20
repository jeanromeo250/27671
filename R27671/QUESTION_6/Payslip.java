package R27671.QUESTION_6;

public class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, String issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
              basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
              overtimeHours, overtimeRate, bonus);
        if (payslipNumber == null || payslipNumber.trim().isEmpty()) throw new IllegalArgumentException("payslipNumber required");
        if (issueDate == null || issueDate.trim().isEmpty()) throw new IllegalArgumentException("issueDate required");
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() { return payslipNumber; }
    public String getIssueDate() { return issueDate; }

    public void generatePayslip() {
        double rssb = getRssbContribution();
        double paye = getPayeTax();
        double gross = getGrossSalary();
        double net = getNetSalary();
        System.out.println("-------------------- PAYSLIP --------------------");
        System.out.println("Payslip No: " + payslipNumber + "    Issue Date: " + issueDate);
        System.out.println("Employee: " + getFullName() + " (ID: " + getEmployeeID() + ")");
        System.out.println("Position: " + getPosition());
        System.out.println("Organisation: " + getOrgName() + " | Dept: " + getDeptName());
        System.out.printf("Basic Pay: %.2f\n", getBasicPay());
        System.out.printf("Transport Allowance: %.2f\n", getTransportAllowance());
        System.out.printf("Housing Allowance: %.2f\n", getHousingAllowance());
        System.out.printf("Overtime: %.2f\n", computeOvertimeAmount());
        System.out.printf("Bonus: %.2f\n", getBonus());
        System.out.printf("Gross Salary: %.2f\n", gross);
        System.out.println("--- Deductions ---");
        System.out.printf("RSSB (5%%): %.2f\n", rssb);
        System.out.printf("PAYE: %.2f\n", paye);
        System.out.printf("Loan Deduction: %.2f\n", getLoanDeduction());
        System.out.printf("Total Deductions: %.2f\n", getTotalDeductions());
        System.out.printf("Net Salary: %.2f\n", net);
        System.out.println("-------------------------------------------------");
    }
}
