package com.exercise.calculator.service.impl;

import com.exercise.calculator.controller.CalculatorController;
import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;
import com.exercise.calculator.service.CalculatorService;
import io.corp.calculator.TracerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private final Logger log = LoggerFactory.getLogger(CalculatorServiceImpl.class);
    private TracerImpl tracer = new TracerImpl();

    @Override
    public ResultDto addOperation(OperationDto operDto) {
        log.debug("Implementing add operation ", operDto.toString());
        BigDecimal firstNumber = operDto.getFirstNumber();
        BigDecimal secondNumber = operDto.getSecondNumber();
        ResultDto result = new ResultDto(firstNumber.add(secondNumber));

        tracer.trace(result);
        log.debug("Returning add operation ", result.toString());

        return result;
    }

    @Override
    public ResultDto subtractOperation(OperationDto operDto){
        log.debug("Implementing subtract operation ", operDto.toString());

        BigDecimal firstNumber = operDto.getFirstNumber();
        BigDecimal secondNumber = operDto.getSecondNumber();
        ResultDto result = new ResultDto(firstNumber.subtract(secondNumber));

        tracer.trace(result);
        log.debug("Returning subtract operation ", result.toString());

        return result;
    }
}
