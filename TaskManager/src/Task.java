public record Task(String description, int priority, boolean isCompleted) {
    public Task markAsCompleted() {
        return new Task(this.description, this.priority, true);
    }

    public Task markAsUncompleted() {
        return new Task(this.description, this.priority, false);
    }
}
