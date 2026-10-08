package com.backinto.domain.clinical.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class MentalStatusExam {
    private UUID UUID;
    private UUID encounterId;
    private String appearance;
    private String behavior;
    private String attitude;
    private String consciousness;
    private String orientation;
    private String attention;
    private String memory;
    private String speech;
    private String mood;
    private String affect;
    private String thoughtProcess;
    private String thoughtContent;
    private String perception;
    private String judgment;
    private String insight;
    private String psychomotorActivity;
    private String observations;
    private LocalDateTime createdAt;
    private UUID createdBy;

    public MentalStatusExam() {
    }

    public MentalStatusExam(UUID UUID, UUID encounterId, String appearance, String behavior, String attitude, String consciousness, String orientation, String attention, String memory, String speech, String mood, String affect, String thoughtProcess, String thoughtContent, String perception, String judgment, String insight, String psychomotorActivity, String observations, LocalDateTime createdAt, UUID createdBy) {
        this.UUID = UUID;
        this.encounterId = encounterId;
        this.appearance = appearance;
        this.behavior = behavior;
        this.attitude = attitude;
        this.consciousness = consciousness;
        this.orientation = orientation;
        this.attention = attention;
        this.memory = memory;
        this.speech = speech;
        this.mood = mood;
        this.affect = affect;
        this.thoughtProcess = thoughtProcess;
        this.thoughtContent = thoughtContent;
        this.perception = perception;
        this.judgment = judgment;
        this.insight = insight;
        this.psychomotorActivity = psychomotorActivity;
        this.observations = observations;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public UUID getUUID() {
        return UUID;
    }

    public void setUUID(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(UUID encounterId) {
        this.encounterId = encounterId;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public String getConsciousness() {
        return consciousness;
    }

    public void setConsciousness(String consciousness) {
        this.consciousness = consciousness;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getAffect() {
        return affect;
    }

    public void setAffect(String affect) {
        this.affect = affect;
    }

    public String getThoughtProcess() {
        return thoughtProcess;
    }

    public void setThoughtProcess(String thoughtProcess) {
        this.thoughtProcess = thoughtProcess;
    }

    public String getThoughtContent() {
        return thoughtContent;
    }

    public void setThoughtContent(String thoughtContent) {
        this.thoughtContent = thoughtContent;
    }

    public String getPerception() {
        return perception;
    }

    public void setPerception(String perception) {
        this.perception = perception;
    }

    public String getJudgment() {
        return judgment;
    }

    public void setJudgment(String judgment) {
        this.judgment = judgment;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getPsychomotorActivity() {
        return psychomotorActivity;
    }

    public void setPsychomotorActivity(String psychomotorActivity) {
        this.psychomotorActivity = psychomotorActivity;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }
}
