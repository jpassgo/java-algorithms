package com.jpassgo.javaalgorithms.random_problems;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pair<T> {
  T first;
  T second;

  @Override
  public String toString() {
    return "Pair{" + "first=" + first + ", second=" + second + '}';
  }
}
