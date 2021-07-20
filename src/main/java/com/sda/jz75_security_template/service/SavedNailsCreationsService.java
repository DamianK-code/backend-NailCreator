package com.sda.jz75_security_template.service;


import com.sda.jz75_security_template.model.Finger;
import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.SavedNailsCreations;
import com.sda.jz75_security_template.model.dto.CreationDto;
import com.sda.jz75_security_template.model.dto.FingerDto;
import com.sda.jz75_security_template.model.dto.HandDto;
import com.sda.jz75_security_template.model.dto.SimpleCreationDto;
import com.sda.jz75_security_template.repository.SavedNailsCreationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class SavedNailsCreationsService {
    private final SavedNailsCreationsRepository savedNailsCreationsRepository;
    private final Mapper mapper;

    // zwróć z bazy wszystkie kreacje
    public List<SimpleCreationDto> findAll() {
//        return savedNailsCreationsRepository.findAll()
//                .stream()
        return null;
    }

    public CreationDto getById(Long id) {
        Optional<SavedNailsCreations> savedNailsCreationsOpt = savedNailsCreationsRepository.findById(id);
        if (savedNailsCreationsOpt.isPresent()) {
            SavedNailsCreations savedNailsCreations = savedNailsCreationsOpt.get();

            return CreationDto.builder()
                    .identifier(savedNailsCreations.getId())
                    .name(savedNailsCreations.getName())
                    .left(mapper.mapHand(savedNailsCreations.getLeft()))
                    .right(mapper.mapHand(savedNailsCreations.getRight()))
                    .build();
        }
        throw new UnsupportedOperationException("Bad id.");
    }

    public void save(CreationDto creationDto) {
        SavedNailsCreations updateObject = mapper.fromDto(creationDto);
        if (creationDto.getIdentifier() != null) {
            Optional<SavedNailsCreations> savedNailsCreationsOpt = savedNailsCreationsRepository.findById(creationDto.getIdentifier());
            if (savedNailsCreationsOpt.isPresent()) {
                // przypadek aktualizacja
                SavedNailsCreations savedNailsCreations = savedNailsCreationsOpt.get();

                savedNailsCreations.setName(updateObject.getName());

                savedNailsCreationsRepository.save(savedNailsCreations);
            }
        }
    }
}
