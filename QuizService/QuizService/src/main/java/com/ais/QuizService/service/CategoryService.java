package com.ais.QuizService.service;

import com.ais.QuizService.dto.Request.CategoryEditRequest;
import com.ais.QuizService.dto.Request.CategoryRequest;
import com.ais.QuizService.entity.QuestionTypeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    void createCategory(CategoryRequest category);

    void editCategory(CategoryEditRequest category);

    List<CategoryRequest> getAllCategory();

}
