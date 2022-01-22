package com.ais.QuizService.service;

import com.ais.QuizService.dto.Request.QuestionEditRequest;
import com.ais.QuizService.dto.Request.QuestionRequest;
import com.ais.QuizService.dto.Request.QuestionTypeRequest;
import com.ais.QuizService.entity.QuestionTypeEntity;

import java.util.List;


public interface QuestionService {
    void createQuestion(QuestionRequest request);

    void editQuestion(QuestionEditRequest request);

    List<QuestionRequest> getQuestionByCategory(String name);

    void createQuestionType(QuestionTypeRequest category);
}
