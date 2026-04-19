package io.viana.change_request_service.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleRuntime(RuntimeException ex) {
        return Map.of(
                "error", ex.getMessage()
        );
    }
}