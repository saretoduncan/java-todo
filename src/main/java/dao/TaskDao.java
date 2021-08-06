package dao;
import models.Task;
import java.util.List;

public  interface TaskDao {
    //list
    List<Task> getAll();
    //create
    void add(Task task);
    //Read
    Task findById(int id);
    //UPDATE
    void update(int id, String content);
    //DELETE
    void deleteById(int id);
    void clearAllTasks();
}