package com.exercise.calculator.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class OperationDto implements Serializable {
    BigDecimal firstNumber;
    BigDecimal secondNumber;

    public OperationDto(BigDecimal firstNumber, BigDecimal secondnumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondnumber;
    }

    public BigDecimal getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(BigDecimal firstNumber) {
        this.firstNumber = firstNumber;
    }

    public BigDecimal getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(BigDecimal secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "OperationDto{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
