package R27671.QUESTION_4;

public class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                         String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, String orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity);
        setPoNumber(poNumber);
        setOrderDate(orderDate);
        setTotalAmount(totalAmount);
    }

    public String getPoNumber() { return poNumber; }
    public void setPoNumber(String poNumber) {
        if (poNumber == null || poNumber.trim().isEmpty()) throw new IllegalArgumentException("poNumber cannot be empty");
        this.poNumber = poNumber;
    }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) {
        if (orderDate == null || orderDate.trim().isEmpty()) throw new IllegalArgumentException("orderDate cannot be null");
        this.orderDate = orderDate;
    }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) {
        if (totalAmount <= 0) throw new IllegalArgumentException("totalAmount must be > 0");
        this.totalAmount = totalAmount;
    }
}
