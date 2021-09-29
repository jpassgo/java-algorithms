package com.jpassgo.javaalgorithms.permutations;

public class OneEditAway {

    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "pales"));
        System.out.println(isOneEditAway("pble", "pale"));
        System.out.println(isOneEditAway("ple", "pale"));
        System.out.println(isOneEditAway("pslre", "pale"));
        System.out.println(isOneEditAway("plae", "pale"));
        System.out.println(isOneEditAway("p4le", "pale"));
    }

    public static boolean isOneEditAway(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        int difference = Math.abs((s1Chars.length - 1) - (s2Chars.length - 1));

        Integer diff = 0;

        if(difference == 0) {
            for (int i = 0; i < s1Chars.length - 1; i++) {
                if(s1Chars[i] != s2Chars[i]) {
                    diff++;
                }
            }
        } else if(difference == 1) {
            char[] big;
            char[] small;
            if(s1Chars.length > s2Chars.length) {
                big = s1Chars;
                small = s2Chars;
            } else {
                big = s2Chars;
                small = s1Chars;
            }

            int j = 0;
            for (int i = 0; i < s1Chars.length-1; i++) {
                if( (j < s2Chars.length -1) && s1Chars[i] == s2Chars[j]) {
                    j++;
                } else {
                    diff++;
                }
            }
        }
        return diff.compareTo(1) < 1;
    }
}
