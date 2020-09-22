package test.FindString;

import main.FindString.FindString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindStringTest {

    List<String> a = Arrays.asList("Hello", "World");
    List<String> b = Arrays.asList("hi", "Rashad");

    @Test
    void TestCase1() {
        List<Boolean> expect = Arrays.asList(false,true);
        assertEquals(expect, FindString.stringArray(a,b));
    }
}
