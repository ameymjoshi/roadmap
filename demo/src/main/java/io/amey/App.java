package io.amey;

import io.amey.Task.State;

public class App {
    
    public static void main( String[] args )
    {
        TaskMongoDAO taskMongoDAO = new TaskMongoDAO();
        Task newTask = new Task(1, "Buy milk", "No desc reqd", "Backlog");
        taskMongoDAO.insertTask(newTask);
    }
}
