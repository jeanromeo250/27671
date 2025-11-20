package R27671.QUESTION_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator v = new InputValidator(sc);

        while (true) {
            try {
                int id = v.readPositiveInt("Entity ID: ");
                String created = v.readDate("Created date (YYYY-MM-DD): ");
                String updated = v.readDate("Updated date (YYYY-MM-DD): ");

                String authorityName = v.readNonEmptyString("Tax Authority Name: ");
                String region = v.readNonEmptyString("Region: ");
                String email = v.readNonEmptyString("Contact Email: ");

                String categoryName = v.readNonEmptyString("Tax Category Name: ");
                double rate = v.readPositiveDouble("Rate (e.g., 0.15): ");
                String code = v.readNonEmptyString("Category Code (>=3 chars): ");

                String tin = v.readTIN("Taxpayer TIN (9 digits): ");
                String taxpayerName = v.readNonEmptyString("Taxpayer Name: ");
                String address = v.readNonEmptyString("Taxpayer Address: ");

                String employerName = v.readNonEmptyString("Employer Name: ");
                String employerTIN = v.readTIN("Employer TIN (9 digits): ");
                String contact = v.readPhone("Employer Contact (10 digits): ");

                String employeeName = v.readNonEmptyString("Employee Name: ");
                double salary = v.readPositiveDouble("Employee Salary: ");
                String employeeTIN = v.readTIN("Employee TIN (9 digits): ");

                String declarationMonth = v.readMonth("Declaration Month (YYYY-MM): ");
                double totalIncome = v.readNonNegativeDouble("Total Income: ");

                String assessmentDate = v.readDate("Assessment Date (YYYY-MM-DD): ");
                double assessedTax = v.readNonNegativeDouble("Assessed Tax: ");

                String paymentDate = v.readDate("Payment Date (YYYY-MM-DD): ");
                double paymentAmount = v.readPositiveDouble("Payment Amount: ");

                String receiptNo = v.readNonEmptyString("Receipt Number: ");
                double credits = v.readNonNegativeDouble("Credits: ");

                TaxRecord record = new TaxRecord(id, created, updated, authorityName, region, email,
                        categoryName, rate, code, tin, taxpayerName, address,
                        employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                        declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount,
                        receiptNo, credits);

                System.out.println("\n--- Tax Record ---");
                System.out.println("Receipt: " + record.getReceiptNo());
                System.out.println("Taxpayer: " + record.getTaxpayerName() + " (TIN: " + record.getTin() + ")");
                System.out.println("Employer: " + record.getEmployerName());
                System.out.println("Employee: " + record.getEmployeeName() + " Salary: " + record.getSalary());
                System.out.println("Computed Tax: " + record.getTotalTax());
                System.out.println("Payment Amount: " + record.getPaymentAmount());

                break; // exit after successful run
            } catch (TaxDataException ex) {
                System.err.println("Validation error: " + ex.getMessage());
                System.out.println("Please re-enter the data.\n");
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage());
                ex.printStackTrace();
                break;
            }
        }

        sc.close();
    }
}
