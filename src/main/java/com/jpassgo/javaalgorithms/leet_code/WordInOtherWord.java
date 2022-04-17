package com.jpassgo.javaalgorithms.leet_code;

import java.util.HashMap;
import java.util.Map;

public class WordInOtherWord {

    /* Given a large string and a smaller string, is the small string a substring of the larger string? */

    private static final String DEFAULT_LARGE_STRING =
            "Given a large string and a smaller string, is the small string a substring of the larger string";

    public static void main(String[] args) {
        System.out.println(isWordPresent(DEFAULT_LARGE_STRING,"substring"));
        System.out.println(isWordPresent(DEFAULT_LARGE_STRING,"fail"));
    }

    public static class TrieNode {

        private Map<Character, TrieNode> children;
        private boolean isCompleteWord;

        public TrieNode() {
            this.children = new HashMap<Character, TrieNode>();
            this.isCompleteWord = false;
        }

        public Map<Character, TrieNode> getChildren() {
            return children;
        }

        public void setChildren(Map<Character, TrieNode> children) {
            this.children = children;
        }

        public boolean isCompleteWord() {
            return isCompleteWord;
        }

        public void setCompleteWord(boolean completeWord) {
            isCompleteWord = completeWord;
        }
    }

    public static boolean isWordPresent(String stringToBeSearched, String word) {
        /*1. Transform the stringToBeSearched into a Trie datastructure
          2. Search for the searchString in the stringToBeSearched*/

        TrieNode trie = populateTrie(stringToBeSearched);

        return isWordInTrie(trie, word);
    }

    private static TrieNode populateTrie(String sourceString) {
        TrieNode root = new TrieNode();

        for (String word : sourceString.split(" ")) {
            root = addWordToTrie(root, word);
        }

        return root;
    }

    private static TrieNode addWordToTrie(TrieNode root, String word) {
        TrieNode currentNode = root;
        for (char c : word.toCharArray()) {
            if (!currentNode.getChildren().containsKey(c)) {
                currentNode.getChildren().put(c, new TrieNode());
            }
            currentNode = currentNode.getChildren().get(c);
        }
        currentNode.setCompleteWord(true);
        return root;
    }

    private static boolean isWordInTrie(TrieNode root, String word) {
        TrieNode currentNode = root;

        for (char c : word.toCharArray()) {
            if (currentNode.getChildren().containsKey(c)) {
                currentNode = currentNode.getChildren().get(c);
            } else {
                break;
            }
        }
        return currentNode.isCompleteWord();
    }

}
