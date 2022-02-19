package com.exercise.calculator.service;

import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;

public interface CalculatorService {

    ResultDto addOperation(OperationDto operDto);
    ResultDto subtractOperation(OperationDto operDto);
}
