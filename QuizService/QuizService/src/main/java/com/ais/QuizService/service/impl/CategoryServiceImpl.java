package com.ais.QuizService.service.impl;

import com.ais.QuizService.dto.Request.CategoryEditRequest;
import com.ais.QuizService.dto.Request.CategoryRequest;
import com.ais.QuizService.entity.CategoryEntity;
import com.ais.QuizService.repository.CategoryRepository;
import com.ais.QuizService.repository.QuestionRepository;
import com.ais.QuizService.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void createCategory(CategoryRequest category) {
        if (categoryRepository.findByName(category.getName()) != null) {
            throw new RuntimeException("this category was existed !!!");
        }
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(category.getName());
        categoryEntity.setActive(category.isActive());
        categoryRepository.save(categoryEntity);
    }

    @Override
    public void editCategory(CategoryEditRequest request) {
        CategoryEntity categoryEntity = categoryRepository.getById(request.getId());
        if (categoryEntity == null) {
            throw new RuntimeException("this category not exist!!!");
        }
        categoryEntity.setName(request.getName());
        categoryEntity.setActive(request.isActive());
        categoryRepository.save(categoryEntity);
    }

    @Override
    public List<CategoryRequest> getAllCategory() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        List<CategoryRequest> categoryRequests = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntities){
            CategoryRequest categoryRequest = new CategoryRequest();
            categoryRequest.setName(categoryEntity.getName());
            categoryRequest.setActive(categoryEntity.isActive());
            categoryRequests.add(categoryRequest);
        }
        return categoryRequests;
    }


}
