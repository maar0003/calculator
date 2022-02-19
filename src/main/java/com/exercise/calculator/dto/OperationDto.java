package com.exercise.calculator.dto;

public class OperationDto {
    long firstNumber;
    long secondNumber;

    public long getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(long firstNumber) {
        this.firstNumber = firstNumber;
    }

    public long getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(long secondNumber) {
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
