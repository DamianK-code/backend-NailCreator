package com.sda.jz75_security_template.repository;

import com.sda.jz75_security_template.model.Finger;
import com.sda.jz75_security_template.model.Fingers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FingerRepository extends JpaRepository<Finger, Long> {
    Optional<Finger> findByFingers(Fingers fingers);
}
