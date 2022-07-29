package org.example.service.impl;
import org.example.service.HistoryManager;
import org.example.service.TaskManager;

public class Managers {
    public static TaskManager getDefault() {
        return new InMemoryTaskManager();
    };

    public static HistoryManager getDefaultHistory() {
        return new InMemoryHistoryManager();
    }
}
