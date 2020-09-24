package test.FizzBuzz;

import main.FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    List<String> array = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

    @Test
    void TestCase1() {
        assertEquals(array, FizzBuzz.getFizzOrBuzz(15));
    }

    @Test
    void TestCase2() {
        assertEquals(array, FizzBuzz.fizzBuzz(15));
    }
}
