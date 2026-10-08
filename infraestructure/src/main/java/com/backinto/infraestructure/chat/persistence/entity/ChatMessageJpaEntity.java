package com.backinto.infraestructure.chat.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "chat_messages", schema = "librarydb_schema")
public class ChatMessageJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "conversation_id")
    private UUID conversationId;

    @Column(name = "message_type_id")
    private UUID messageTypeId;

    @Column(name = "participant_id")
    private UUID participantId;

    @Column(name = "content")
    private String content;

    @Column(name = "metadata")
    private String metadata;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public ChatMessageJpaEntity() {
    }

    public ChatMessageJpaEntity(UUID UUID, UUID conversationId, UUID messageTypeId, UUID participantId, String content, String metadata, LocalDateTime createdAt) {
        this.UUID = UUID;
        this.conversationId = conversationId;
        this.messageTypeId = messageTypeId;
        this.participantId = participantId;
        this.content = content;
        this.metadata = metadata;
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

    public UUID getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(UUID messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public UUID getParticipantId() {
        return participantId;
    }

    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
