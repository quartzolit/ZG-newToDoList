package com.quartz.classes;

import java.util.List;

public interface ITaskManager {
    String[] showList(List<ToDoCRD> list);

    ToDoCRD deleteTask(List<ToDoCRD> list, int id);

    List createTask(List<ToDoCRD> list, ToDoCRD task);

    String getValueFromUser(String text);

    ToDoCRD newTask();
}
