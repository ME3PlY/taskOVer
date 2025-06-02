
package TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Data;
import Model.UrgencyLevel;

public class EditTask {
    public static void editTask(ArrayList<Data> datalist, Scanner sc) {
    	ViewTask.viewTasks(datalist);

        if (datalist.isEmpty()) {
            return;
        }

        System.out.print("Enter the number of the task you want to edit [0 to exit]: ");
        int numberList = sc.nextInt();
        sc.nextLine();

        if (numberList == 0) {
            System.out.println("Edit task canceled");
            return;
        }

        if (numberList < 0 || numberList > datalist.size()) {
            System.out.println("Invalid Task Number.");
            return;
        }

        Data editTask = datalist.get(numberList - 1);
        int editChoice = getEditChoice(sc, editTask);
        performEditAction(editChoice, editTask, sc);
        
        System.out.println("Task update successfully.");
	}
    
    private static int getEditChoice(Scanner sc, Data task) {
        int choice = 0;
        do {
            System.out.println("Editing Task: " + task.getTitle());
            System.out.println("1. Edit Name");
            System.out.println("2. Edit Description");
            System.out.println("3. Edit Urgency Level");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice < 1 || choice > 3);
        return choice;
    }
    
    private static void performEditAction(int editChoice, Data editTask, Scanner sc) {
        switch (editChoice) {
            case 1:
                editName(editTask, sc);
                break;
            case 2:
                editDescription(editTask, sc);
                break;
            case 3:
                editUrgency(editTask, sc);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    
    private static void editName(Data task, Scanner sc) {
        System.out.print("Enter new name: ");
        task.setTitle(sc.nextLine());
    }

    private static void editDescription(Data task, Scanner sc) {
        System.out.print("Enter new description: ");
        task.setDesc(sc.nextLine());
    }

    private static void editUrgency(Data task, Scanner sc) {
        UrgencyLevel newUrgency = null;
        do {
            System.out.print("Enter new urgency level [1: Low, 2: Medium, 3: High]: ");
            try {
                newUrgency = UrgencyLevel.fromInt(sc.nextInt());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                sc.nextLine();
                newUrgency = null;
            }
        } while (newUrgency == null);
        task.setUrgency(newUrgency);
    }
}