package com.jpassgo.javaalgorithms.trees;

public class BinarySearchTree {

  private Node root;

  public BinarySearchTree() {
    this.root = new Node(null);
  }

  public BinarySearchTree(Node root) {
    this.root = root;
  }

  public <T extends Comparable> void insert(T value) {
    Node node = new Node(value);

    if (isNodeNull(this.root)) {
      this.root = new Node(value);
    } else {
      insert(this.root, node);
    }
  }

  public <T extends Comparable> boolean contains(T value) {
    return contains(this.root, new Node(value));
  }

  public <T extends Comparable> T delete(T value) {
    return delete(this.root, new Node(value));
  }

  private <T extends Comparable> void insert(Node current, Node newNode) {
    if (isLessThanCurrentNode(current, newNode)) {
      if (!current.isLeftChildPresent()) current.setLeftChild(newNode);
      else {
        insert(current.getLeftChild(), newNode);
      }
    } else if (isGreaterThanCurrentNode(current, newNode)) {
      if (!current.isRightChildPresent()) current.setRightChild(newNode);
      else {
        insert(current.getRightChild(), newNode);
      }
    }
  }

  private <T extends Comparable> boolean contains(Node currentNode, Node nodeToFind) {
    if (currentNode == null) {
      return false;
    }
    if (currentNode.getValue().compareTo(nodeToFind.getValue()) == 0) {
      return true;
    }
    return isLessThanCurrentNode(currentNode, nodeToFind)
        ? contains(currentNode.getLeftChild(), nodeToFind)
        : contains(currentNode.getRightChild(), nodeToFind);
  }

  private <T> T delete(Node currentNode, Node nodeToFind) {
    if (currentNode == null) {
      throw new ElementNotFoundException(
          String.format("Element not found: %s", nodeToFind.toString()));
    }

    if (currentNode.getValue().equals(nodeToFind.getValue())) {
      deleteNode(currentNode);
    }

    if (isLessThanCurrentNode(currentNode, nodeToFind)) {
      delete(currentNode.getLeftChild(), nodeToFind);
    } else if (isGreaterThanCurrentNode(currentNode, nodeToFind)) {
      delete(currentNode.getRightChild(), nodeToFind);
    }

    throw new ElementNotFoundException(
        String.format("Element not found: %s", nodeToFind.toString()));
  }

  private void deleteNode(Node node) {
    if (node.isLeafNode()) {
      if (node.getParent().getLeftChild() == node) {
        node.getParent().setLeftChild(null);
      } else {
        node.getParent().setRightChild(null);
      }
    } else if (node.isLeftChildPresent() && !node.isRightChildPresent()) {
      node.getLeftChild().setParent(node.getParent());
      node = node.getLeftChild();
    } else if (!node.isLeftChildPresent() && node.isRightChildPresent()) {
      node.getRightChild().setParent(node.getParent());
      node = node.getRightChild();

    } else { // By process of elimination both children are present
      Node smallestNode = findSmallestNode(node.getRightChild());
      node = smallestNode;
      delete(node, smallestNode);
    }
  }

  private Node findSmallestNode(Node current) {
    return !current.isLeftChildPresent() ? current : findSmallestNode(current.getLeftChild());
  }

  public <T extends Comparable> void preorder() {
    preorder(this.root);
  }

  private <T extends Comparable> void preorder(Node node) {
    if (node != null) {
      System.out.println(node.getValue());
      preorder(node.getLeftChild());
      preorder(node.getRightChild());
    }
  }

  public <T extends Comparable> void inorder(Node node, T value) {
    if (node != null) {
      inorder(node.getLeftChild(), value);
      System.out.println(node.getValue());
      inorder(node.getRightChild(), value);
    }
  }

  public <T extends Comparable> void postorder(Node node, T value) {
    if (node != null) {
      postorder(node.getLeftChild(), value);
      postorder(node.getRightChild(), value);
      System.out.println(node.getValue());
    }
  }

  private boolean isGreaterThanCurrentNode(Node current, Node newNode) {
    return current.getValue().compareTo(newNode.getValue()) < 0;
  }

  private boolean isLessThanCurrentNode(Node current, Node newNode) {
    return current.getValue().compareTo(newNode.getValue()) > 0;
  }

  public boolean isNodeNull(Node node) {
    return node.getValue() == null;
  }
}
