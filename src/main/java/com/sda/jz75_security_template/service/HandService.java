package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.repository.HandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class HandService {
    private final HandRepository handRepository;

}
