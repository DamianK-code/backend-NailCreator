package com.sda.jz75_security_template.controller;


import com.sda.jz75_security_template.model.dto.CreationDto;
import com.sda.jz75_security_template.service.SavedNailsCreationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/creation/")
@RequiredArgsConstructor
public class SavedNailsCreationController {

    private final SavedNailsCreationsService savedNailsCreationsService;


    // 1. Pobierz wszystkie kreacje - List <ID + nazwa>
    // 2. Pobierz krecję o podanym ID -> { obie ręce }
    @GetMapping("/{id}")
    public CreationDto getCreation(@PathVariable Long id){
        return savedNailsCreationsService.getById(id);
    }

    // 3. Zapisz podaną kreację (całą) -> id/null
    @PostMapping("")
    public void saveCreation(@RequestBody CreationDto creationDto){
        savedNailsCreationsService.save(creationDto);
    }


}
