package org.fasttrack.exercises1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveMethodsTest {

    @Test
    public void sumOfFirstNRecursiveTest (){
        int input = 4;
        int expected = 12;
        Assertions.assertEquals(expected, RecursiveMethods.sumOfFirstNRecursive(0, input));

        input = 0;
        expected = 0;
        Assertions.assertEquals(expected, RecursiveMethods.sumOfFirstNRecursive(0, input));
    }

    @Test
    public void sumOfDigistsRecursiveTest (){
        int input = 436;
        int expected = 13;
        Assertions.assertEquals(expected, RecursiveMethods.sumOfDigistsRecursive(input));
    }

    @Test
    public void fibonacciRecursiveTest (){
        int input = 10;
        int expected = 55;
        Assertions.assertEquals(expected, RecursiveMethods.fibonacciRecursive(input));
    }
}
