package com.jpassgo.javaalgorithms.trie;

public class Trie {

  private static final String NEW_LINE = "\n";
  private static final String DIRECT_CHILD = "\n";
  private static final String LEFT_TREE = "/";
  private static final String RIGHT_TREE = "\\";
  private static final String SPACING = "  ";

  private Node root;

  public Trie() {
    this.root = new Node();
  }

  public void insert(String value) {
    char[] chars = value.toCharArray();

    insert(root, chars, 0);
  }

  private void insert(Node node, char[] chars, int index) {
    Character character = null;
    if (index <= chars.length - 1) {
      character = Character.valueOf(chars[index]);
    }

    if (node.getChildren().containsKey(Character.valueOf(chars[index]))) {
      insert(node.getChildren().get(character), chars, ++index);
    } else if (index < chars.length - 1) {
      Node newNode = new Node(character);
      node.addChild(newNode);
      insert(newNode, chars, ++index);
    } else if (index == chars.length - 1) {
      Node newNode = new Node(character);
      node.addChild(newNode);
      node.setIsCompleteWord();
    }
  }
}
