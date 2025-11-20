package R27671.QUESTION_6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new IllegalArgumentException("createdDate required");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new IllegalArgumentException("updatedDate required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }

    public void setId(int id) { if (id <= 0) throw new IllegalArgumentException("id must be > 0"); this.id = id; }
    public void setCreatedDate(String createdDate) { if (createdDate == null || createdDate.trim().isEmpty()) throw new IllegalArgumentException("createdDate required"); this.createdDate = createdDate; }
    public void setUpdatedDate(String updatedDate) { if (updatedDate == null || updatedDate.trim().isEmpty()) throw new IllegalArgumentException("updatedDate required"); this.updatedDate = updatedDate; }
}
