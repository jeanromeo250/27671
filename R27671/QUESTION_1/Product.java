package R27671.QUESTION_1;

public class Product extends Supplier {
   
    private  String productName;
    private Double unitPrice;
    private int stockLimit;

    public Product(int id, String createDate, String updateDate, String warehouseName, String location,
            String contactNumber, String categoryName, String categoryCode, String supplierName, String supplierEmail,
            String supplierPhone, String productName, Double unitPrice, int stockLimit) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber, categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone);
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }


            public String geproductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName ;

    }
        public Double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice){
        if(unitPrice <= 0){
            throw new IllegalArgumentException("unitPrice must be > 0");
        }
        this.unitPrice = unitPrice ;
    }
        public int getStockLimit(){
        return stockLimit;
    }
    public void setStockLimit(int stockLimit){
        if(stockLimit < 0){
            throw new IllegalArgumentException("stockLimit must be >= 0");
        }
        this.stockLimit = stockLimit ;
    }

    public void getProductInfo(){
        getSupplierInfo();
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Stock Limit: " + stockLimit);
        
    }
    




    
}
