package ru.dmitriyace.models;

public class Act {
    private String condition;
    private String name;

    public String getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    public Act(String condition, String name) {

        this.condition = condition;
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setName(String name) {
        this.name = name;
    }
}
