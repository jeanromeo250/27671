package R27671.QUESTION_6;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;

    public Payroll(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double rssbContribution, double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
              employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
              basicPay, transportAllowance, housingAllowance, rssbContribution, payeTax, loanDeduction,
              overtimeHours, overtimeRate, bonus);
        computePayroll();
    }

    private void computePayroll() {
        double allowances = getTransportAllowance() + getHousingAllowance() + computeOvertimeAmount() + getBonus();
        this.grossSalary = getBasicPay() + allowances;
        this.totalDeductions = getRssbContribution() + getPayeTax() + getLoanDeduction();
        this.netSalary = grossSalary - totalDeductions;
    }

    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
}
