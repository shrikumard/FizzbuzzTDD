package com.thoughtworks.practice;

public class Fizzbuzz {
    public String makeFizzBuzz(String input) {
        int inputNumber;

        try{
            inputNumber = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            System.err.print("Provided Input is not a number");
            return input;
        }

        if(isNumberDivisibleBy3And5(inputNumber)) {
            return "fizzbuzz";
        }
        if(isNumberDivisibleBy3(inputNumber)) {
            return "fizz";
        }
        if(isNumberDivisibleBy5(inputNumber)) {
            return "buzz";
        }

        return "not fizzy or buzzy";
    }

    private boolean isNumberDivisibleBy5(int inputNumber) {
        return inputNumber % 5 ==0;
    }

    private boolean isNumberDivisibleBy3(int inputNumber) {
        return inputNumber % 3 == 0;
    }

    private boolean isNumberDivisibleBy3And5(int inputNumber) {
        return isNumberDivisibleBy3(inputNumber) && isNumberDivisibleBy5(inputNumber);
    }
}
