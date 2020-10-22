package com.example.calculator_project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculate = new Calculator();
        assertEquals(10, calculate.add(5, 5));
    }

    @Test
    void subtract() {
        Calculator calculate = new Calculator();
        assertEquals(5, calculate.subtract(10, 5));
    }

    @Test
    void multiple() {
        Calculator calculate = new Calculator();
        assertEquals(25, calculate.multiple(5, 5));
    }

    @Test
    void divide() {
        Calculator calculate = new Calculator();
        assertEquals(1, calculate.divide(5, 5));
    }

//    @Test
//    void divide() {
//        Calculator calculate = new Calculator();
//        assertEquals(100, calculate.divide(5, 5));
//    }




}