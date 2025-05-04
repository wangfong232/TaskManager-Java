package controller;

import bo.TaskBO;
import java.util.Date;
import java.util.List;
import model.Task;

public class TaskController {

    private TaskBO taskBO = new TaskBO();

    public int addTask(int taskTypeID, String requirementName, Date date,
            double planFrom, double planTo, String assignee, String reviewer) throws Exception {
        return taskBO.addTask(taskTypeID, requirementName, date, planFrom, planTo, assignee, reviewer);

    }

    public void deleteTask(String idstr) throws Exception {
        if(taskBO.deleteTask(idstr)){
            System.out.println("Delete successfully.");
        }
    }

    public List<Task> getDataTask() {
        return taskBO.getDataTask();
    }
}
