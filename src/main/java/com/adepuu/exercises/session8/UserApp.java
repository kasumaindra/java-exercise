package com.adepuu.exercises.session8;

public class UserApp {
    private String username;
    private String password;
    private ToDoList todoList;

    public UserApp(String username, String password) {
        this.username = username;
        this.password = password;
        todoList = new ToDoList();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ToDoList getToDoList() {
        return todoList;
    }


}
