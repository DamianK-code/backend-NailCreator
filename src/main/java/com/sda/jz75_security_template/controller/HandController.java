package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.service.HandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hand/")
@RequiredArgsConstructor
public class HandController {
    private final HandService handService;

    // 1. zapisz rękę o podanym ID

}
