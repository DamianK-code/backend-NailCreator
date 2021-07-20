package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.model.dto.CreationDto;
import com.sda.jz75_security_template.model.dto.HandDto;
import com.sda.jz75_security_template.service.HandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hand/")
@RequiredArgsConstructor
public class HandController {
    private final HandService handService;

    // 1. zapisz rękę o podanym ID
    @PostMapping("/{id}")
    public void saveCreation(@RequestBody HandDto handDto){
        handService.save(handDto);
    }
    // 2. pobierz rękę o podanym ID
}
