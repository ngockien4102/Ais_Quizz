package com.ais.QuizService.dto.Request;

import com.ais.QuizService.entity.CategoryEntity;
import com.ais.QuizService.entity.QuestionChoiceEntity;
import com.ais.QuizService.entity.QuestionTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionEditRequest {
    private Long id;

    private String content;

    private QuestionTypeEntity questionType;

    private CategoryEntity category;

    private List<QuestionChoiceEntity> questionChoice = new ArrayList<>();

    private String questionTime;
}
