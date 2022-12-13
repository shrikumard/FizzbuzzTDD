package com.thoughtworks.practice;

public class Fizzbuzz {
    public String makeFizzBuzz(String input) {
        int inputNumber = Integer.parseInt(input);

        if(inputNumber % 3 == 0 && inputNumber % 5 == 0) {
            return "fizzbuzz";
        }
        if(inputNumber % 3 == 0) {
            return "fizz";
        }
        if(inputNumber % 5 ==0) {
            return "buzz";
        }

        return "not fizzy or buzzy";
    }
}
