package com.ais.QuizService.exception;


import com.ais.QuizService.dto.Response.ExceptionResponse;

public class ForbiddenException extends RuntimeException{
    public ForbiddenException(ExceptionResponse exceptionDto) {
        super(exceptionDto.getMassage()+": "+exceptionDto.getCode());
    }
}
