package R27671.QUESTION_1;


public class Inventory extends Sale {
	private int totalItems;
	private double stockValue;


	public Inventory(Sale base, int totalItems, double stockValue) {
		super((Purchase) base, base.getSaleDate(), base.getSoldQuantity(), base.getCustomerName());
		setTotalItems(totalItems);
		setStockValue(stockValue);
	}

	public Inventory(int id, String createdDate, String updatedDate, String warehouseName, String location,
			String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			String supplierPhone, String productName, Double unitPrice, int stockLimit,
			int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
			String saleDate, int soldQuantity, String customerName, int totalItems, double stockValue) {
		super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
				purchaseDate, purchasedQuantity, purchaseSupplierName, saleDate, soldQuantity, customerName);
		setTotalItems(totalItems);
		setStockValue(stockValue);
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		if (totalItems < 0) throw new IllegalArgumentException("totalItems must be >= 0");
		this.totalItems = totalItems;
	}

	public double getStockValue() {
		return stockValue;
	}

	public void setStockValue(double stockValue) {
		if (stockValue < 0) throw new IllegalArgumentException("stockValue must be >= 0");
		this.stockValue = stockValue;
	}

    public void getInventoryInfo() {
        getSaleInfo();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Stock Value: " + stockValue);
    }
}
