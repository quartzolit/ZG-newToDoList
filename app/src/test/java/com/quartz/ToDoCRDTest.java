package com.quartz;

import com.quartz.classes.ToDoCRD;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ToDoCRDTest {

    @Test
    public void testToString() {

        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "com.quartz.classes.ToDoCRD{" +
                "name='" + "Roberto" + '\'' +
                ", description='" + "Cool guy" + '\'' +
                ", finish_dt='" + "25/03/2022" + '\'' +
                ", category='" + "Sales" + '\'' +
                ", status='" + "Doing" + '\'' +
                ", priority=" + "5" +
                '}';

        String result = task.toString();

        Assertions.assertEquals(expectedResult,result);

        System.out.println("To String Test Executed");

    }

    @Test
    public void getNameTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "Roberto";

        String result = task.getName();

        Assertions.assertEquals(expectedResult,result);

        System.out.println("getName Test Executed");
    }

    @Test
    public void setNameTest() {
        ToDoCRD task = new ToDoCRD();
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "Carlos";

        task.setName(expectedResult);

        Assertions.assertEquals(expectedResult,task.getName());
        System.out.println("setName Test Executed");
    }

    @Test
    public void getDescriptionTest() {

        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "Cool guy";

        String result = task.getDescription();

        Assertions.assertEquals(expectedResult,result);
        System.out.println("getDescription Test Executed");
    }

    @Test
    public void setDescriptionTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "The Coolest guy";

        task.setDescription(expectedResult);

        Assertions.assertEquals(expectedResult,task.getDescription());
        System.out.println("setDescription Test Executed");
    }

    @Test
    public void getFinishDtTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "25/03/2022";

        String result = task.getFinishDt();

        Assertions.assertEquals(expectedResult,result);
        System.out.println("getFinishDt Test Executed");
    }

    @Test
    public void setFinishDtTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "25/03/2022";

        task.setFinishDt(expectedResult);

        Assertions.assertEquals(expectedResult, task.getFinishDt());
        System.out.println("setFinishDt Test Executed");

    }

    @Test
    public void getPriorityTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        int expectedResult = 5;

        int result = task.getPriority();

        Assertions.assertEquals(expectedResult,result);
        System.out.println("getPriorityTest Executed");
    }

    @Test
    public void setPriorityTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setCategory("Sales");
        task.setStatus("Doing");

        int expectedResult = 4;

        task.setPriority(expectedResult);

        Assertions.assertEquals(expectedResult,task.getPriority());
        System.out.println("setPriority Test Executed");

    }

    @Test
    public void getCategoryTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "Sales";

        String result = task.getCategory();
        Assertions.assertEquals(expectedResult,result);
        System.out.println("getCategory Test Executed");
    }

    @Test
    public void setCategoryTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setStatus("Doing");

        String expectedResult = "Tech";

        task.setCategory(expectedResult);

        Assertions.assertEquals(expectedResult,task.getCategory());

        System.out.println("setCategory Test Executed");
    }

    @Test
    public void getStatusTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");
        task.setStatus("Doing");

        String expectedResult = "Doing";

        String result = task.getStatus();
        Assertions.assertEquals(expectedResult,result);
        System.out.println("getStatus Test Executed");
    }

    @Test
    public void setStatusTest() {
        ToDoCRD task = new ToDoCRD();
        task.setName("Roberto");
        task.setDescription("Cool guy");
        task.setFinishDt("25/03/2022");
        task.setPriority(5);
        task.setCategory("Sales");

        String expectedResult = "To Do";
        task.setStatus(expectedResult);

        Assertions.assertEquals(expectedResult,task.getStatus());
        System.out.println("setStatus Test Executed");
    }

    @Test
    public void getLimitTest(){
        ToDoCRD task = new ToDoCRD();
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, task.getLIMIT());
        System.out.println("getLimit Test Executed");
    }
}