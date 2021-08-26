package com.jpassgo.javaalgorithms.trees;

public class Node<T extends Comparable> {

  private Object value;
  private Node parent;
  private Node leftChild;
  private Node rightChild;

  public <T extends Comparable> Node(T value) {
    this.value = value;
  }

  public <T extends Comparable<T>> T getValue() {
    return (T) this.value;
  }

  public <T extends Comparable> void setValue(T value) {
    this.value = value;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(Node leftChild) {
    leftChild.setParent(this);
    this.leftChild = leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

  public void setRightChild(Node rightChild) {
    rightChild.setParent(this);
    this.rightChild = rightChild;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public boolean isLeftChildPresent() {
    if (this.leftChild == null) {
      return false;
    }
    return true;
  }

  public boolean isRightChildPresent() {
    if (this.rightChild == null) {
      return false;
    }
    return true;
  }

  public boolean isLeafNode() {
    return !isLeftChildPresent() && !isRightChildPresent();
  }

  @Override
  public String toString() {
    return "Node{"
        + "value="
        + value
        + ", leftChild="
        + leftChild
        + ", rightChild="
        + rightChild
        + '}';
  }
}
