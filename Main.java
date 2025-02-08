import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. View all tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter the task ID to remove: ");
                    int taskId = scanner.nextInt();
                    toDoList.removeTask(taskId);
                    break;
                case 3:
                    toDoList.viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}