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
    for (Node child : node.getChildren()) {
      if(foundValueInTrie(chars, index, child)) {
        insert(child, chars, ++index);
      } else if(index < chars.length) {
        node.addChild(new Node(chars[index]));
      }
    }
  }

  public String print() {
    return print(root, new StringBuilder());
  }

  private String print(Node current, StringBuilder sb) {
    sb.append(current).append(NEW_LINE);
    sb.append(LEFT_TREE).append(SPACING);

    for (int i = 0; i < current.nonNullChildrenCount(); i++) {
      sb.append(DIRECT_CHILD).append(SPACING);
    }
    sb.append(RIGHT_TREE).append(NEW_LINE);


    for(Node child : current.getChildren()) {
      if(child != null) {
        sb.append(child.getValue()).append(SPACING);
      }
    }

    return sb.toString();
  }

  private boolean foundValueInTrie(char[] chars, int index, Node current) {
    return current != null && index < chars.length && current.getValue() == chars[index];
  }
}
