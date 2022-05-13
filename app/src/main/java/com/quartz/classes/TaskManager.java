package com.quartz.classes;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskManager implements ITaskManager {

    List<ToDoCRD> list;

    public TaskManager(List<ToDoCRD> list){
        this.list = list;
    }

    @Override
    public String[] showList(List<ToDoCRD> list) {
        int idx = 0;
        String[] listed = new String[list.size()];
        list.sort(Comparator.comparingInt(ToDoCRD::getPriority).reversed());


        for (ToDoCRD task: list) {
            listed[idx] = task.toString();
            idx++;

        }
        return listed;
    }

    @Override
    public ToDoCRD deleteTask(List<ToDoCRD> list, int id) {

        if (list.size() > id && list.size() >= 0) {

            System.out.println("Task of ID: " + id + " Deleted!!! ");
            return list.remove(id);
        } else {
            System.out.println("There is no task with specified ID");
            return null;
        }

    }

    @Override
    public List<ToDoCRD> createTask(List<ToDoCRD> list, ToDoCRD task) {

        list.add(task);
        list.sort(Comparator.comparingInt(ToDoCRD::getPriority).reversed());

        return list;
    }

    @Override
    public String getValueFromUser(String text){
        Scanner value = new Scanner(System.in);
        String stringValues;

        System.out.println(text);
        stringValues = value.nextLine();

        return stringValues;
    }

    @Override
    public ToDoCRD newTask(){
        boolean check = true;

        ToDoCRD task = new ToDoCRD();
        String stringValues;


        stringValues = getValueFromUser("Name of the task");
        task.setName(stringValues);

        stringValues = getValueFromUser("Description of the task");
        task.setDescription(stringValues);

        stringValues = getValueFromUser("Finish date");
        task.setFinishDt(stringValues);

        while (check) {
            stringValues = getValueFromUser("Set Task priority from 1 to 5");

            if (Integer.parseInt(stringValues) > 0 && Integer.parseInt(stringValues) <= task.getLIMIT()) {
                task.setPriority(Integer.parseInt(stringValues));
                check = false;
            } else {
                System.out.println("Priority smaller than 1 or larger than 5");
            }
        }

        stringValues = getValueFromUser("Set Task Category");
        task.setCategory(stringValues);

        stringValues = getValueFromUser("Set Task Status");
        task.setStatus(stringValues);
        return task;
    }
}
