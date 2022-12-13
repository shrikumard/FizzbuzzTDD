package com.thoughtworks.practice;

public class Fizzbuzz {
    public String makeFizzBuzz(String input) {
        int inputNumber = Integer.parseInt(input);
        if(inputNumber % 3 == 0) {
            return "fizz";
        }
        return "buzz";
    }
}
