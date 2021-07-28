package com.jpassgo.javaalgorithms.permutations;

public class ThisInThat {

    /**
     * How many permutations of a exist in b?
     *
     * Example:
     * a: abbc
     * b: cbabadcbbabbcbabaabccbabc
     *
     */

    public static void main(String[] args) {
        String firstString = "abbc";
        String secondString = "cbabadcbbabbcbabaabccbabc";

        int permutationCount = 0;

        for(char currentChar : secondString.toCharArray()) {
            String currentCharAsString = String.valueOf(currentChar);

            if(firstString.contains(currentCharAsString)) {
                int indexOfCurrentCharacter = secondString.indexOf(currentChar);

                String copyOfFirstString = firstString;
                copyOfFirstString = copyOfFirstString.replace(currentCharAsString, "");

                for (int i = indexOfCurrentCharacter; i < indexOfCurrentCharacter+3; i++) {
                    String nextChar = String.valueOf(secondString.toCharArray()[i]);
                    if(copyOfFirstString.contains(nextChar)) {
                        copyOfFirstString = copyOfFirstString.replace(nextChar, "");
                    }
                }

                if(copyOfFirstString.isBlank()) {
                    permutationCount++;
                }
            }
        }

        System.out.println("Number of permutations: " + permutationCount);
    }
}
