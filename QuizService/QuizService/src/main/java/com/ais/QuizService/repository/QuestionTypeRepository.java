package com.ais.QuizService.repository;

import com.ais.QuizService.entity.QuestionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTypeRepository extends JpaRepository<QuestionTypeEntity, Long> {
}
