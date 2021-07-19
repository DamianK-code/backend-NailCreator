package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.repository.HandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HandService {
    private final HandRepository handRepository;

    public Optional<Hand> handSite(Hand hand){
     return handRepository.findByHandSide(hand.getHandSide());
    }
}
