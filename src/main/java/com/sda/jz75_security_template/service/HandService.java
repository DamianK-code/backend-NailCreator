package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.SavedNailsCreations;
import com.sda.jz75_security_template.model.dto.HandDto;
import com.sda.jz75_security_template.repository.HandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class HandService {
    private final HandRepository handRepository;
    private final Mapper mapper;

    public void save(HandDto handDto) {
        Hand updateObject = mapper.handFromDto(handDto);
        if (handDto.getIdentifier() != null) {
            Optional<Hand> handOptional = handRepository.findById(handDto.getIdentifier());
            if (handOptional.isPresent()) {
                // przypadek aktualizacja
                Hand hand = handOptional.get();

                handRepository.save(hand);
            }
        }
    }

    public void getHand(HandDto handDto) {
        Hand getObject = mapper.handFromDto(handDto);
        if (handDto.getIdentifier() != null) {
            Optional<Hand> handOptional = handRepository.findById(handDto.getIdentifier());
            if (handOptional.isPresent()) {
                Hand hand = handOptional.get();

            }
        }
    }
}
