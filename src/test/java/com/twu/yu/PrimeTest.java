package com.twu.yu;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class PrimeTest {
    @Test
    public void shouldThePrimeFactorsOf1IsEmpty() throws Exception {
        Prime prime = new Prime();
        assertEquals(prime.generate(1), new ArrayList<Integer>());
    }

    @Test
    public void shouldThePrimeFactorsOf30Is2and3and5() throws Exception {
        Prime prime = new Prime();
        assertEquals(prime.generate(30), asList(2, 3, 5));
    }

    @Test
    public void shouldThePrimeFactorsOf4Is2() throws Exception {
        Prime prime = new Prime();
        assertEquals(prime.generate(4), asList(2));
    }

    @Test
    public void shouldThePrimeFactorsOf60Is2and3and5() throws Exception {
        Prime prime = new Prime();
        assertEquals(prime.generate(60), asList(2, 3, 5));
    }
}