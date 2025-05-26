package taskOVer;

import java.util.ArrayList;
import java.util.Scanner;

class Data{
	public String title;
	public String status;
	public String urgency;
	public String desc;
	
	public Data(String title, int urgency, String desc) {
		this.title = title;
		this.status = "Not Done";
		if (urgency == 1) {
			this.urgency = "Low";
		} else if (urgency == 2) {
			this.urgency = "Medium";
		} else if (urgency == 3) {
			this.urgency = "High";
		}
		this.desc = desc;
	}
}

public class main {
	static ArrayList<Data> datalist = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int choice = 0;
		do {
			System.out.println("	taskOVer	");
			System.out.println("---------------------------");
			System.out.println("1. View To-Do List");
			System.out.println("2. Add Task");
			System.out.println("3. Mark Task as Done");
			System.out.println("4. Edit Task");
			System.out.println("5. Exit");
			System.out.print(">> ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Please enter a valid number.");
				choice = 0;
			}
			sc.nextLine();
			
			switch (choice) {
			case 1:
				ViewList();
				break;
			
			case 2:
				AddTask();
				break;
				
			case 3:
				MarkTask();
				break;
				
			case 4:
				EditTask();
				break;
				
			case 5:
				System.out.println("	taskOVer	");
				System.out.println("---------------------------");
				System.out.println("	Get More Things Done and Save More Time");
				System.out.println("Exiting...");
				break;
			
			default:
				System.out.println("Invalid choice, please try again.");
				break;
			}
			
			if (choice != 5) {
				System.out.println("Press ENTER to continue...");
				sc.nextLine();
			}
		} while (choice != 5);
		
	}
	
	public static void ViewList() {
		if (datalist.isEmpty()) {
			System.out.println("Your To-Do List is empty!");
		} else {
			System.out.println("Your To-Do List:");
			System.out.println("---------------------------");
			int k = 1;
			for (Data dt : datalist) {
				System.out.println(k + ".	" + dt.title + 
						" [" + dt.status + "]" + 
						" - Urgency: " + dt.urgency + 
						"\n	Description: " + dt.desc);
				k++;
			}
			System.out.println("");
		}
	}
	
	public static void AddTask() {
		ViewList();
		System.out.println("");
		System.out.print("Enter the task you want to add [0 to cancel]: ");
		String title = sc.nextLine();
		if (title.equals("0")) {
			System.out.println("Add task canceled");
		} else {
			System.out.print("Enter a description for this task: ");
			String desc = sc.nextLine();
			int urgency;
			do {
				System.out.print("Enter urgency level [1: Low, 2: Medium, 3: High]: ");
				urgency = sc.nextInt();
				sc.nextLine();
			} while (urgency < 1 || urgency > 3);
			datalist.add(new Data(title, urgency, desc));
			System.out.println("Task \"" + title + "\" successfully added!");
		}
	}
	
	public static void MarkTask() {
		ViewList();
		if (!datalist.isEmpty()) {
			System.out.print("Enter the number of the task to mark as done [0 to exit]: ");
			int numberList = sc.nextInt();
			sc.nextLine();
			if (numberList > datalist.size() || numberList < 0) {
				System.out.println("Invalid Task Number.");
			} else if (numberList == 0) {
				System.out.println("Mark task canceled");
			} else {
				Data task = datalist.get(numberList - 1);
                task.status = "Done";
                System.out.println("Task" + task.title + "marked as done");
			}
		}
	}
	
	public static void EditTask() {
		ViewList();
		if (!datalist.isEmpty()) {
			System.out.print("Enter the number of the task you want to edit[0 to exit]: ");
			int numberList = sc.nextInt();
			sc.nextLine();
			if (numberList > datalist.size() || numberList < 0) {
				System.out.println("Invalid Task Number.");
			} else if (numberList == 0) {
				System.out.println("Edit task canceled");
			} else {
				Data editTask = datalist.get(numberList - 1);
                int editChoice = 0;
                
				do {
					System.out.println("Editing Task: " + editTask.title);
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Description");
					System.out.println("3. Edit Urgency Level");
					System.out.print("Enter your choice: ");
					editChoice = sc.nextInt();
					sc.nextLine();
				} while (editChoice < 1 || editChoice > 3);
				
				switch (editChoice) {
				case 1:
					System.out.print("Enter new name: ");
					editTask.title = sc.nextLine();
					break;
				case 2:
					System.out.print("Enter new description: ");
					editTask.desc = sc.nextLine();
					break;
				case 3:
					System.out.print("Enter new urgency level [1: Low, 2: Medium, 3: High]: ");
					int urgency = sc.nextInt();
					sc.nextLine();
					if (urgency == 1) {
						editTask.urgency = "Low";
					} else if (urgency == 2) {
						editTask.urgency = "Medium";
					} else if (urgency == 3) {
						editTask.urgency = "High";
					}
					break;
				}
				System.out.println("Task update successfully.");
			}
		}
	}
}
