package com.jpassgo.javaalgorithms.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromePermutationChecker {

  public static void main(String[] args) {
    PalindromePermutationChecker palindromePermutationChecker = new PalindromePermutationChecker();
    System.out.println(palindromePermutationChecker.isPalindromePermutation("taco cat"));
    System.out.println(palindromePermutationChecker.isPalindromePermutation("atco cta"));
    System.out.println(palindromePermutationChecker.isPalindromePermutation("atcco cta"));
  }

  // Properties of a palindrome:
  // 1. Odd number of characters in the phrase or number.
  // 2. All but one character appears in even multiples.
  public boolean isPalindromePermutation(String inputString) {
    inputString = removeWhiteSpace(inputString);

    if (isInputStringLengthEven(inputString)) {
      return false;
    } else {
      Map<String, Integer> characterCountTracker = new HashMap();
      for (char c : inputString.toCharArray()) {
        String currentCharacter = Character.toString(c);
        if (characterCountTracker.containsKey(currentCharacter)) {
          characterCountTracker.replace(
              currentCharacter, characterCountTracker.get(currentCharacter) + 1);
        } else {
          characterCountTracker.put(currentCharacter, 1);
        }
      }

      return doCharactersExistInOddMultiples(characterCountTracker);
    }
  }

  private String removeWhiteSpace(String inputString) {
    return inputString.replaceAll("\\s", "");
  }

  private boolean isInputStringLengthEven(String inputString) {
    return inputString.length() % 2 == 0;
  }

  private boolean doCharactersExistInOddMultiples(Map<String, Integer> characterCountTracker) {
    boolean oddWasAlreadyFound = false;
    for (Entry<String, Integer> entry : characterCountTracker.entrySet()) {
      if (entry.getValue() % 2 == 1) {
        if (oddWasAlreadyFound) {
          return false;
        } else {
          oddWasAlreadyFound = true;
        }
      }
    }
    return true;
  }
}
