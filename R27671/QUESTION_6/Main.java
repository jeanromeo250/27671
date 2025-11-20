package R27671.QUESTION_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator v = new InputValidator(sc);
        boolean completed = false;
        while (!completed) {
            try {
                System.out.println("--- Organization / Department / Employee Info ---");
                int id = v.readInt("Entity ID (>0): ", 1);
                String created = v.readNonEmpty("Created Date |YYYY-MM-DD|: ");
                String updated = v.readNonEmpty("Updated Date |YYYY-MM-DD|: ");
                String orgName = v.readNonEmpty("Organisation name: ");
                String orgCode = v.readOrgCode("Organisation code (>=3): ");
                String rssbNumber = v.readRssbNumber("Organisation RSSB (8 digits): ");
                String contactEmail = v.readEmail("Organisation email: ");
                String deptName = v.readNonEmpty("Department name: ");
                String deptCode = v.readDeptCode("Department code (>=3): ");
                String manager = v.readNonEmpty("Manager name: ");

                int empId = v.readEmployeeID("Employee ID (>=1000): ");
                String fullName = v.readNonEmpty("Full name: ");
                String position = v.readNonEmpty("Position: ");
                double baseSalary = v.readDouble("Base salary (>0): ", 0.01);
                boolean rssbRegistered = v.readBoolean("RSSB registered");

                int month = v.readMonth("Payroll month (1-12): ");
                int year = v.readYear("Payroll year (>=2000): ");
                String startDate = v.readNonEmpty("Period start date: ");
                String endDate = v.readNonEmpty("Period end date: ");

                double basicPay = v.readNonNegativeDouble("Basic pay (>=0): ");
                double transport = v.readNonNegativeDouble("Transport allowance (>=0): ");
                double housing = v.readNonNegativeDouble("Housing allowance (>=0): ");

                double expectedRssb = Math.round((basicPay * 0.05) * 100.0) / 100.0;
                System.out.println("Computed RSSB (5% of basic): " + expectedRssb);
                double rssbContribution = expectedRssb;

                System.out.println("Note: For this exercise PAYE is calculated as 10% of (gross - RSSB).\n");

                double overtimeHours = v.readNonNegativeDouble("Overtime hours (>=0): ");
                double overtimeRate = v.readNonNegativeDouble("Overtime rate (>=0): ");
                double bonus = v.readNonNegativeDouble("Bonus (>=0): ");

                double grossApprox = basicPay + transport + housing + (overtimeHours * overtimeRate) + bonus;
                double paye = Math.round(((grossApprox - rssbContribution) * 0.10) * 100.0) / 100.0;
                double loanDeduction = v.readNonNegativeDouble("Loan deduction (>=0): ");

                String payslipNo = v.readNonEmpty("Payslip number: ");
                String issueDate = v.readNonEmpty("Payslip issue date: ");

                Payslip p = new Payslip(id, created, updated, orgName, orgCode, rssbNumber, contactEmail,
                        deptName, deptCode, manager, empId, fullName, position, baseSalary, rssbRegistered,
                        month, year, startDate, endDate, basicPay, transport, housing,
                        rssbContribution, paye, loanDeduction, overtimeHours, overtimeRate, bonus,
                        payslipNo, issueDate);

                p.generatePayslip();
                completed = true;

            } catch (IllegalArgumentException ex) {
                System.err.println("Validation ERROR: " + ex.getMessage());
                System.out.println("Please correct the above error and try again.\n");
            } catch (Exception ex) {
                System.err.println("ERROR: " + ex.getMessage());
                System.out.println("An unexpected error occurred. Please try again.\n");
            }
        }
        sc.close();
    }
}
