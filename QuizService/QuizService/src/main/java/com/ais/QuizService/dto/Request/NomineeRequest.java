package com.ais.QuizService.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NomineeRequest {
    private String name;
    private boolean status;
}
