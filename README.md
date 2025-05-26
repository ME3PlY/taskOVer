# taskOVer

You are tasked with building a To-Do list application named taskOVer to help improve your friend's productivity and time management. The application will allow users to manage their tasks effectively with a simple menu-driven system. You are assigned to make a program with the description below:

- The application presents a menu with 5 options:
  1.	View To-Do List
  2.	Add Task
  3.	Mark Task as Done
  4.	Edit Task
  5.	Exit

- Ask user to input menu choice between 1 and 5. 

- The application will validate user input and perform actions based on the menu choice. 

- Use try-catch to validate user input is the correct data type

- If the user chooses View To-Do List (Menu 1):
  o	Validate if there’s no task. If the list is empty, display: "Your To-Do list is empty!". 
  o	Otherwise, show each task in the list with their status (either "Done" or "Not Done")
  o	If the list is not empty, print the task’s name, done status, urgency level, and description.

- If the user chooses Add Task (Menu 2):
  o	Print all the task in the list. If there’s no task in the list, display “Your To-Do list is empty!”.
  o	Prompt the user to input the new task, inputing it’s name, description, and urgency level
  o	If the task is successfully added, display a confirmation message: "Task successfully added!".
  o	If the list is full, display: "To-Do list is full! Cannot add more tasks."

- If the user chooses Mark Task as Done (Menu 3):
  o	Print all the task in the list. If there’s no task in the list, display “Your To-Do list is empty!”.
  o	Prompt the user to input the number of the task they wish to mark as done.
  o	If the input is valid, mark the task as done and display a confirmation: "Task marked as done!".
  o	If the input is invalid (e.g., number out of range or list empty), display “Invalid task number”.

- If the user chooses Edit Task (Menu 4):
  o	Print all the task in the list. If there’s no task in the list, display “Your To-Do list is empty!”.
  o	Prompt the user to input the number of the task they wish to edit.
  o	If the input is valid, display the edit menu. Consisting of:
    1.	Edit Name
    2.	Edit Description
    3.	Edit Urgency Level
  o	For every option, it will ask the user to input the corresponding variable to edit
  o	If the input is invalid (e.g., number out of range or list empty), display “Invalid task number”.
- If the user chooses Exit (Menu 5):
  o	Ends the program

