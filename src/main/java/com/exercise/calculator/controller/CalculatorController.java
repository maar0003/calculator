package com.exercise.calculator.controller;

import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;
import com.exercise.calculator.service.CalculatorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/operations")
@Api(tags = "Calculadora")
public class CalculatorController {

    private final Logger log = LoggerFactory.getLogger(CalculatorController.class);
    private CalculatorService calculatorService;

    @GetMapping(value="/add")
    @ApiOperation(value="Operación de suma")
    public ResponseEntity<ResultDto> addOperation(@RequestBody final OperationDto operDto){
        log.debug("Request add operation ", operDto.toString());
        ResultDto resultDTO = new ResultDto();
        resultDTO = calculatorService.addOperation(operDto);

        return ResponseEntity.ok(resultDTO);
    }

    @GetMapping(value="/subtract")
    @ApiOperation(value="Operación de resta")
    public ResponseEntity<ResultDto> subtractOperation(@RequestBody final OperationDto operDto){
        log.debug("Request subtract operation ", operDto.toString());
        ResultDto resultDTO = new ResultDto();
        resultDTO = calculatorService.subtractOperation(operDto);

        return ResponseEntity.ok(resultDTO) ;
    }
}
