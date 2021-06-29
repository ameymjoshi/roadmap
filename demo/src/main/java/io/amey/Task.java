package io.amey;
public class Task {
    
    int id;
    String title;
    String desc;
    String state;
    
    public Task(int id, String title, String desc, String initState) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.state = initState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", desc=" + desc + ", state=" + state + "]";
    }
    
    

}
