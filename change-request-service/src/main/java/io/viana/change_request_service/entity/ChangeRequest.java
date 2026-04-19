package io.viana.change_request_service.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

import io.viana.change_request_service.enums.ChangeStatus;

@Entity
@Table(name = "change_requests")
public class ChangeRequest {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String requester;
    private String systemName;
    private String riskLevel;

    @Enumerated(EnumType.STRING)
    private ChangeStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime approvedAt;
    private String approvedBy;
    private LocalDateTime deployedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.status = ChangeStatus.PENDING;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getRequester() { return requester; }
    public void setRequester(String requester) { this.requester = requester; }

    public String getSystemName() { return systemName; }
    public void setSystemName(String systemName) { this.systemName = systemName; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public ChangeStatus getStatus() { return status; }
    public void setStatus(ChangeStatus status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public LocalDateTime getApprovedAt() { return approvedAt; }
    public void setApprovedAt(LocalDateTime approvedAt) { this.approvedAt = approvedAt; }

    public String getApprovedBy() { return approvedBy; }
    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }

    public LocalDateTime getDeployedAt() { return deployedAt; }
    public void setDeployedAt(LocalDateTime deployedAt) { this.deployedAt = deployedAt; }
}