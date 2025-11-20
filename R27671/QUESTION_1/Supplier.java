package R27671.QUESTION_1;
public class Supplier extends Category {

    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String createDate, String updateDate, String warehouseName, String location,
            String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
            String supplierPhone) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSuplierName(){
        return supplierName;
    }

    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }

        public String getSuplierEmail(){
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail){
        this.supplierEmail = supplierEmail;
    }

        public String getSuplierPhone(){
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone){
        this.supplierPhone = supplierPhone;
    }

    public void getSupplierInfo(){
        getCategoryInfo();
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Supplier Email: " + supplierEmail);
        System.out.println("Supplier Phone: " + supplierPhone);
        
    }

    
}
