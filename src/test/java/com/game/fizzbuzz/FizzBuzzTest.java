package com.game.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void onStartup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldThrowExceptionIfNumberIs0() {
        int number = 0;

        IllegalAccessException illegalAccessException = assertThrows(IllegalAccessException.class, () -> fizzBuzz.play(number));

        assertEquals("Number 0 is not valid", illegalAccessException.getMessage());
    }

    @Test
    void shouldReturnFizzWhenNumberIsDivisibleByOnly3() throws IllegalAccessException {

        String result = fizzBuzz.play(6);

        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnFizzWhenNumberIsDivisibleByOnly5() throws IllegalAccessException {

        String result = fizzBuzz.play(10);

        assertEquals("Buzz", result);
    }
    @Test
    void shouldReturnFizzWhenNumberIsDivisibleBy3And5() throws IllegalAccessException {

        String result = fizzBuzz.play(15);

        assertEquals("FizzBuzz", result);
    }

}