package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

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
}