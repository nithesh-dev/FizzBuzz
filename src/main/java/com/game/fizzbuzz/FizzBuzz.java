package com.game.fizzbuzz;

public class FizzBuzz {

    public String play(int number) throws IllegalAccessException {
        if (number == 0) throw new IllegalAccessException("Number 0 is not valid");
        else if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }



}
