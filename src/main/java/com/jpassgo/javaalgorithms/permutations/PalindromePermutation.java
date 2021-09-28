package com.jpassgo.javaalgorithms.permutations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PalindromePermutation {

    List<Character> oddChars;

    public PalindromePermutation() {
        this.oddChars = new ArrayList();
    }

    public static void main(String[] args) {
        var palindromePermutation = new PalindromePermutation();
        System.out.println(palindromePermutation.isPalindromePermutation("tactcoa"));
    }

    public boolean isPalindromePermutation(String possiblePalindrome) {
        char[] possiblePalindromeChars = possiblePalindrome.toCharArray();

        if(possiblePalindromeChars.length % 2 == 0) return false;

        var charMap = new HashMap<Character, Integer>();

        for(char character : possiblePalindromeChars) {
            Character convertedChar = Character.valueOf(character);

            charMap.put(convertedChar, updateCharCount(charMap, convertedChar));
        }

        return oddChars.size() == 1;
    }



    private int updateCharCount(HashMap<Character, Integer> charMap, char character) {
        int count = getCharCount(charMap, character) + 1;
        if(count % 2 == 1) {
            oddChars.add(character);
        } else {
            oddChars.remove(oddChars.indexOf(character));
        }
        return count;
    }

    private Integer getCharCount(HashMap<Character, Integer> charMap, char character) {
        if(charMap.containsKey(character)) {
            return charMap.get(character);
        } else {
            return 0;
        }
    }
}
