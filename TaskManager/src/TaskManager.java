import java.util.ArrayList;
import java.util.Objects;

public class TaskManager {
    private ArrayList<Task> listOfTasks = new ArrayList<Task>();

    public TaskManager() {

    }

    /* Necessary Class Methods */
    public void addTask(Task task) {
        listOfTasks.add(task);
    }

    public void markTaskCompleted(String description) {
        for (int i = 0; i < listOfTasks.size(); i++) {
            Task task = listOfTasks.get(i);
            // Using the conventional getter names for records.
            if (Objects.equals(task.description(), description) && !task.isCompleted()) {
                // Since records are immutable, we create a new instance with the updated state.
                Task completedTask = task.markAsCompleted();
                listOfTasks.set(i, completedTask);
                System.out.println("Task '" + description + "' marked as completed.");
                return;
            }
        }
        System.out.println("Task '" + description + "' not found or already completed.");
    }

    public void markTaskUncompleted(String description) {
        for (int i = 0; i < listOfTasks.size(); i++) {
            Task task = listOfTasks.get(i);
            // Using the conventional getter names for records.
            if (Objects.equals(task.description(), description) && task.isCompleted()) {
                // Since records are immutable, we create a new instance with the updated state.
                Task uncompletedTask = task.markAsUncompleted();
                listOfTasks.set(i, uncompletedTask);
                System.out.println("Task '" + description + "' marked as uncompleted.");
                return;
            }
        }
        System.out.println("Task '" + description + "' not found or already uncompleted.");
    }

    public void removeTask(String description) {
        listOfTasks.removeIf(task -> Objects.equals(task.description(), description));
    }

    public void listAllTasks() {
        System.out.println("---List Of Tasks: ---");
        for(Task task : listOfTasks) {
            printTask(task);
        }
        System.out.println("-------------------------");
    }

    public void listCompletedTasks() {
        System.out.println("---Completed Tasks: ---");
        for (Task task : listOfTasks) {
            if (task.isCompleted()) {
                printTask(task);
            }
        }
        System.out.println("-------------------------");
    }

    public void listPendingTasks() {
        System.out.println("---Pending Tasks: ---");
        for (Task task : listOfTasks) {
            if (!task.isCompleted()) {
                printTask(task);
            }
        }
        System.out.println("-------------------------");
    }

    private void printTask(Task task) {
        System.out.println("DESCRIPTION: " + task.description() + ", " + "PRIORITY: " +
                task.priority() + ", " + "COMPLETED: " + task.isCompleted());
    }
}
