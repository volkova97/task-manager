package org.example.service;

import org.example.model.Task;
import org.example.model.TaskStatuses;

import java.util.List;

public interface TaskManager {
    Task create(int id, TaskStatuses status, String title, String description, Class type);
    void removeById(int id);
    void update(int id, TaskStatuses status);
    Task getById(int id);
    List<Task> getAllTasksByEpic(int epicId);
    List<Task> getAllTasksByType(Class type);
}
