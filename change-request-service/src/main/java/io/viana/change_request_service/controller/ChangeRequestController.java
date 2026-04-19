package io.viana.change_request_service.controller;

import io.viana.change_request_service.entity.ChangeRequest;
import io.viana.change_request_service.service.ChangeRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/change-requests")
public class ChangeRequestController {

    private final ChangeRequestService service;

    public ChangeRequestController(ChangeRequestService service) {
        this.service = service;
    }

    @PostMapping
    public ChangeRequest create(@RequestBody ChangeRequest request) {
        return service.create(request);
    }

    @GetMapping
    public List<ChangeRequest> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ChangeRequest findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @PutMapping("/{id}/approve")
    public ChangeRequest approve(
            @PathVariable UUID id,
            @RequestBody Map<String, String> body) {

        return service.approve(id, body.get("approvedBy"));
    }

    @PutMapping("/{id}/reject")
    public ChangeRequest reject(@PathVariable UUID id) {
        return service.reject(id);
    }

    @PutMapping("/{id}/deploy")
    public ChangeRequest deploy(@PathVariable UUID id) {
        return service.deploy(id);
    }
}