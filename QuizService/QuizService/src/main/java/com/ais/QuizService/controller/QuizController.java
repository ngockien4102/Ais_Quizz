package com.ais.QuizService.controller;

import com.ais.QuizService.dto.Request.*;
import com.ais.QuizService.entity.CategoryEntity;
import com.ais.QuizService.entity.QuestionTypeEntity;
import com.ais.QuizService.service.CategoryService;
import com.ais.QuizService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    QuestionService questionService;

    //http://localhost:8080/quiz/createquestion
    @PostMapping("/createquestion")
    public void createQuestion(@RequestBody QuestionRequest request) {
        questionService.createQuestion(request);
    }

    //http://localhost:8080/quiz/editquestion
    @PutMapping("/editquestion")
    public void editQuestion(@RequestBody QuestionEditRequest request) {
        questionService.editQuestion(request);
    }

    //http://localhost:8080/quiz/getquestionbycategory/category
    @GetMapping("/getquestionbycategory/{category}")
    public List<QuestionRequest> getQuestionByCategory(@PathVariable("category") String name) {
        return questionService.getQuestionByCategory(name);
    }

    //http://localhost:8080/quiz/createCategory
    @PostMapping("/createCategory")
    public void createCategory(@RequestBody CategoryRequest category) {
        categoryService.createCategory(category);
    }

    //http://localhost:8080/quiz/editCategory
    @PutMapping("/editCategory")
    public void editCategory(@RequestBody CategoryEditRequest category) {
        categoryService.editCategory(category);
    }

    //http://localhost:8080/quiz/getAllCategory
    @GetMapping("/getAllCategory")
    public List<CategoryRequest> getAllCategory() {
        return categoryService.getAllCategory();
    }

    //http://localhost:8080/quiz/createquesiontype
    @PostMapping("/createquesiontype")
    public void createCategory(@RequestBody QuestionTypeRequest category) {
        questionService.createQuestionType(category);
    }

}
