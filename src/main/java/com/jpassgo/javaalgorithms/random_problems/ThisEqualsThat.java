package com.jpassgo.javaalgorithms.random_problems;

import java.util.ArrayList;
import java.util.List;

public class ThisEqualsThat {

  /**
   * The Problem: Print all positive integer solutions for a^3 + b^3 = c^3 + d^3 where a, b, c, d
   * are all integers between 1 and 1000.
   */
  public static void main(String[] args) {
    List<Pair> solutions = new ArrayList<Pair>();
    for (Integer a = 0; a < 1000; a++) {
      for (Integer b = 0; b < 1000; b++) {
        solutions.add(new Pair(a, b));
      }
    }
    for (Pair pair : solutions) {
      System.out.println(pair);
    }
  }
}
