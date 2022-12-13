package com.thoughtworks.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    public void returnFizzIfInputNumberIsDivisibleBy3() {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        String response = fizzbuzz.makeFizzBuzz("2");

        assertEquals("fizz", response);
    }
}