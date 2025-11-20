package R27671.QUESTION_1;

public class Entity {
    private  int id;
    private  String createDate;
    private String updateDate;


    public Entity(int id, String createDate, String updateDate){
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }
    

    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id=id;
    }

    public String getCreateDate(){
        return createDate;

    }

    public void setCreateDate(String createDate ){
        this.createDate=createDate;
    }

    public String getUpdateDate(){
        return updateDate;
    }
    

    public void setUpdateDate(String updateDate){
        this.updateDate = updateDate;
    }

    public void getEntityInfo(){
        System.out.println("Entity ID: " + id);
        System.out.println("Created Date: " + createDate);
        System.out.println("Updated Date: " + updateDate);


    }
}
