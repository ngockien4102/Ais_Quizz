package com.ais.QuizService.dto.Request;

import com.ais.QuizService.entity.CategoryEntity;
import com.ais.QuizService.entity.QuestionChoiceEntity;
import com.ais.QuizService.entity.QuestionTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequest {

    private String content;

    private QuestionTypeEntity questionType;

    private CategoryEntity category;

    private String questionTime;

    private List<QuestionChoiceEntity> questionChoice = new ArrayList<>();
}
