package com.exercise.calculator.service;

import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;

public interface CalculatorService {
    public ResultDto addOperation(OperationDto operDto);

    public ResultDto subtractOperation(OperationDto operDto);
}
