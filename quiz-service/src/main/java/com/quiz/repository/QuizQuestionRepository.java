package com.quiz.repository;

import com.quiz.entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion,Long> {

    @Query(value = "INSERT INTO quiz_questions(questions_id, quiz_id,user_answer)VALUES (:quesId,:quizId,:ans)", nativeQuery = true)
    void addQuesTionToQuiz(@Param("quesId") Long quesId, @Param("quizId") Long quizId,@Param("ans") String ans);

    @Query(value = "update quiz_questions set user_answer = :ans where questions_id =:ques and quiz_id=:quiz", nativeQuery = true)
    void updateUserAnswer(@Param("ques") Long ques, @Param("quiz") Long quiz,@Param("ans") String ans);

    @Query(value = "select * from quiz_questions where quiz_id = :id", nativeQuery = true)
    List<QuizQuestion> getDetailQuizByUser(@Param("id") Long quizId);
}


