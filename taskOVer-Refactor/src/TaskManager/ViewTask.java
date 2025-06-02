package TaskManager;

import java.util.ArrayList;
import Model.Data;

public class ViewTask {
    public static void viewTasks(ArrayList<Data> datalist) {
        if (datalist.isEmpty()) {
            System.out.println("Your To-Do List is empty!");
            return;
        }

        System.out.println("Your To-Do List:");
        System.out.println("---------------------------");

        for (int i = 0; i < datalist.size(); i++) {
            System.out.println(datalist.get(i).formatForDisplay(i + 1));
        }

        System.out.println();
    }
}
