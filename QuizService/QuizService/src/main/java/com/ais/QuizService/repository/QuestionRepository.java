package com.ais.QuizService.repository;

import com.ais.QuizService.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Long> {
    QuestionEntity findByContent(String content);
    List<QuestionEntity> findByCategory_Name(String name);
}
