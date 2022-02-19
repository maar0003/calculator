package com.exercise.calculator.service.impl;

import com.exercise.calculator.controller.CalculatorController;
import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;
import com.exercise.calculator.service.CalculatorService;
import io.corp.calculator.TracerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorServiceImpl implements CalculatorService {

    private final Logger log = LoggerFactory.getLogger(CalculatorServiceImpl.class);
    private TracerImpl trace;

    public ResultDto addOperation(OperationDto operDto) {
        log.debug("Implementing add operation ", operDto.toString());
        long firstNumber = operDto.getFirstNumber();
        long secondNumber = operDto.getSecondNumber();
        ResultDto result = new ResultDto(firstNumber + secondNumber);

        trace.trace(result);
        log.debug("Returning add operation ", result.toString());

        return result;
    }

    public ResultDto subtractOperation(OperationDto operDto){
        log.debug("Implementing subtract operation ", operDto.toString());

        long firstNumber = operDto.getFirstNumber();
        long secondNumber = operDto.getSecondNumber();
        ResultDto result = new ResultDto(firstNumber - secondNumber);

        trace.trace(result);
        log.debug("Returning subtract operation ", result.toString());

        return result;
    }
}
