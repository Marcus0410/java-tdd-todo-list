package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    ArrayList<Task> addTask(Task t) {
        tasks.add(t);
        return tasks;
    }

    void completeTask(String taskName) {
        for (Task t : tasks) {
            if (t.getName().equals(taskName)) {
                t.complete();
            }
        }
    }

    ArrayList<Task> getAll() {
        return tasks;
    }

    ArrayList<Task> getCompleted() {
        ArrayList<Task> completed = new ArrayList<>();

        for (Task t : tasks) {
            if (t.isComplete())
                completed.add(t);
        }

        return completed;
    }

    ArrayList<Task> getIncompleted() {
        ArrayList<Task> incompleted = new ArrayList<>();

        for (Task t : tasks) {
            if (!t.isComplete())
                incompleted.add(t);
        }

        return incompleted;
    }

    ArrayList<Task> getAllAscending() {
        return tasks;
    }

    ArrayList<Task> getAllDescending() {
        return tasks;
    }

    boolean search(String taskName) {
        for (Task t : tasks) {
            if (t.getName().equals(taskName))
                return true;
        }
        return false;
    }

    Task removeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getName().equals(taskName)) {
                return tasks.remove(i);
            }
        }
        return null;
    }
}
