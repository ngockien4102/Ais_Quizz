package com.ais.QuizService.service.impl;

import com.ais.QuizService.dto.Request.NomineeEditRequest;
import com.ais.QuizService.dto.Request.NomineeRequest;
import com.ais.QuizService.dto.Response.ExceptionResponse;
import com.ais.QuizService.entity.NomineeEntity;
import com.ais.QuizService.exception.ErrorCode;
import com.ais.QuizService.exception.ForbiddenException;
import com.ais.QuizService.repository.NomineeRepository;
import com.ais.QuizService.service.NomineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NomineeServiceImpl implements NomineeService {

    @Autowired
    NomineeRepository nomineeRepository;

    @Override
    public void createNominee(NomineeRequest nomineeRequest) {
        NomineeEntity nomineeEntity = new NomineeEntity();
        nomineeEntity.setName(nomineeRequest.getName());
        nomineeEntity.setStatus(nomineeRequest.isStatus());
        nomineeRepository.save(nomineeEntity);
    }

    @Override
    public void editNominee(NomineeEditRequest nomineeRequest) {
        NomineeEntity nomineeEntity = nomineeRepository.getById(nomineeRequest.getId());
        if(nomineeEntity==null){
            throw new ForbiddenException(new ExceptionResponse(ErrorCode.notFound));
        }
        nomineeEntity.setName(nomineeRequest.getName());
        nomineeEntity.setStatus(nomineeRequest.isStatus());
        nomineeRepository.save(nomineeEntity);
    }

    @Override
    public void deleteNominee(Long id) {
        NomineeEntity nomineeEntity = nomineeRepository.getById(id);
        if(nomineeEntity==null){
            throw new ForbiddenException(new ExceptionResponse(ErrorCode.notFound));
        }
        nomineeEntity.setStatus(false);
    }
}
