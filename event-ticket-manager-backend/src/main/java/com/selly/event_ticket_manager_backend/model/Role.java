package com.selly.event_ticket_manager_backend.model;

public enum Role {
    ADMIN("Administrator"),
    USER("Standard User"),
    CLIENT("Client");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
