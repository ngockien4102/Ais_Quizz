package com.quiz.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

import static javax.persistence.FetchType.EAGER;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quiz")
public class Quiz  {

    @Id
    @SequenceGenerator(name = "quiz_generator", sequenceName = "quiz_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quiz_generator")
    private long id;

    private String description;
    private int quizTime;
    private long userId;
    private Date startTime;
    private Date endTime;
    private Date expiredTime;
    private String status;
    private int numberQuestions;
    private String score;

    @ManyToMany(fetch = EAGER)
    private List<Question> questions = new ArrayList<>();

}
