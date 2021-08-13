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

        if(isNodeNull(this.root)) {
            this.root = new Node(value);
        } else {
            recursiveInsert(this.root, node);
        }
    }

    public <T extends Comparable> void recursiveInsert(Node current, Node newNode) {
        if(isLessThanCurrentNode(current, newNode)) {
            if(!isLeftChildPresent(current)) current.setLeftChild(newNode);
            else {
                recursiveInsert(current.getLeftChild(), newNode);
            }
        } else if(isGreaterThanCurrentNode(current, newNode)) {
            if(!isRightChildPresent(current)) current.setRightChild(newNode);
            else {
                recursiveInsert(current.getRightChild(), newNode);
            }
        }
    }

    public <T extends Comparable> boolean contains(T value) {
        Node nodeToFind = new Node(value);
        return contains(this.root, nodeToFind);
    }

    private <T extends Comparable> boolean contains(Node currentNode, Node nodeToFind) {

            if(currentNode.getValue().compareTo(nodeToFind.getValue()) == 0) {
                return true;
            }
            if(isLessThanCurrentNode(currentNode, nodeToFind)) {
                return contains(currentNode.getLeftChild(), nodeToFind);
            }
            if(isGreaterThanCurrentNode(currentNode, nodeToFind)) {
                return contains(currentNode.getRightChild(), nodeToFind);
            }

        return false;
    }

    public  <T extends Comparable> void preorder(Node node, T value) {
        if(node != null) {
            System.out.println(node.getValue());
            preorder(node.getLeftChild(), value);
            preorder(node.getRightChild(), value);
        }
    }

    public  <T extends Comparable> void inorder(Node node, T value) {
        if(node != null) {
            inorder(node.getLeftChild(), value);
            System.out.println(node.getValue());
            inorder(node.getRightChild(), value);
        }
    }

    public  <T extends Comparable> void postorder(Node node, T value) {
        if(node != null) {
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

    private boolean isLeftChildPresent(Node node) {
        try {
            node.getLeftChild();
            if(node.getLeftChild() == null) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    private boolean isRightChildPresent(Node node) {
        try {
            node.getRightChild();
            if(node.getRightChild() == null) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean isNodeNull(Node node) {
        return node.getValue() == null;
    }
}
