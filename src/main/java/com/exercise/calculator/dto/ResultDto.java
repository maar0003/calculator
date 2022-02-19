package com.exercise.calculator.dto;

public class ResultDto{
    private long result;

    public ResultDto() {
        result = Long.parseLong(null);
    }

    public ResultDto(long result) {
        this.result = result;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
                "result=" + result +
                '}';
    }
}
