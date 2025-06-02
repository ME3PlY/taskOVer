package TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Data;

public class MarkTask {
    public static void markTaskDone(ArrayList<Data> datalist, Scanner sc) {
        System.out.print("Enter the number of the task to mark as done [0 to exit]: ");
        int numberList = sc.nextInt();
        sc.nextLine();

        if (numberList == 0) {
            System.out.println("Mark task canceled");
            return;
        }

        if (numberList < 0 || numberList > datalist.size()) {
            System.out.println("Invalid Task Number.");
            return;
        }

        Data task = datalist.get(numberList - 1);
        task.setStatus("Done");
        System.out.println("Task " + task.getTitle() + " marked as done.");
    }
}