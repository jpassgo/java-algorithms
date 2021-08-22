package com.jpassgo.javaalgorithms.trie;

public class Trie {

    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String value) {
        char[] chars = value.toCharArray();

        insert(root, chars, 0);
    }

    private void insert(Node node, char[] chars, int index) {
        for(Node current : node.getChildren()) {
            if(current.getValue() == chars[index]) {
                insert(current, chars, ++index);
            }
        }
        node.addChild(new Node(chars[index]));
    }
}
