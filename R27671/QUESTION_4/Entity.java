package R27671.QUESTION_4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) {
        if (createdDate == null || createdDate.trim().isEmpty()) throw new IllegalArgumentException("createdDate cannot be null");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new IllegalArgumentException("updatedDate cannot be null");
        this.updatedDate = updatedDate;
    }
}
