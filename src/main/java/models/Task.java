package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Task {

    private String description;

    private boolean completed;
    private LocalDateTime createdAt;
    private int id;

    public Task(String description){
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();

    }
    @Override
    public boolean equals(Object o){
        if (this==o) return  true;
        else if(!(o instanceof Task)) return false;
        Task task= (Task) o;
        return getCompleted()== task.getCompleted()&& getId()== task.id && Objects.equals(getDescription(),task.getDescription());

    }
    @Override
    public int hashCode(){
        return Objects.hash(getCompleted(),getDescription(),getId());
    }

    public String getDescription() {
        return description;
    }



    public boolean getCompleted(){
        return this.completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }



    public void update(String content) {
        this.description = content;
    }


}
