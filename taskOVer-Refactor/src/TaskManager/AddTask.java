package TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Data;
import Model.UrgencyLevel;

public class AddTask {
    public static void addTask(ArrayList<Data> datalist, Scanner sc) {
        ViewTask.viewTasks(datalist);
        System.out.println("");

        System.out.print("Enter the task you want to add [0 to cancel]: ");
        String title = sc.nextLine();
        if (title.equals("0")) {
            System.out.println("Add task canceled");
            return;
        }

        System.out.print("Enter a description for this task: ");
        String desc = sc.nextLine();

        UrgencyLevel urgency = null;
        while (urgency == null) {
            System.out.print("Enter urgency level [1: Low, 2: Medium, 3: High]: ");
            try {
                urgency = UrgencyLevel.fromInt(sc.nextInt());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                sc.nextLine();
            }
        }

        datalist.add(new Data(title, urgency, desc));
        System.out.println("Task \"" + title + "\" successfully added!");
    }
}