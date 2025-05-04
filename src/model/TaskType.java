
package model;


public class TaskType {

    public static final String[] TYPES = {"Code", "Test", "Design", "Review"};

    public static String getTaskTypeName(int id) {
        return (id >= 1 && id <= TYPES.length) ? TYPES[id - 1] : "Unknow.";
    }
}
