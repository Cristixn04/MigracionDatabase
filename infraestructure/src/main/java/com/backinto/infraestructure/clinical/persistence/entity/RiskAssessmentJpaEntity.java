package com.backinto.infraestructure.clinical.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "risk_assessments", schema = "librarydb_schema")
public class RiskAssessmentJpaEntity {

    @Id
    @Column(name = "id")
    private UUID UUID;

    @Column(name = "encounter_id")
    private UUID encounterId;

    @Column(name = "risk_level_id")
    private UUID riskLevelId;

    @Column(name = "suicidal_ideation")
    private boolean suicidalIdeation;

    @Column(name = "suicide_plan")
    private boolean suicidePlan;

    @Column(name = "suicide_intent")
    private boolean suicideIntent;

    @Column(name = "self_harm")
    private boolean selfHarm;

    @Column(name = "harm_to_others")
    private boolean harmToOthers;

    @Column(name = "risk_factors")
    private String riskFactors;

    @Column(name = "protective_factors")
    private String protectiveFactors;

    @Column(name = "clinical_actions")
    private String clinicalActions;

    @Column(name = "observations")
    private String observations;

    @Column(name = "assessed_at")
    private LocalDateTime assessedAt;

    @Column(name = "assessed_by")
    private UUID assessedBy;

    public RiskAssessmentJpaEntity() {
    }

    public RiskAssessmentJpaEntity(UUID UUID, UUID encounterId, UUID riskLevelId, boolean suicidalIdeation, boolean suicidePlan, boolean suicideIntent, boolean selfHarm, boolean harmToOthers, String riskFactors, String protectiveFactors, String clinicalActions, String observations, LocalDateTime assessedAt, UUID assessedBy) {
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
