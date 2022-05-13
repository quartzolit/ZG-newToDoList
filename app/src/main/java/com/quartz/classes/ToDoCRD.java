package com.quartz.classes;

public class ToDoCRD {
    String name;
    String description;
    String finishDt;
    int priority;
    int LIMIT = 5;
    String category;
    String status;

    @Override
    public String toString() {
        return "com.quartz.classes.ToDoCRD{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", finish_dt='" + finishDt + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFinishDt() {
        return finishDt;
    }

    public void setFinishDt(String finishDt) {
        this.finishDt = finishDt;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getLIMIT() {
        return LIMIT;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
