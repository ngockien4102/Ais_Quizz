package com.ais.QuizService.repository;

import com.ais.QuizService.entity.NomineeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomineeRepository extends JpaRepository<NomineeEntity,Long> {
}
