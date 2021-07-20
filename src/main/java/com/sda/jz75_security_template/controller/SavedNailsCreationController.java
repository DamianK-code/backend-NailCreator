package com.sda.jz75_security_template.controller;


import com.sda.jz75_security_template.service.SavedNailsCreationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/creation/")
@RequiredArgsConstructor
public class SavedNailsCreationController {

    private final SavedNailsCreationsService savedNailsCreationsService;

    // 1. Pobierz wszystkie kreacje - ID + nazwa
    // 2. Pobierz krecję o podanym ID -> { obie ręce }
    // 3. Zapisz podaną kreację (całą) -> id/null

}
