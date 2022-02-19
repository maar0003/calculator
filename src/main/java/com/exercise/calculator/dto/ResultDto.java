package com.exercise.calculator.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResultDto implements Serializable {
    private BigDecimal result;

    public ResultDto(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
                "result=" + result +
                '}';
    }
}
