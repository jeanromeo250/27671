package  R27671.QUESTION_1;

public class Category  extends Warehouse {
    
    private String categoryName;
    private String categoryCode;



    public Category(int id, String createDate, String updateDate, String warehouseName, String location,
            String contactNumber, String categoryName, String categoryCode) {
        super(id, createDate, updateDate, warehouseName, location, contactNumber);
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryCode() {
        return categoryCode;
    }
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void getCategoryInfo(){
        getWarehouseInfo();
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Code: " + categoryCode);
    }


    


    
}
