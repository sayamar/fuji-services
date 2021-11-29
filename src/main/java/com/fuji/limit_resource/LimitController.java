package com.fuji.limit_resource;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class LimitController {

    @PostMapping(value = "/payments/limits", produces = "application/json")
    public ResponseEntity<LimitResponse> getName(
            @RequestHeader("Auth") String auth,
            @RequestBody Limits limits
    ) {
        LimitResponse limitResponse = LimitResponse.builder().result(limits.getLimitName()).build();

        return new ResponseEntity<>(limitResponse, HttpStatus.OK);
    }
}
