package R27671.QUESTION_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator v = new InputValidator(sc);
        try {
            int id = v.readPositiveInt("Entity ID: ");
            String created = v.readDate("Created date |YYYY-MM-DD|: ");
            String updated = v.readDate("Updated date |YYYY-MM-DD|: ");

            String orgName = v.readNonEmptyString("Organization name: ");
            String address = v.readNonEmptyString("Organization address: ");
            String contactEmail = v.readNonEmptyString("Contact email: ");

            String deptName = v.readNonEmptyString("Department name: ");
            String deptCode = v.readNonEmptyString("Department code (alphanumeric >=3): ");

            String supplierName = v.readNonEmptyString("Supplier name: ");
            String supplierTIN = v.readTIN("Supplier TIN (9 digits): ");
            String supplierContact = v.readPhone10("Supplier contact (10 digits): ");

            String productName = v.readNonEmptyString("Product name: ");
            double unitPrice = v.readPositiveDouble("Unit price (>0): ");
            int quantity = v.readNonNegativeInt("Quantity (>=0): ");

            String poNumber = v.readNonEmptyString("PO Number: ");
            String orderDate = v.readDate("Order date (YYYY-MM-DD): ");
            double totalAmount = v.readPositiveDouble("Total amount (>0): ");

            String deliveryDate = v.readDate("Delivery date (YYYY-MM-DD): ");
            String deliveredBy = v.readNonEmptyString("Delivered by: ");

            String inspectorName = v.readNonEmptyString("Inspector name: ");
            String status;
            while (true) { status = v.readNonEmptyString("Inspection status (Passed/Failed): "); if (status.equalsIgnoreCase("Passed")||status.equalsIgnoreCase("Failed")) break; System.out.println("ERROR: status must be Passed or Failed"); }
            String remarks = v.readNonEmptyString("Remarks (or blank): ");

            List<Invoice> invoices = new ArrayList<>();
            while (true) {
                String invoiceNo = v.readNonEmptyString("Invoice No: ");
                double invoiceAmount = v.readPositiveDouble("Invoice amount (>0): ");
                Invoice inv = new Invoice(id, created, updated, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks, invoiceNo, invoiceAmount);
                invoices.add(inv);
                String more = v.readNonEmptyString("Add another invoice? (yes/no): ");
                if (!more.equalsIgnoreCase("yes")) break;
            }

            PurchaseOrder po = new PurchaseOrder(id, created, updated, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
            Delivery delivery = new Delivery(id, created, updated, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
            Inspection inspection = new Inspection(id, created, updated, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, supplierContact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);

            ProcurementReport report = new ProcurementReport(orderDate, "Procurement summary");
            double sum = report.calculateTotal(invoices);

            System.out.println("\n--- Procurement Report ---");
            System.out.println("Report Date: " + report.getReportDate());
            System.out.println("Organization: " + orgName);
            System.out.println("Department: " + deptName + " (" + deptCode + ")");
            System.out.println("Supplier: " + supplierName + " TIN:" + supplierTIN);
            System.out.println("PO: " + po.getPoNumber() + " Date: " + po.getOrderDate());
            System.out.println("Delivery: " + delivery.getDeliveryDate() + " by " + delivery.getDeliveredBy());
            System.out.println("Inspection: " + inspection.getInspectorName() + " Status: " + inspection.getStatus());
            System.out.println("Invoices count: " + invoices.size());
            System.out.println("Total of invoices: " + sum);

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
