package com.jpassgo.javaalgorithms.traversal;

import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(100,
                new TreeNode(80,
                        new TreeNode(60), new TreeNode(90)),
                new TreeNode(120, new TreeNode(115), new TreeNode(150)));

        System.out.println(depthFirstSearch(node, 600));
        System.out.println(depthFirstSearch(node, 60));
        System.out.println(depthFirstSearch(node, 115));

        System.out.println(recursiveDFS(node, 600));
        System.out.println(recursiveDFS(node, 60));
        System.out.println(recursiveDFS(node, 115));
    }

    public static <T extends Comparable> boolean depthFirstSearch(TreeNode node, T value) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            node = stack.pop();
            if (value.compareTo(node.getValue()) == 0) {
                return true;
            }

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
        }

        return false;
    }

    public static <T extends Comparable> boolean recursiveDFS(TreeNode node, T value) {
        return recursiveDFS(node, value, false);
    }

    public static <T extends Comparable> boolean recursiveDFS(TreeNode node, T value, boolean found) {
        if (value.compareTo(node.getValue()) == 0) {
            found = true;
        }

        if (found == false && node.getLeft() != null) {
            return recursiveDFS(node.getLeft(), value, found);
        }

        if (found == false && node.getRight() != null) {
            return recursiveDFS(node.getRight(), value, found);
        }

        return found;
    }
}
