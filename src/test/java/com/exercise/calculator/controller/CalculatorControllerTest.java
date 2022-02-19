package com.exercise.calculator.controller;

import com.exercise.calculator.dto.OperationDto;
import com.exercise.calculator.dto.ResultDto;
import com.exercise.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CalculatorControllerTest {

    @Mock private CalculatorService calculatorService;
    @InjectMocks private CalculatorController calculatorController;

    @Test
    void addWithNullDtoTest() {
        final ResponseEntity<ResultDto> result = calculatorController.addOperation(null);

        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(ResponseEntity.badRequest().build());
    }

    /*@Test
    void addWithParametersOK() {
        OperationDto operationDto = new OperationDto(new BigDecimal(5) , new BigDecimal(100));
        final ResponseEntity<ResultDto> result = calculatorController.addOperation(operationDto);

        assertThat(result).isNotNull();
        assertThat(result.getBody().getResult()).isEqualTo(new BigDecimal(105));
    }*/

    @Test
    void subtractWithNullDtoTest() {
        final ResponseEntity<ResultDto> result = calculatorController.subtractOperation(null);

        assertThat(result).isNotNull();
        assertThat(result).isEqualTo(ResponseEntity.badRequest().build());
    }

   /*@Test
    void subtractWithParametersOK() {
        OperationDto operationDto = new OperationDto(new BigDecimal(5) , new BigDecimal(100));
        CalculatorController calCont = new CalculatorController(calculatorService);
        ResponseEntity<ResultDto> result = calCont.subtractOperation(operationDto);

        assertThat(result).isNotNull();
        assertThat(result.getBody().getResult()).isEqualTo(new BigDecimal(-95));
    }*/

}