package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.model.Finger;
import com.sda.jz75_security_template.model.Fingers;
import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.dto.FingerDto;
import com.sda.jz75_security_template.repository.FingerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FingerService {
    private final FingerRepository fingerRepository;
    private final Mapper mapper;

    public void save(FingerDto fingerDto) {
        Finger updateObject = mapper.mapFingerFromDto(fingerDto);
        if (fingerDto.getIdentifier() != null) {
            Optional<Finger> fingerOptional = fingerRepository.findById(fingerDto.getIdentifier());
            if (fingerOptional.isPresent()) {
                Finger finger = fingerOptional.get();
                finger.setFinger(updateObject.getFinger());
                finger.setColor(updateObject.getColor());

                fingerRepository.save(finger);
            }
        }
    }
}
