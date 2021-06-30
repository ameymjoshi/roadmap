package io.amey;

public class App {
    
    public static void main( String[] args )
    {
        TaskMongoDAO taskMongoDAO = new TaskMongoDAO();
        //Task newTask = new Task(3, "Call Sukhi", "Red pommes", "Backlog");
        //taskMongoDAO.insertTask(newTask);
        taskMongoDAO.getAllRecords();
    }
}
