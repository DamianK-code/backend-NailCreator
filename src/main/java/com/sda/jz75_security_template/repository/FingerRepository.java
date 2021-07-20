package com.sda.jz75_security_template.repository;

import com.sda.jz75_security_template.model.Finger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FingerRepository extends JpaRepository<Finger, Long> {
}
