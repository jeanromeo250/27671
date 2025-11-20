package R27671.QUESTION_1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        InputValidator validator = new InputValidator(sc);

        try{
        System.out.println("--- Entity Information---- ");
        int eId=validator.readPositiveInt("Entity ID: ");
        String eCreated= validator.readNonEmptyString("Created Date |YYYY-MM-DD| : ");
        String eUpdated= validator.readNonEmptyString("CUpdatedDate |YYYY-MM-DD| : ");

        System.out.println("--- WareHouse Information---- ");

        String wName=validator.readNonEmptyString("WareHouse Name: ");
        String wLocation=validator.readNonEmptyString("WareHouse Location: ");
        String wContact=validator.read10DigitPhone("WareHouse Phone Number: ");

        System.out.println("--- WareHouse Information---- ");

        String cName=validator.readNonEmptyString("Category Name: ");
        String cCode=validator.readAlphanumericCode("Category Code: ");

        Category category= new Category(eId,eCreated,eUpdated,wName,wLocation,wContact,cName,cCode);

       System.out.println("\n--- Product Summary Information---");
       System.out.println("Entity ID: " + eId);
       System.out.println("Created Date: " + eCreated);
       System.out.println("Updated Date: " + eUpdated);
       System.out.println("WareHouse Name: " + category.getWareHouseName());
       System.out.println("WareHouse Location: " + category.getLocation());
       System.out.println("WareHouse Contact: " + category.getContactNumber());
       System.out.println("Category Name: " + category.getCategoryName());
       System.out.println("Category Code: " + category.getCategoryCode());

    // Supplier, Product and StockItem information
    System.out.println("\n--- Supplier Information ---");
    String supplierName = validator.readNonEmptyString("Supplier name: ");
    String supplierEmail = validator.readValidEmail("Supplier email: ");
    String supplierPhone = validator.read10DigitPhone("Supplier phone (10 digits): ");

    System.out.println("\n--- Product Information ---");
    String productName = validator.readNonEmptyString("Product name: ");
    double unitPrice = validator.readPositiveDouble("Unit price (> 0): ");
    int stockLimit = validator.readPositiveInt("Stock limit (>= 0): ");

    System.out.println("\n--- Stock Item Information ---");
    int quantityAvailable = validator.readPositiveInt("Quantity available (>= 0): ");
    int reorderLevel = validator.readPositiveInt("Reorder level (>= 0): ");

    StockItems stockItem = new StockItems(eId + 1, eCreated, eUpdated, wName, wLocation, wContact,
        cName, cCode, supplierName, supplierEmail, supplierPhone,
        productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);

    System.out.println("\n--- Stock Item Summary ---");
    stockItem.getStockItemInfo();

    // Purchase information (based on StockItem)
    System.out.println("\n--- Purchase Information ---");
    String purchaseDate = validator.readDate("Purchase date (YYYY-MM-DD): ");
    int purchasedQty = validator.readPositiveInt("Purchased quantity (> 0): ");

    Purchase purchase = new Purchase(stockItem, purchaseDate, purchasedQty, supplierName);
    System.out.println("\n--- Purchase Summary ---");
    purchase.getPurchaseInfo();

    // Sale information (based on Purchase)
    System.out.println("\n--- Sale Information ---");
    String saleDate = validator.readDate("Sale date (YYYY-MM-DD): ");
    int soldQty = validator.readPositiveInt("Sold quantity (> 0): ");
    String customer = validator.readNonEmptyString("Customer name: ");

    Sale sale = new Sale(purchase, saleDate, soldQty, customer);
    System.out.println("\n--- Sale Summary ---");
    sale.getSaleInfo();

    // Inventory (based on Sale)
    System.out.println("\n--- Inventory ---");
    int totalItems = stockItem.getQuantityAvailable();
    double stockValue = stockItem.getQuantityAvailable() * stockItem.getUnitPrice();
    Inventory inv = new Inventory(sale, totalItems, stockValue);
    inv.getInventoryInfo();

    // Generate report
    List<Sale> sales = new ArrayList<>();
    sales.add(sale);
    StockReport report = new StockReport(java.time.LocalDate.now().toString(), "Auto-generated report");
    report.generateReport(inv, sales);

        




        }catch (Exception ex) {
            System.err.println("Fatal Error: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            sc.close();
        }

    }
    
}
