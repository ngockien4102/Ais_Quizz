package com.ais.QuizService.service.impl;

import com.ais.QuizService.dto.Request.QuestionEditRequest;
import com.ais.QuizService.dto.Request.QuestionRequest;
import com.ais.QuizService.dto.Request.QuestionTypeRequest;
import com.ais.QuizService.entity.QuestionEntity;
import com.ais.QuizService.entity.QuestionTypeEntity;
import com.ais.QuizService.repository.CategoryRepository;
import com.ais.QuizService.repository.QuestionRepository;
import com.ais.QuizService.repository.QuestionTypeRepository;
import com.ais.QuizService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    QuestionTypeRepository questionTypeRepository;

    @Override
    public void createQuestion(QuestionRequest request) {

        if(questionRepository.findByContent(request.getContent())!=null){
            throw new RuntimeException("this question was crate before !!!");
        }

        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setContent(request.getContent());
        questionEntity.setQuestionType(request.getQuestionType());
        questionEntity.setCategory(request.getCategory());
        questionEntity.setQuestionChoice(request.getQuestionChoice());
        questionEntity.setQuestionTime(request.getQuestionTime());
        questionRepository.save(questionEntity);
    }

    @Override
    public void editQuestion(QuestionEditRequest request) {
        QuestionEntity questionEntity = questionRepository.getById(request.getId());
        questionEntity.setContent(request.getContent());
        questionEntity.setQuestionType(request.getQuestionType());
        questionEntity.setCategory(request.getCategory());
        questionEntity.setQuestionChoice(request.getQuestionChoice());
        questionEntity.setQuestionTime(request.getQuestionTime());
        questionRepository.save(questionEntity);
    }

    @Override
    public List<QuestionRequest> getQuestionByCategory(String name) {
        List<QuestionEntity> questionEntity = questionRepository.findByCategory_Name(name);
        List<QuestionRequest> questionRequests = new ArrayList<>();
        for(QuestionEntity question : questionEntity){
            QuestionRequest request = new QuestionRequest();
            request.setContent(question.getContent());
            request.setQuestionType(question.getQuestionType());
            request.setCategory(question.getCategory());
//            request.setQuestionChoice(question.getQuestionChoice());
            request.setQuestionTime(question.getQuestionTime());
            questionRequests.add(request);
        }
        return questionRequests;
    }

    @Override
    public void createQuestionType(QuestionTypeRequest type) {
        QuestionTypeEntity questionType = new QuestionTypeEntity();
        questionType.setName(type.getName());
        questionTypeRepository.save(questionType);
    }


}
