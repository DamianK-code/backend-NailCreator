package com.sda.jz75_security_template.service;

import com.sda.jz75_security_template.model.Account;
import com.sda.jz75_security_template.model.SavedNailsCreations;
import com.sda.jz75_security_template.repository.SavedNailsCreationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SavedNailsCreationsService {
    private final SavedNailsCreationsRepository savedNailsCreationsRepository;


}
