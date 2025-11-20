package R27671.QUESTION_1;

public class StockItems extends Product {
    private int quantityAvailable; 
    private int reorderLevel; 

    public StockItems(int id, String createDate, String updateDate, String warehouseName, String location,
            String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
            String supplierPhone, String productName, Double unitPrice, int stockLimit,
            int quantityAvailable, int reorderLevel) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit);
        setQuantityAvailable(quantityAvailable);
        setReorderLevel(reorderLevel);
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        if (quantityAvailable < 0) {
            throw new IllegalArgumentException("quantityAvailable must be >= 0");
        }
        this.quantityAvailable = quantityAvailable;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel < 0) {
            throw new IllegalArgumentException("reorderLevel must be >= 0");
        }
        this.reorderLevel = reorderLevel;
    }

    public void getStockItemInfo() {
        getProductInfo();
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Reorder Level: " + reorderLevel);
    }
}
