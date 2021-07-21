package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.model.dto.FingerDto;
import com.sda.jz75_security_template.model.dto.HandDto;
import com.sda.jz75_security_template.service.FingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/finger/")
@RequiredArgsConstructor
public class FingerController {
    private final FingerService fingerService;
//
//    @PostMapping("/{id}")
//    public void saveFinger(@RequestBody FingerDto fingerDto) {
//        fingerService.save(fingerDto);
        // 1. Zapisz palec o podanym ID
        // zwrócony typ to FingerDto
//    }
}
