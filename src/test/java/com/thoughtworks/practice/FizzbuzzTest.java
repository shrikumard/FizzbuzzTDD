package com.thoughtworks.practice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    private static final ByteArrayOutputStream err = new ByteArrayOutputStream();
    private static final PrintStream originalErr = System.err;

    @BeforeAll
    public static void setStream() {
        System.setErr(new PrintStream(err));
    }

    @AfterAll
    public static void restoreStream() {
        System.setErr(originalErr);
    }

    @Test
    public void returnFizzIfInputNumberIsDivisibleBy3() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("3");

        assertEquals("fizz", response);
    }

    @Test
    public void returnBuzzIfInputNumberIsDivisibleBy5() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("5");

        assertEquals("buzz", response);
    }

    @Test
    public void returnFizzBuzzIfInputNumberIsDivisibleBy5And3(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("15");

        assertEquals("fizzbuzz", response);
    }

    @Test
    public void returnNotFizzyOrBuzzyIfInputNumberNotDivisibleBy3Or5(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("4");

        assertEquals("not fizzy or buzzy", response);
    }

    @Test
    public void returnInputStringIfInputIsNotANumber() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("sample");

        assertEquals("sample", response);
    }

    @Test
    public void printErrorMessageInConsoleIfInputIsNotANumber() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        fizzbuzz.makeFizzBuzz("sample");

        assertEquals("Provided Input is not a number", err.toString());
    }
}