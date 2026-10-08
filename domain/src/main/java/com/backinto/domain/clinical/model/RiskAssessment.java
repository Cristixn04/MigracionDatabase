package com.backinto.domain.clinical.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class RiskAssessment {
    private UUID UUID;
    private UUID encounterId;
    private UUID riskLevelId;
    private boolean suicidalIdeation;
    private boolean suicidePlan;
    private boolean suicideIntent;
    private boolean selfHarm;
    private boolean harmToOthers;
    private String riskFactors;
    private String protectiveFactors;
    private String clinicalActions;
    private String observations;
    private LocalDateTime assessedAt;
    private UUID assessedBy;

    public RiskAssessment() {
    }

    public RiskAssessment(UUID UUID, UUID encounterId, UUID riskLevelId, boolean suicidalIdeation, boolean suicidePlan, boolean suicideIntent, boolean selfHarm, boolean harmToOthers, String riskFactors, String protectiveFactors, String clinicalActions, String observations, LocalDateTime assessedAt, UUID assessedBy) {
        this.UUID = UUID;
        this.encounterId = encounterId;
        this.riskLevelId = riskLevelId;
        this.suicidalIdeation = suicidalIdeation;
        this.suicidePlan = suicidePlan;
        this.suicideIntent = suicideIntent;
        this.selfHarm = selfHarm;
        this.harmToOthers = harmToOthers;
        this.riskFactors = riskFactors;
        this.protectiveFactors = protectiveFactors;
        this.clinicalActions = clinicalActions;
        this.observations = observations;
        this.assessedAt = assessedAt;
        this.assessedBy = assessedBy;
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

    public UUID getRiskLevelId() {
        return riskLevelId;
    }

    public void setRiskLevelId(UUID riskLevelId) {
        this.riskLevelId = riskLevelId;
    }

    public boolean isSuicidalIdeation() {
        return suicidalIdeation;
    }

    public void setSuicidalIdeation(boolean suicidalIdeation) {
        this.suicidalIdeation = suicidalIdeation;
    }

    public boolean isSuicidePlan() {
        return suicidePlan;
    }

    public void setSuicidePlan(boolean suicidePlan) {
        this.suicidePlan = suicidePlan;
    }

    public boolean isSuicideIntent() {
        return suicideIntent;
    }

    public void setSuicideIntent(boolean suicideIntent) {
        this.suicideIntent = suicideIntent;
    }

    public boolean isSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public boolean isHarmToOthers() {
        return harmToOthers;
    }

    public void setHarmToOthers(boolean harmToOthers) {
        this.harmToOthers = harmToOthers;
    }

    public String getRiskFactors() {
        return riskFactors;
    }

    public void setRiskFactors(String riskFactors) {
        this.riskFactors = riskFactors;
    }

    public String getProtectiveFactors() {
        return protectiveFactors;
    }

    public void setProtectiveFactors(String protectiveFactors) {
        this.protectiveFactors = protectiveFactors;
    }

    public String getClinicalActions() {
        return clinicalActions;
    }

    public void setClinicalActions(String clinicalActions) {
        this.clinicalActions = clinicalActions;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public LocalDateTime getAssessedAt() {
        return assessedAt;
    }

    public void setAssessedAt(LocalDateTime assessedAt) {
        this.assessedAt = assessedAt;
    }

    public UUID getAssessedBy() {
        return assessedBy;
    }

    public void setAssessedBy(UUID assessedBy) {
        this.assessedBy = assessedBy;
    }
}
