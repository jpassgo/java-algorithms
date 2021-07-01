package arrays_and_strings;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String duplicatesRemoved = removeDuplicates.removeDuplicates("aasdfgggghhjkuiuu");
        System.out.println(duplicatesRemoved);
    }

    public String removeDuplicates(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            for (int j = i+1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    String updatedString =  String.valueOf(chars);
                    chars = updatedString.substring(0, j).concat(updatedString.substring(j+1, chars.length)).toCharArray();
                }
            }
        }
        return String.valueOf(chars);
    }
}
