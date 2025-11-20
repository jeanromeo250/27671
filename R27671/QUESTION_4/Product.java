package R27671.QUESTION_4;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                   String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) throw new IllegalArgumentException("productName cannot be empty");
        this.productName = productName;
    }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) throw new IllegalArgumentException("unitPrice must be > 0");
        this.unitPrice = unitPrice;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("quantity must be >= 0");
        this.quantity = quantity;
    }
}
