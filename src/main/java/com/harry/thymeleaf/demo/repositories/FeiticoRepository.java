package com.harry.thymeleaf.demo.repositories;

import com.harry.thymeleaf.demo.entities.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeiticoRepository extends JpaRepository<Casa, Long> {
}
