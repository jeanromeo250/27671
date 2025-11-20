package R27671.QUESTION_1; 

public class Warehouse  extends Entity{

   

    private String wareHouseName;
    private String location;
    private String contactNumber;

   public Warehouse(int id, String createDate, String updateDate, String wareHouseName, String location,
       String contactNumber) {
    super(id, createDate, updateDate);
    this.wareHouseName = wareHouseName;
    this.location = location;
    this.contactNumber = contactNumber;
   }

    public String getWareHouseName() {
         return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void getWarehouseInfo(){
        getEntityInfo();
        System.out.println("Warehouse Name: " + wareHouseName);
        System.out.println("Location: " + location);
        System.out.println("Contact Number: " + contactNumber);
    }

  






   



    
}
