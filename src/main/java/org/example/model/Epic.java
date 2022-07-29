package org.example.model;

import java.util.List;

public class Epic extends Task {
    private List<Task> subtaskList;

    public Epic(int id, TaskStatuses status, String title, String description) {
        super(id, status, title, description);
    }

    public List<Task> getSubtaskList() {
        return subtaskList;
    }

    public void setSubtaskList(List<Task> subtaskList) {
        this.subtaskList = subtaskList;
    }

    public void setStatus(TaskStatuses status) {
        this.status = status;
    }
}
