package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    ArrayList<Task> addTask(Task t) {
        tasks.add(t);
        return tasks;
    }

    void completeTask(String taskName) {

    }

    ArrayList<Task> getAll() {
        return tasks;
    }

    ArrayList<Task> getCompleted() {
        return tasks;
    }

    ArrayList<Task> getIncompleted() {
        return tasks;
    }

    ArrayList<Task> getAllAscending() {
        return tasks;
    }

    ArrayList<Task> getAllDescending() {
        return tasks;
    }

    boolean search(String taskName) {
        return false;
    }

    Task removeTask(String taskName) {
        return null;
    }
}
