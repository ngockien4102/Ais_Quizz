package com.ais.QuizService.dto.Response;


import com.ais.QuizService.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
      private int code;
      private String massage;

      public ExceptionResponse(int code) {
            this.code = code;
            this.massage = ErrorCode.getErrorMessage(code);
      }
}
