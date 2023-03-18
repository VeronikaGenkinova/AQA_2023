package com.hillel.homework19;

import java.io.IOException;


public class Calculator {

    public int multiplyTest(int a, int b) {
        return a * b;
    }

    public int divideTest(int a, int b) throws IOException {
        try {
            return a / b;
        } catch (RuntimeException e) {
            throw new IOException();
        }
    }

    public int addTest(int a, int b) {
        return a + b;
    }

    public int subtractTest(int a, int b) {
        return a - b;
    }
}
