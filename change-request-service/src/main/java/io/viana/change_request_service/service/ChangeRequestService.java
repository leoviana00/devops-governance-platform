package io.viana.change_request_service.service;

import io.viana.change_request_service.entity.ChangeRequest;
import io.viana.change_request_service.enums.ChangeStatus;
import io.viana.change_request_service.repository.ChangeRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ChangeRequestService {

    private final ChangeRequestRepository repository;

    public ChangeRequestService(ChangeRequestRepository repository) {
        this.repository = repository;
    }

    public ChangeRequest create(ChangeRequest request) {
        return repository.save(request);
    }

    public List<ChangeRequest> findAll() {
        return repository.findAll();
    }

    public ChangeRequest findById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Change request not found"));
    }

    public ChangeRequest approve(UUID id, String approvedBy) {
        ChangeRequest change = findById(id);

        if (change.getStatus() != ChangeStatus.PENDING) {
            throw new RuntimeException("Only pending changes can be approved");
        }

        change.setStatus(ChangeStatus.APPROVED);
        change.setApprovedAt(LocalDateTime.now());
        change.setApprovedBy(approvedBy);

        return repository.save(change);
    }

    public ChangeRequest reject(UUID id) {
        ChangeRequest change = findById(id);

        if (change.getStatus() != ChangeStatus.PENDING) {
            throw new RuntimeException("Only pending changes can be rejected");
        }

        change.setStatus(ChangeStatus.REJECTED);

        return repository.save(change);
    }

    public ChangeRequest deploy(UUID id) {
        ChangeRequest change = findById(id);

        if (change.getStatus() != ChangeStatus.APPROVED) {
            throw new RuntimeException("Only approved changes can be deployed");
        }

        change.setStatus(ChangeStatus.DEPLOYED);
        change.setDeployedAt(LocalDateTime.now());

        return repository.save(change);
    }
}