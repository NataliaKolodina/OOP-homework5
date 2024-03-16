// package homework.homework5;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListModel {
    private Scanner scanner;
    private ArrayList<String> toDoList; 

    public ToDoListModel() {
        toDoList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void showToDoList() {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }

    public void addTask(String task) {
    toDoList.add(task);
    }    

    public ArrayList<String> getList() {
        return toDoList;
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.println(task);
        }
}
}

