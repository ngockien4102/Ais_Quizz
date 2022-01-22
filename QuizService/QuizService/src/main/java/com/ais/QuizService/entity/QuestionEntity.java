package com.ais.QuizService.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
public class QuestionEntity {
    @Id
    @SequenceGenerator(name = "question_generator", sequenceName = "question_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "question_generator")
    private long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private QuestionTypeEntity questionType;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private CategoryEntity category;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
//    @JsonIgnore
    private List<QuestionChoiceEntity> questionChoice = new ArrayList<>();
    private  String questionTime;
}