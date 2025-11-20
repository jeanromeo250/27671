package R27671.QUESTION_5;
import java.util.Date;
public class Entity {
    private int id;
    private Date createdDate;
    private Date updatedDate;
    public Entity(int id, Date createdDate, Date updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    public int getId() { return id; }
    public Date getCreatedDate() { return createdDate; }
    public Date getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(Date updatedDate) { this.updatedDate = updatedDate; }
}