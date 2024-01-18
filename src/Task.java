public class Task {
    private int id;
    private String title;
    private String description;
    private String status;
    private static int generatorId = 1;

    public Task(String title, String description) {
        this.id = getUniqueId();
        this.title = title;
        this.description = description;
        this.status = "NEW";
    }

    private static int getUniqueId() {
        return generatorId++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
