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

    /**
     * Loop over each character in the second string. As soon as you find a character that exists in the first string
     * grab the index of the current string and then create a temporary copy of the first string. Remove the character
     * that is found in both strings from the temporary copy and then rinse and repeat for the next 3 contiguous
     * characters. Once done if the copy string is empty increment the counter.
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
