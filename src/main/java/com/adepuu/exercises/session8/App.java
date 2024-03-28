package com.adepuu.exercises.session8;

import com.adepuu.exercises.session7.User;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    /**
     * Manages user registration, login, and task management for the To-Do List application.
     * <p>
     * This function enables users to register, log in, and manage their tasks through the console.
     * It provides a clear and concise menu with options to add a task, view tasks, delete a task, or log out.
     * The system handles user input errors gracefully, providing clear feedback and prompting for correct input.
     * </p>
     * <br/>
     * <h3>User Registration and Login:</h3>
     * <ul>
     *     <li>Given a new user, when they input their desired login and password through the console, then the system should create a new account and confirm successful account creation.</li>
     *     <li>Given an existing user, when they input their login and password through the console, then the system should authenticate the user and grant access to the to-do list.</li>
     * </ul>
     *
     * <h3>Task Management:</h3>
     * <ul>
     *     <li>Given a logged-in user, when they input a new task through the console, then the system should add the task to their to-do list and confirm the task has been added.</li>
     *     <li>Given a logged-in user, when they view their to-do list through the console, then the system should display all tasks currently in their list.</li>
     *     <li>Given a logged-in user, when they input a task to delete through the console, then the system should remove the task from their to-do list and confirm the task has been deleted.</li>
     * </ul>
     *
     * <h3>Other:</h3>
     * <ul>
     *     <li>When a user accesses the application, the interface should display a clear and concise menu with options to add a task, view tasks, delete a task, or log out, all accessible through the console.</li>
     *     <li>The system should handle user input errors gracefully, providing clear feedback and prompting for correct input through the console.</li>
     * </ul>
     *
     * <h3>Notes:</h3>
     * <ul>
     *     <li>No need to encrypt user password</li>
     *     <li>Start the program menu inside main function below</li>
     *     <li>Split each functionalities into its own classes</li>
     *     <li>Please Use UUID if there's ID needed <a href="https://www.baeldung.com/java-uuid">Java UUID Reference</a></li>
     *     <li>Data does not need to be stored in a File. Instead, store it inside a Map or List and let the data gone when program finished</li>
     * </ul>
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<UserApp> users = new ArrayList<UserApp>();
        UserApp currentUser = null;

        System.out.println("Welcome to the To-Do List program!");

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Add task");
            System.out.println("4. Delete task");
            System.out.println("5. Display tasks");
            System.out.println("6. Logout");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a username: ");
                    String regUsername = scanner.nextLine();

                    boolean existingUser = users.stream().anyMatch(user -> user.getUsername().equals(regUsername));
                    if (existingUser) {
                        System.out.println("Username already exists!");
                    } else {
                        System.out.print("Enter a password: ");
                        String regPassword = scanner.nextLine();

                        UserApp newUser = new UserApp(regUsername, regPassword);
                        users.add(newUser);
                        System.out.println("Registration successful!");
                    }
                    break;

                case 2:
                    System.out.print("Enter your username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    UserApp existingUser2 = users.stream()
                            .filter(user -> user.getUsername().equals(loginUsername) && user.getPassword().equals(loginPassword))
                            .findAny()
                            .orElse(null);

                    if (existingUser2 == null) {
                        System.out.println("Invalid username or password!");
                    } else {
                        currentUser = existingUser2;
                        System.out.println("Login successful!");
                    }
                    break;

                case 3:
                    if (currentUser == null) {
                        System.out.println("Please login first!");
                    } else {
                        System.out.print("Enter the task description: ");
                        String description = scanner.nextLine();
                        currentUser.getToDoList().addTask(description);
                    }
                    break;

                case 4:
                    if (currentUser == null) {
                        System.out.println("Please login first!");
                    } else {
                        System.out.print("Enter the index of the task to delete: ");
                        int taskIndex = scanner.nextInt();
                        scanner.nextLine();
                        currentUser.getToDoList().deleteTask(taskIndex - 1);
                    }
                    break;

                case 5:
                    if (currentUser == null) {
                        System.out.println("Please login first!");
                    } else {
                        currentUser.getToDoList().displayTasks();
                    }
                    break;

                case 6:
                    currentUser = null;
                    System.out.println("Logout successful!");
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

}


