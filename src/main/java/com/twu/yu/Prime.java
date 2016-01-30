package com.twu.yu;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public List<Integer> generate(int number) {
        List<Integer> factors = getFactors(number);
        return getPrime(factors);
    }

    private List<Integer> getPrime(List<Integer> factors) {
        ArrayList<Integer> prime = new ArrayList<Integer>();

        for (int factor : factors) {
            if (getFactors(factor).size() == 0) prime.add(factor);
        }
        return prime;
    }

    private List<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) factors.add(i);
        }
        return factors;
    }
}
