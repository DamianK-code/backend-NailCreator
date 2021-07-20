package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.service.FingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/finger/")
@RequiredArgsConstructor
public class FingerController {
    private final FingerService fingerService;

    @GetMapping("/edit")



    // 1. Zapisz palec o podanym ID
    // zwrócony typ to FingerDto
}
