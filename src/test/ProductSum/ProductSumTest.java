package test.ProductSum;

import main.ProductSum.ProductSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductSumTest {

    @Test
    void TestCase1() {
        List<Object> test = new ArrayList<>(Arrays.asList(5, 2, new ArrayList<Object>(Arrays.asList(7, -1)), 3, new ArrayList<Object>(Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        assertEquals(ProductSum.productSum(test), 12);
    }
}
