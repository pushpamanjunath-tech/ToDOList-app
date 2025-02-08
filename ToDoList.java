import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
    private int nextTaskId;

    public ToDoList() {
        tasks = new ArrayList<>();
        nextTaskId = 1;
    }

    public void addTask(String description) {
        Task newTask = new Task(nextTaskId++, description);
        tasks.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    public void removeTask(int taskId) {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed: " + taskToRemove);
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}