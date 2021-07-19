package com.sda.jz75_security_template.repository;

import com.sda.jz75_security_template.model.Account;
import com.sda.jz75_security_template.model.SavedNailsCreations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SavedNailsCreationsRepository extends JpaRepository<SavedNailsCreations, Long> {
    Set<SavedNailsCreations> findAllByName(String name);
}
