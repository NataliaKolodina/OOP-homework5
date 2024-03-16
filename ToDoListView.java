// package homework.homework5;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise() {
        System.out.println("Выберете пункт меню: ");
        return scanner.nextInt();
    }

    public String takeTask() {
        System.out.println("Напишите задачу: ");
        scanner.nextLine(); 
        return scanner.nextLine(); 
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }   
}
