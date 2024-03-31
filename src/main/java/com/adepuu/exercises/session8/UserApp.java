package com.adepuu.exercises.session8;

public class UserApp {
    private String username;
    private String password;

    private ToDoList todoList;
    public UserApp(String username, String password){
        ToDoList toDoList = new ToDoList();
        this.username = username;
        this.password = password;
        this.todoList = toDoList;
    }

    public String getUsername() {
        return username;
    }

    public ToDoList getTodoList(){
        return this.todoList;
    }

    public boolean checkCredentials(String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }
}
