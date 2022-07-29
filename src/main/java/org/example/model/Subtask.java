package org.example.model;

import org.example.service.impl.Managers;

public class Subtask extends Task {
    private int epicId;

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    public void setStatus(TaskStatuses status) {
        Managers.getDefault().update(epicId, status);
        this.status = status;
    }

    public Subtask(int id, TaskStatuses status, String title, String description) {
        super(id, status, title, description);
    }
}
