package com.jpassgo.javaalgorithms.avl_tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node<T extends Comparable> {

  private T value;
  private int balanceFactor;
  private int height;
  private Node leftChild;
  private Node rightChild;

  public Node(T value) {
    this.value = value;
  }

  public void updateHeight() {
    int leftSubTreeHeight = leftChild == null ? -1 : leftChild.height;
    int rightSubTreeHeight = rightChild == null ? -1 : rightChild.height;

    this.height = 1 + Math.max(leftSubTreeHeight, rightSubTreeHeight);
  }

  public void updateBalanceFactor() {
    int leftSubTreeHeight = leftChild == null ? -1 : leftChild.height;
    int rightSubTreeHeight = rightChild == null ? -1 : rightChild.height;

    this.balanceFactor = rightSubTreeHeight - leftSubTreeHeight;
  }

  public Node balance() {

    // This indicates a left heavy subtree
    if (this.getBalanceFactor() == -2) {
      if (this.getLeftChild().getBalanceFactor() <= 0) {
        return leftLeftCase(this);
      } else {
        return leftRightCase(this);
      }
      // This indicates a right heavy subtree
    } else if (this.getBalanceFactor() == 2) {
      if (this.getRightChild().getBalanceFactor() >= 0) {
        return rightRightCase(this);
      } else {
        return rightLeftCase(this);
      }
    }

    return this;
  }

  private Node rightLeftCase(Node<T> node) {
    node.setRightChild(rightRotation(node.getRightChild()));
    return rightRightCase(node);
  }

  private Node rightRightCase(Node<T> node) {
    return leftRotation(node);
  }

  private Node leftRightCase(Node<T> node) {
    node.setLeftChild(leftRotation(node.getLeftChild()));
    return leftLeftCase(node);
  }

  private Node leftLeftCase(Node node) {
    return rightRotation(node);
  }

  private Node leftRotation(Node node) {
    Node parent = node.getRightChild();
    node.setRightChild(parent.getLeftChild());
    parent.setLeftChild(node);

    node.updateHeight();
    node.updateBalanceFactor();
    return parent;
  }

  private Node rightRotation(Node node) {
    Node parent = node.getLeftChild();
    node.setLeftChild(parent.getRightChild());
    parent.setRightChild(node);

    node.updateHeight();
    node.updateBalanceFactor();
    return parent;
  }
}
