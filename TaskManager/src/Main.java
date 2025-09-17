//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("Finish Java project Phase 1", 1, true);
        Task task2 = new Task("Go for a run", 2, false);
        Task task3 = new Task("Buy groceries", 3, false);
        Task task4 = new Task("Read a book", 1, true);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        System.out.println("--- Initial State ---");
        taskManager.listAllTasks();

        System.out.println("--- Completed Tasks ---");
        taskManager.listCompletedTasks();

        System.out.println("--- Pending Task ---");
        taskManager.listPendingTasks();

        System.out.println("--- Removing 'Read a book' ---");
        taskManager.removeTask("Read a book");

        System.out.println("--- Final State After Removal ---");
        taskManager.listAllTasks();
    }
}