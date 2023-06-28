package com.example.slm_exam_file.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialControllerTest {


    //test for one digit number
    @Test
    void factorialOneDigitNumber() {
        FactorialController controller = new FactorialController();

        int result = controller.factorial(5);
        assertEquals(120,result);

    }
    @Test
    void factorialZero(){
        FactorialController controller = new FactorialController();
        int result = controller.factorial(0);
        assertEquals(1,result);
    }

    @Test
    void runningTotalWithoutUsage() {
        FactorialController controller = new FactorialController();

        int result = controller.total();
        assertEquals(0,result);
    }

    @Test
    void runningTotalOneUse() {
        FactorialController controller = new FactorialController();
        controller.factorial(5);
        int result = controller.total();
        assertEquals(120,result);
    }
    @Test
    void runningTotalTwoUses() {
        FactorialController controller = new FactorialController();
        controller.factorial(5);
        controller.factorial(5);
        int result = controller.total();
        assertEquals(240,result);
    }


}