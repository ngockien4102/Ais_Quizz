package com.ais.QuizService.exception;


import com.ais.QuizService.dto.Response.ExceptionResponse;

public class DuplicateException extends RuntimeException{
    public DuplicateException(ExceptionResponse exceptionResponse) {
        super(exceptionResponse.getCode()+": "+exceptionResponse.getMassage());
    }
}
