package com.jpassgo.javaalgorithms.trie;

import lombok.Data;

@Data
public class Node {

  private char value;
  private Node parent;
  private Node[] children = new Node[26];

  public Node(char value) {
    this.value = value;
  }

  public Node() {
  }

  public void addChild(Node node) {
    for (int i = 0; i < children.length - 1; i++) {
      if(children[i] == null) {
        children[i] = node;
      }
    }
  }

  public int nonNullChildrenCount() {
    int numberOfNonNullChildren = 0;
    for(Node child : children) {
      if(child != null) {
        numberOfNonNullChildren++;
      }
    }
    return numberOfNonNullChildren;
  }
}
