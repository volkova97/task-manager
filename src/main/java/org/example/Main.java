package org.example;

import org.example.model.Subtask;
import org.example.model.Task;
import org.example.model.TaskStatuses;

public class Main {
    public static void main(String[] args) {
        Task subtask = new Subtask(0, TaskStatuses.NEW, "test", "test");
        System.out.println("Hello world!");
    }
}