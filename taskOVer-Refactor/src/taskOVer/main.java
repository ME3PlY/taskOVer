package taskOVer;
import java.util.Scanner;
import TaskManager.TaskManager;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager taskManager = new TaskManager(sc);

        int choice;
        do {
            printMenu();
            choice = getChoice(sc);
            handleChoice(choice, taskManager, sc);

            if (choice != 5) {
                System.out.println("Press ENTER to continue...");
                sc.nextLine();
            }
        } while (choice != 5);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("	taskOVer	");
        System.out.println("---------------------------");
        System.out.println("1. View To-Do List");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Done");
        System.out.println("4. Edit Task");
        System.out.println("5. Exit");
        System.out.print(">> ");
    }

    private static int getChoice(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return 0;
        }
    }

    private static void handleChoice(int choice, TaskManager taskManager, Scanner sc) {
        switch (choice) {
            case 1:
                taskManager.viewTasks();
                break;
            case 2:
                taskManager.addTask();
                break;
            case 3:
                taskManager.markTaskDone();
                break;
            case 4:
                taskManager.editTask();
                break;
            case 5:
                System.out.println("	taskOVer	");
                System.out.println("---------------------------");
                System.out.println("	Get More Things Done and Save More Time");
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
