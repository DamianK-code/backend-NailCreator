package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.dto.CreationDto;
import com.sda.jz75_security_template.model.dto.HandDto;
import com.sda.jz75_security_template.service.HandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/hand")
@RequiredArgsConstructor
public class HandController {
    private final HandService handService;

    // 1. zapisz rękę o podanym ID
    @PostMapping("")
    public void saveCreation(@RequestBody HandDto handDto) {
        handService.save(handDto);
    }
    // 2. pobierz rękę o podanym ID

    @GetMapping("/{id}")
    public Hand getHand(@PathVariable Long id) {
        return handService.getHand(id);
    }
}
