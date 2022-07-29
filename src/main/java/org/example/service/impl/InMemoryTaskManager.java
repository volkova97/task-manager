package org.example.service.impl;

import org.example.model.Epic;
import org.example.model.Subtask;
import org.example.model.Task;
import org.example.model.TaskStatuses;
import org.example.service.TaskManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryTaskManager implements TaskManager {
    Map<Integer, Task> memoryMap = new HashMap<>();

    @Override
    public Task create(int id, TaskStatuses status, String title, String description, Class type) {
        if (Epic.class.equals(type)) {
            Epic epic = new Epic(id, status, title, description);
            memoryMap.put(id, epic);
            return epic;
        }
        Subtask subtask = new Subtask(id, status, title, description);
        memoryMap.put(id, subtask);
        return subtask;
    }

    @Override
    public void removeById(int id) {
        memoryMap.remove(id);
    }

    @Override
    public void update(int id, TaskStatuses status) {
        switch (status) {
            case IN_PROGRESS -> {

            }

        }

        int size = getAllTasksByEpic(id).size();
        List<Task> allTasks = getAllTasksByEpic(id);
        TaskStatuses firstTaskStatus = allTasks.get(0).getStatus();
        for (int i = 1; i < size; i++) {
            if (allTasks.get(i).getStatus() != firstTaskStatus) {
                break;
            }
        }
//        getById(id).setStatus(firstTaskStatus);
    }

    @Override
    public Task getById(int id) {
        Managers.getDefaultHistory().add(memoryMap.get(id));
        return memoryMap.get(id);
    }

    @Override
    public List<Task> getAllTasksByEpic(int epicId) {
        Epic epic = (Epic) memoryMap.get(epicId);
        return epic.getSubtaskList();
    }

    @Override
    public List<Task> getAllTasksByType(Class type) {
        return memoryMap.values().stream().filter(it -> it.getClass().equals(type)).collect(Collectors.toList());
    }
}
