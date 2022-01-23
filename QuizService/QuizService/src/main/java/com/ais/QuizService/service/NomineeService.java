package com.ais.QuizService.service;

import com.ais.QuizService.dto.Request.NomineeEditRequest;
import com.ais.QuizService.dto.Request.NomineeRequest;

public interface NomineeService {
    void createNominee(NomineeRequest nomineeRequest);

    void editNominee(NomineeEditRequest nomineeRequest);

    void deleteNominee(Long id);
}
