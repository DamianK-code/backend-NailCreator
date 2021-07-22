package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.model.Finger;
import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.SavedNailsCreations;
import com.sda.jz75_security_template.model.dto.CreationDto;
import com.sda.jz75_security_template.model.dto.FingerDto;
import com.sda.jz75_security_template.model.dto.HandDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Mapper {

    public HandDto mapHand(Hand hand) {
        return HandDto.builder()
                .handSide(hand.getHandSide())
                .identifier(hand.getId())
                .fingers(mapFingers(hand.getFingers()))
                .build();
    }

    public List<FingerDto> mapFingers(Set<Finger> fingers) {
        return fingers.stream()
                .map(finger ->
                        FingerDto.builder()
                                .identifier(finger.getId())
                                .color(finger.getColor())
                                .label(finger.getFinger())
                                .build())
                .collect(Collectors.toList());
    }
    
    public SavedNailsCreations fromDto(CreationDto dto) {
        return SavedNailsCreations.builder()
                .id(dto.getIdentifier())
                .name(dto.getName())
                .left(handFromDto(dto.getLeft()))
                .right(handFromDto(dto.getRight()))
                .build();
    }

    public Hand handFromDto(HandDto hand) {
        return Hand.builder()
                .id(hand.getIdentifier())
                .handSide(hand.getHandSide())
                .fingers(mapFingersFromdto(hand.getFingers()))
                .build();
    }

    public Set<Finger> mapFingersFromdto(List<FingerDto> fingers) {
        return fingers.stream()
                .map(finger -> mapFingerFromDto(finger))
                .collect(Collectors.toSet());
    }

    public Finger mapFingerFromDto(FingerDto finger) {
        return Finger.builder()
                .id(finger.getIdentifier())
                .color(finger.getColor())
                .finger(finger.getLabel())
                .build();
    }

    public CreationDto toCreationDto(SavedNailsCreations save) {
        return new CreationDto(save.getId(), save.getName(), mapHand(save.getRight()), mapHand(save.getLeft()));
    }

    public FingerDto mapToFingerDto(Finger save) {
        return new FingerDto(save.getId(), save.getFinger(), save.getColor());
    }
}
