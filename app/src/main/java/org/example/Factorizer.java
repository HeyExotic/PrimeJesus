package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new Array<>();

    if (number<= 1) {
      return factors;
    }

    for (int i = 2; i <= number; i++) {
      while (number % i == 0) {
        factors.add(i);
        number /= i;
      }
    }
    return new ArrayList<>(new java.util.HashSet<>(factors));
  }
}
