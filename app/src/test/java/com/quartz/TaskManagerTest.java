package com.quartz;

import com.quartz.classes.TaskManager;
import com.quartz.classes.ToDoCRD;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void showListTest() {
        List<ToDoCRD> toDoList = new LinkedList<>();
        TaskManager taskManager = new TaskManager(toDoList);

        ToDoCRD task1 = new ToDoCRD();
        task1.setName("Roberto");
        task1.setDescription("Cool guy");
        task1.setFinishDt("25/03/2022");
        task1.setPriority(3);
        task1.setCategory("Sales");
        task1.setStatus("Doing");

        ToDoCRD task2 = new ToDoCRD();
        task2.setName("Carlos");
        task2.setDescription("Strong guy");
        task2.setFinishDt("26/03/2022");
        task2.setPriority(5);
        task2.setCategory("Engineering");
        task2.setStatus("Completed");

        toDoList.add(task2);
        toDoList.add(task1);

        String[] expectedResult = new String[2];

        expectedResult[0] = toDoList.get(0).toString();
        expectedResult[1] = toDoList.get(1).toString();

        String[] result = taskManager.showList(toDoList);

        Assertions.assertArrayEquals(expectedResult,result);

        System.out.println("Show List test: Executed");

    }

    @Test
    void deleteTaskTest() {
        List<ToDoCRD> toDoList = new LinkedList<>();
        TaskManager taskManager = new TaskManager(toDoList);

        ToDoCRD task1 = new ToDoCRD();
        task1.setName("Roberto");
        task1.setDescription("Cool guy");
        task1.setFinishDt("25/03/2022");
        task1.setPriority(3);
        task1.setCategory("Sales");
        task1.setStatus("Doing");

        ToDoCRD task2 = new ToDoCRD();
        task2.setName("Carlos");
        task2.setDescription("Strong guy");
        task2.setFinishDt("26/03/2022");
        task2.setPriority(5);
        task2.setCategory("Engineering");
        task2.setStatus("Completed");

        toDoList.add(task2);
        toDoList.add(task1);

        ToDoCRD expectedDeletedTask = task2;

        ToDoCRD result = taskManager.deleteTask(toDoList,0);

        assertEquals(expectedDeletedTask, result);

        System.out.println("Task Delete Executed");


    }

    @Test
    void createTask() {
        List<ToDoCRD> toDoList = new LinkedList<>();
        TaskManager taskManager = new TaskManager(toDoList);

        ToDoCRD task1 = new ToDoCRD();
        task1.setName("Roberto");
        task1.setDescription("Cool guy");
        task1.setFinishDt("25/03/2022");
        task1.setPriority(3);
        task1.setCategory("Sales");
        task1.setStatus("Doing");

        taskManager.createTask(toDoList,task1);

        Assertions.assertTrue(!toDoList.isEmpty());

        System.out.println("Task Creation Executed");

    }
}