package org.example.service.impl;

import org.example.model.Task;
import org.example.service.HistoryManager;
import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    List<Task> historyList = new ArrayList<>();

    @Override
    public void add(Task task) {
        if (historyList.size() > 10) {
            historyList.remove(historyList.size() - 1);
        }
        historyList.add(task);
    }

    @Override
    public List<Task> getHistory() {
        return historyList;
    }
}
