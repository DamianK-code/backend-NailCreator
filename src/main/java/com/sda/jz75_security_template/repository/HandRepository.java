package com.sda.jz75_security_template.repository;

import com.sda.jz75_security_template.model.Hand;
import com.sda.jz75_security_template.model.HandSide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HandRepository  extends JpaRepository<Hand, Long> {
}
