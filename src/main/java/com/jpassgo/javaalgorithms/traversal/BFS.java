package com.jpassgo.javaalgorithms.traversal;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(100,
                new TreeNode(80,
                        new TreeNode(60), new TreeNode(90)),
                    new TreeNode(120, new TreeNode(115), new TreeNode(150)));

        System.out.println(bfs(node, 600));
        System.out.println(bfs(node, 60));
        System.out.println(bfs(node, 115));
    }

    public static boolean bfs(TreeNode node, int value) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(node);

        while (queue.size() > 0) {
            TreeNode currentNode = queue.remove();
            if (currentNode.getValue() == value) {
                return true;
            }

            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        return false;
    }
}
