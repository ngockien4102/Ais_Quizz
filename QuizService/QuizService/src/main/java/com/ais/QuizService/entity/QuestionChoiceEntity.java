package com.ais.QuizService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questionChoice")
public class QuestionChoiceEntity {
    @Id
    @SequenceGenerator(name = "questionC_generator", sequenceName = "questionC_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionC_generator")
    private long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity question;

    private String name;

    private String isTrue;
}
