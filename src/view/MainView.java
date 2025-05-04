package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.Task;
import model.TaskType;
import utils.Validation;

public class MainView {

    public static Scanner sc = new Scanner(System.in);
    public static TaskController controller = new TaskController();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=============Task program=============");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. exit");
            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addTaskView();
                    break;
                case "2":
                    deleteTaskView();
                    break;
                case "3":
                    showTaskView();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void addTaskView() {
        try {
            System.out.println("Task Types: ");
            for (int i = 0; i < TaskType.TYPES.length; i++) {
                System.out.println((i + 1) + ". " + TaskType.TYPES[i]);
            }

            int taskType = Validation.getIntRange("Enter Task Type (1-4): ", 1, 4);
            String requirementName = Validation.getNonEmptyString("Enter Requirement Name: ");

            System.out.println("Enter Date (dd-MM-yyyy): ");
            Date date = Validation.getDate();

            double planFrom = Validation.getDoubleRange("Enter plan From (e.g., 8.0): ", 8.0, 17.5);
            double planTo = Validation.getDoubleRange("Enter plan To (e.g., 10.5): ", 8.0, 17.5);

            String assignee = Validation.getNonEmptyString("Enter Assignee: ");
            String reviewer = Validation.getNonEmptyString("Enter Reviewer: ");

            controller.addTask(taskType, requirementName, date, planFrom, planTo, assignee, reviewer);
            System.out.println("Task added successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void deleteTaskView() {
        try {
            String id = Validation.getNonEmptyString("Enter task ID to delete: ");
            controller.deleteTask(id);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void showTaskView() {
        List<Task> list = controller.getDataTask();
        if (list.isEmpty()) {
            System.out.println("No task to display.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("---------------------------Task--------------------------");
        System.out.printf("%-5s %-15s %-12s %-12s %-6s %-12s %-12s\n",
                "ID", "Name", "Type", "Date", "Time", "Assignee", "Reviewer");
        for (Task t : list) {
            System.out.println(t);
        }
    }
}
