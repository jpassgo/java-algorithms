package com.jpassgo.javaalgorithms.avl_tree;

public class AVLTree {

  private Node root;

  public AVLTree() {
    this.root = root;
  }

  public <T extends Comparable> boolean insert(T value) {
    if (value == null || contains(value)) {
      return false;
    } else {
      this.root = insert(root, value);
    }

    return true;
  }

  private <T extends Comparable> Node insert(Node node, T value) {
    if (node == null) {
      return new Node(value);
    }
    if (node.getValue().compareTo(value) > 0) {
      Node newLeftChild = new Node(value);
      if (node.getLeftChild() != null) {
        newLeftChild = insert(node.getLeftChild(), value);
      }
      node.setLeftChild(newLeftChild);
    } else if (node.getValue().compareTo(value) < 0) {
      Node newRightChild = new Node(value);
      if (node.getRightChild() != null) {
        newRightChild = insert(node.getRightChild(), value);
      }
      node.setRightChild(newRightChild);
    }

    node.updateHeight();
    node.updateBalanceFactor();

    return node.balance();
  }

  public <T extends Comparable> boolean contains(T value) {
    return contains(root, value);
  }

  private <T extends Comparable> boolean contains(Node node, T value) {
    if (this.root == null || node.getValue() == null) {
      return false;
    }
    if (node.getValue().compareTo(value) > 0) {
      if (node.getLeftChild() != null) {
        contains(node.getLeftChild(), value);
      }
    } else if (node.getValue().compareTo(value) < 0) {
      if (node.getRightChild() != null) {
        contains(node.getRightChild(), value);
      }
    } else {
      return true;
    }

    return false;
  }
}
