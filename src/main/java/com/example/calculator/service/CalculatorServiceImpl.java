package com.example.calculator.service;

import com.example.calculator.exceptions.ZeroDivideException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int divide(int num1, int num2) {

        if (num2 == 0) {
            throw new ZeroDivideException();
        }

        return num1 / num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
