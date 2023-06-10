package com.example.calculator.service;

import static com.example.calculator.Constants.*;

import com.example.calculator.exceptions.ZeroDivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();
@Test
    public void shouldReturnCorrectSum() {
    assertEquals(THREE + TWO, service.sum(THREE, TWO));
    }
@Test
    public void shouldReturnCorrectSum2() {
    assertEquals(THREE + ONE, service.sum(THREE, ONE));
    }
@Test
    public void shouldReturnCorrectSubtract() {
    assertEquals(THREE - TWO, service.subtract(THREE, TWO));
    }
@Test
    public void shouldReturnCorrectSubtract2() {
    assertEquals(THREE - ONE, service.subtract(THREE, ONE));
    }
@Test
    public void shouldReturnCorrectDivide() {
    assertEquals(THREE / TWO, service.divide(THREE, TWO));
    }
@Test
    public void shouldReturnCorrectDivide2() {
    assertEquals(THREE / ONE, service.divide(THREE, ONE));
    }
@Test
    public void shouldReturnCorrectMultiply() {
    assertEquals(THREE * TWO, service.multiply(THREE, TWO));
    }
@Test
    public void shouldReturnCorrectMultiply2() {
    assertEquals(THREE * ONE, service.multiply(THREE, ONE));
    }
    @Test
    public void shouldThrowZeroDivideException() {
    assertThrows(ZeroDivideException.class, () -> service.divide(THREE, ZERO));
    }
    @Test
    public void shouldThrowZeroDivideException2() {
    assertThrows(ZeroDivideException.class, () -> service.divide(ONE, ZERO));
    }
}