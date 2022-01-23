package com.ais.QuizService.exception;

import com.ais.QuizService.dto.Response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
    public BadRequestException(ExceptionResponse entity){
        super(entity.getCode()+": "+entity.getMassage());
    }

}
