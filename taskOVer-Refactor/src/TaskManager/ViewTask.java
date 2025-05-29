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
        int k = 1;
        for (Data dt : datalist) {
            System.out.println(k + ". " + dt.getTitle() + 
                " [" + dt.getStatus() + "]" +
                " - Urgency: " + dt.getUrgency() +
                "\n\tDescription: " + dt.getDesc());
            k++;
        }
        System.out.println();
    }
}
