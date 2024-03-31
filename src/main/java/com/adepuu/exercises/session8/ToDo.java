package com.adepuu.exercises.session8;

public class ToDo {

    private String description;
    private boolean isDone;

    public ToDo(String description){
        this.description = description;
    }

    public boolean getIsdone(){
        return isDone;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDone(){
        this.isDone = true;
    }
}
