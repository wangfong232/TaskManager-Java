package bo;

//Day la noi thuc hiẹn nhiệm vụ 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import model.Task;

public class TaskBO {

    private List<Task> taskList = new ArrayList<>();
    private int currentID = 1;

    //add task
    public int addTask(int taskTypeID, String requirementName, Date date,
            double planFrom, double planTo, String assignee, String reviewer) throws Exception {

        double duration = planTo - planFrom;
        if (planFrom < 8.0 || planTo > 17.5 || duration <= 0 || duration > 8) {
            throw new Exception("Invalid time range");
        }

        Task task = new Task(currentID++, taskTypeID, requirementName, date, planFrom, planTo, assignee, reviewer);
        taskList.add(task);
        return task.getId();
    }

    //delete task
    public boolean deleteTask(String idStr) throws Exception {
        int id = Integer.parseInt(idStr);
        for (Task task : taskList) {
            if (task.getId() == id) {
                taskList.remove(task);
                return true;
            }
        }
        throw new Exception("Task ID not found.");
    }

    //getDataTasks
    public List<Task> getDataTask() {
        taskList.sort(Comparator.comparingInt((Task c) -> c.getId()));
        return taskList;
    }
}
