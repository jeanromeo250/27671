package R27671.QUESTION_4;

public class Inspection extends Delivery {
    private String inspectorName;
    private String status;
    private String remarks;

    public Inspection(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                      String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                      String productName, double unitPrice, int quantity,
                      String poNumber, String orderDate, double totalAmount,
                      String deliveryDate, String deliveredBy,
                      String inspectorName, String status, String remarks) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy);
        setInspectorName(inspectorName);
        setStatus(status);
        setRemarks(remarks);
    }

    public String getInspectorName() { return inspectorName; }
    public void setInspectorName(String inspectorName) {
        if (inspectorName == null || inspectorName.trim().isEmpty()) throw new IllegalArgumentException("inspectorName cannot be empty");
        this.inspectorName = inspectorName;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        if (status == null) throw new IllegalArgumentException("status cannot be null");
        String s = status.trim();
        if (!(s.equalsIgnoreCase("Passed") || s.equalsIgnoreCase("Failed"))) throw new IllegalArgumentException("status must be Passed or Failed");
        this.status = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = (remarks == null) ? "" : remarks; }
}
