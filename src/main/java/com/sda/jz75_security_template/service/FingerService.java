package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.repository.FingerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FingerService {
    private final FingerRepository fingerRepository;
}
