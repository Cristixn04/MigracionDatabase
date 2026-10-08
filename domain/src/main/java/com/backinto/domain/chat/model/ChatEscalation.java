package com.backinto.domain.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class ChatEscalation {
    private UUID UUID;
    private UUID conversationId;
    private UUID statusId;
    private boolean fromAi;
    private String reason;
    private LocalDateTime createdAt;

    public ChatEscalation() {
    }

    public ChatEscalation(UUID UUID, UUID conversationId, UUID statusId, boolean fromAi, String reason, LocalDateTime createdAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.statusId = statusId;
        this.fromAi = fromAi;
        this.reason = reason;
        this.createdAt = createdAt;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public UUID getStatusId() {
        return statusId;
    }

    public void setStatusId(UUID statusId) {
        this.statusId = statusId;
    }

    public boolean isFromAi() {
        return fromAi;
    }

    public void setFromAi(boolean fromAi) {
        this.fromAi = fromAi;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
