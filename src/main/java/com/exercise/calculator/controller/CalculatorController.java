package com.exercise.calculator.controller;

import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;
import com.exercise.calculator.service.CalculatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/operations")
@Api(tags = "Calculadora")
public class CalculatorController {

    private final Logger log = LoggerFactory.getLogger(CalculatorController.class);
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping(value="/add")
    @ApiOperation(value="Operación de suma")
    public ResponseEntity<ResultDto> addOperation(@RequestBody final OperationDto operDto){
        log.debug("OperationDto add operation ", operDto.toString());
        ResultDto resultDTO = null;
        if(operDto != null){
            resultDTO = calculatorService.addOperation(operDto);
            return ResponseEntity.ok(resultDTO);
        }
        return ResponseEntity.badRequest().body(resultDTO);
    }

    @PostMapping(value="/subtract")
    @ApiOperation(value="Operación de resta")
    public ResponseEntity<ResultDto> subtractOperation(@RequestBody final OperationDto operDto){
        log.debug("OperationDto subtract operation ", operDto.toString());
        ResultDto resultDTO = null;
        if(operDto != null){
            resultDTO = calculatorService.subtractOperation(operDto);
            return ResponseEntity.ok(resultDTO);
        }
        return ResponseEntity.badRequest().body(resultDTO);
    }
}
