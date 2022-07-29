package org.example.model;

import org.example.service.impl.Managers;

public abstract class Task {
    protected int id;
    protected TaskStatuses status;
    protected String title;
    protected String description;

    public Task(int id, TaskStatuses status, String title, String description) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TaskStatuses getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatuses status) {
        this.status = status;
    }
}
