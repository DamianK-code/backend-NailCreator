package com.sda.jz75_security_template.service;


import com.sda.jz75_security_template.repository.SavedNailsCreationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SavedNailsCreationsService {
    private final SavedNailsCreationsRepository savedNailsCreationsRepository;


}
