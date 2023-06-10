package com.example.calculator.service;

import com.example.calculator.exceptions.ZeroDivideException;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculator.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();
    @MethodSource("provideParam")
    @ParameterizedTest
    public void shouldReturnCorrectSum(int num1, int num2) {
    assertEquals(num1 + num2, service.sum(num1, num2));
    }
    @MethodSource("provideParam")
    @ParameterizedTest
    public void shouldReturnCorrectSubtract(int num1, int num2) {
    assertEquals(num1 - num2, service.subtract(num1, num2));
    }
    @MethodSource("provideParam")
    @ParameterizedTest
    public void shouldReturnCorrectDivide(int num1, int num2) {
    assertEquals(num1 / num2, service.divide(num1, num2));
    }
    @MethodSource("provideParam")
    @ParameterizedTest
    public void shouldReturnCorrectMultiply(int num1, int num2) {
    assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    private static Stream<Arguments> provideParam() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, THREE),
                Arguments.of(THREE, THREE),
                Arguments.of(ZERO, ONE)
        );

    }
}