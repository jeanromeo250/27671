package R27671.QUESTION_1;


public class Purchase extends StockItems {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierName;


    public Purchase(StockItems base, String purchaseDate, int purchasedQuantity, String supplierName) {
        super(base.getId(), base.getCreateDate(), base.getUpdateDate(), base.getWareHouseName(), base.getLocation(), base.getContactNumber(),
                base.getCategoryName(), base.getCategoryCode(), base.getSuplierName(), base.getSuplierEmail(), base.getSuplierPhone(),
                base.geproductName(), base.getUnitPrice(), base.getStockLimit(), base.getQuantityAvailable(), base.getReorderLevel());
        setPurchaseDate(purchaseDate);
        setPurchasedQuantity(purchasedQuantity);
        setSupplierName(supplierName);
    }


    public Purchase(int id, String createdDate, String updatedDate, String warehouseName, String location,
            String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
            String supplierPhone, String productName, Double unitPrice, int stockLimit,
            int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        setPurchaseDate(purchaseDate);
        setPurchasedQuantity(purchasedQuantity);
        setSupplierName(purchaseSupplierName);
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        if (purchaseDate == null || purchaseDate.trim().isEmpty())
            throw new IllegalArgumentException("purchaseDate cannot be null or empty");
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("purchasedQuantity must be > 0");
        this.purchasedQuantity = purchasedQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        if (supplierName == null || supplierName.trim().isEmpty())
            throw new IllegalArgumentException("supplierName cannot be empty");
        this.supplierName = supplierName;
    }

    public void getPurchaseInfo() {
        getStockItemInfo();
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Purchased Quantity: " + purchasedQuantity);
        System.out.println("Supplier Name: " + supplierName);
    }
    
}
