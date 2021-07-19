package com.sda.jz75_security_template.controller;

import com.sda.jz75_security_template.service.FingerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FingerController {

    private final FingerService fingerService;
}
