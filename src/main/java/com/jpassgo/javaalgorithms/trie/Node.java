package com.jpassgo.javaalgorithms.trie;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Node {

  private char value;
  private Node parent;
  private boolean isCompleteWord;
  private Map<Character, Node> children = new HashMap();

  public Node(char value) {
    this.value = value;
  }

  public Node(char value, Node parent) {
    this.value = value;
    this.parent = parent;
    this.parent.addChild(this);
  }

  public void addChild(Node node) {
    this.children.put(Character.valueOf(node.getValue()), node);
  }

  public boolean isCompleteWord() {
    return isCompleteWord;
  }

  public void setIsCompleteWord() {
    isCompleteWord = true;
  }
}
