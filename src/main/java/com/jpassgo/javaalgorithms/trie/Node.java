package com.jpassgo.javaalgorithms.trie;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Node {

    private char value;
    private Node parent;
    private Node[] children = new Node[26];

    public Node(char value) {
        this.value = value;
    }

    public void addChild(Node node) {
        int length = children.length-1;
        children[length+1] = node;
    }
}
