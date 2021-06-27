package io.amey;

import java.util.ArrayList;
import java.util.List;

import io.amey.Task.State;

public class App 
{
    public static void main( String[] args )
    {
        List<Task> toDoList = new ArrayList<>();
        toDoList.add(new Task(1,"Buy milk","No desc reqd",State.BACKLOG));
        toDoList.add(new Task(2,"Apples","4 apples",State.BACKLOG));
        toDoList.add(new Task(3,"Book","The book thief",State.BACKLOG));

        System.out.println("You have "+toDoList.size()+" ToDO's today.");
        for (Task task : toDoList) {
            System.out.println(task.toString());
        }
       
    }
}
