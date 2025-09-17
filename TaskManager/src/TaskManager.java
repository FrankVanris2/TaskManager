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

    public void removeTask(String description) {
        listOfTasks.removeIf(task -> Objects.equals(task.getDescription(), description));
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
        System.out.println("DESCRIPTION: " + task.getDescription() + ", " + "PRIORITY: " +
                task.getPriority() + ", " + "COMPLETED: " + task.isCompleted());
    }
}
