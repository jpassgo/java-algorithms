package arrays_and_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UniqueCharacters {

    public static void main(String[] args) {
        String containsDuplicateCharacters = "bhujhbhybuhuibhuij";
        String containsNoDuplicateCharacters = "asdfghjkl";

        UniqueCharacters uniqueCharacters = new UniqueCharacters();

        System.out.println(uniqueCharacters.containsNoDuplicates(containsDuplicateCharacters));
        System.out.println(uniqueCharacters.containsNoDuplicates(containsNoDuplicateCharacters));
    }

    public boolean containsNoDuplicates(String input) {
        List<Character> charList = new ArrayList();

        for(char c : input.toCharArray()) {
            if(!charList.contains(c)) {
                charList.add(c);
            } else {
                return false;
            }
        }
        return true;
    }
}