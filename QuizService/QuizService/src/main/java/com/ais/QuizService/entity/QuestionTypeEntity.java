package com.ais.QuizService.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questionType")
public class QuestionTypeEntity {
    @Id
    @SequenceGenerator(name = "questionT_generator", sequenceName = "questionT_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionT_generator")
    private long id;

    private String name;
}
