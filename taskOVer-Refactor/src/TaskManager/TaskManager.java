package TaskManager;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Data;

public class TaskManager {
    private final ArrayList<Data> datalist = new ArrayList<>();
    private final Scanner sc;

    public TaskManager(Scanner sc) {
        this.sc = sc;
    }
    
    private boolean showTasksAndCheckEmpty() {
        ViewTask.viewTasks(datalist);
        if (datalist.isEmpty()) {
            return true;
        }
        return false;
    }

    public void viewTasks() {
        ViewTask.viewTasks(datalist);
    }

    public void addTask() {
        AddTask.addTask(datalist, sc);
    }

    public void markTaskDone() {
    	if (showTasksAndCheckEmpty()) return;
        MarkTask.markTaskDone(datalist, sc);
    }

    public void editTask() {
    	if (showTasksAndCheckEmpty()) return;
        EditTask.editTask(datalist, sc);
    }
}