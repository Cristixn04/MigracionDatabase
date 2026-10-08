package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatConversation {
    private UUID UUID;
    private UUID conversationStatusId;
    private UUID priorityId;
    private LocalDateTime lastMessageAt;
    private Boolean closed;
    private LocalDateTime closedAt;
    private UUID closedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ChatConversation() {
    }

    public ChatConversation(UUID UUID, UUID conversationStatusId, UUID priorityId, LocalDateTime lastMessageAt, Boolean closed, LocalDateTime closedAt, UUID closedBy, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.UUID = UUID;
        this.conversationStatusId = conversationStatusId;
        this.priorityId = priorityId;
        this.lastMessageAt = lastMessageAt;
        this.closed = closed;
        this.closedAt = closedAt;
        this.closedBy = closedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getConversationStatusId() {
        return conversationStatusId;
    }

    public void setConversationStatusId(UUID conversationStatusId) {
        this.conversationStatusId = conversationStatusId;
    }

    public UUID getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(UUID priorityId) {
        this.priorityId = priorityId;
    }

    public LocalDateTime getLastMessageAt() {
        return lastMessageAt;
    }

    public void setLastMessageAt(LocalDateTime lastMessageAt) {
        this.lastMessageAt = lastMessageAt;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public UUID getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(UUID closedBy) {
        this.closedBy = closedBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
