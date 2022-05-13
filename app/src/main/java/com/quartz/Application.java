package com.quartz;

import com.quartz.classes.TaskManager;
import com.quartz.classes.ToDoCRD;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        List<ToDoCRD> toDoList = new LinkedList<>();
        TaskManager taskManager = new TaskManager(toDoList);
        boolean loop = true;

        Scanner responses = new Scanner(System.in);
        String answers;

        System.out.println("Welcome to ZG To Do List");

        while (loop){
            System.out.println("[1] Create a New Task ");
            System.out.println("[2] List all Tasks ");
            System.out.println("[3] Delete single Task ");
            System.out.println("[4] Exit ");
            System.out.println("");
            System.out.println("Select your option[1-4] ");
            answers = responses.nextLine();

            switch (answers){
                case "1":

                    ToDoCRD task;
                    task = taskManager.newTask();
                    taskManager.createTask(toDoList, task);

                    break;
                case "2":

                    String[] stringList= taskManager.showList(toDoList);
                    for (int i = 0; i< stringList.length; i++){
                        System.out.println("ID: "+i+" - " + stringList[i]);
                }
                    System.out.println(stringList);
                    break;
                case "3":
                    Scanner value = new Scanner(System.in);
                    int id;

                    System.out.println("Select Task ID you want to delete");
                    id = value.nextInt();
                    taskManager.deleteTask(toDoList,id);
                    break;
                case "4":
                    loop = false;
                    break;
            }
        }



    }

}
