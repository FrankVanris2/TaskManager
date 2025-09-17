public class Task {
    private String description;
    private boolean isCompleted;
    private int priority;

    // Constructor
    public Task(String description, int priority, boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    /* A Method that marks tasks as completed */
    public void markAsCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    /* My getter functions */
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getPriority() {
        return priority;
    }
}
