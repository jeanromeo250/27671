package R27671.QUESTION_1;
public class Sale extends Purchase {
	private String saleDate;
	private int soldQuantity;
	private String customerName;


	public Sale(Purchase base, String saleDate, int soldQuantity, String customerName) {
		super((StockItems) base, base.getPurchaseDate(), base.getPurchasedQuantity(), base.getSupplierName());
		setSaleDate(saleDate);
		setSoldQuantity(soldQuantity);
		setCustomerName(customerName);
	}

	public Sale(int id, String createdDate, String updatedDate, String warehouseName, String location,
			String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
			String supplierPhone, String productName, Double unitPrice, int stockLimit,
			int quantityAvailable, int reorderLevel, String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
			String saleDate, int soldQuantity, String customerName) {
		super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode,
				supplierName, supplierEmail, supplierPhone, productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
				purchaseDate, purchasedQuantity, purchaseSupplierName);
		setSaleDate(saleDate);
		setSoldQuantity(soldQuantity);
		setCustomerName(customerName);
	}

	public String getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(String saleDate) {
		if (saleDate == null || saleDate.trim().isEmpty())
			throw new IllegalArgumentException("saleDate cannot be null or empty");
		if (!saleDate.matches("\\d{4}-\\d{2}-\\d{2}"))
			throw new IllegalArgumentException("saleDate must be in YYYY-MM-DD format");
		this.saleDate = saleDate;
	}

	public int getSoldQuantity() {
		return soldQuantity;
	}

	public void setSoldQuantity(int soldQuantity) {
		if (soldQuantity <= 0) throw new IllegalArgumentException("soldQuantity must be > 0");
		this.soldQuantity = soldQuantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if (customerName == null || customerName.trim().isEmpty())
			throw new IllegalArgumentException("customerName cannot be empty");
		this.customerName = customerName;
	}

    public void getSaleInfo() {
        getPurchaseInfo();
        System.out.println("Sale Date: " + saleDate);
        System.out.println("Sold Quantity: " + soldQuantity);
        System.out.println("Customer Name: " + customerName);
    }
    
}
