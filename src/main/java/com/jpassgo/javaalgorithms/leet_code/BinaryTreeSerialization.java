package com.jpassgo.javaalgorithms.leet_code;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*297. Serialize and Deserialize Binary Tree

Serialization is the process of converting a data structure or object into a sequence of bits so that it
can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later 
in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your 
serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be 
serialized to a string and this string can be deserialized to the original tree structure.

Clarification: The input/output format is the same as how LeetCode serializes a binary tree. 
You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself
.*/
public class BinaryTreeSerialization {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(100);
        TreeNode two = new TreeNode(90);
        TreeNode three = new TreeNode(400);
        TreeNode four = new TreeNode(80);
        TreeNode five = new TreeNode(95);
        TreeNode six = new TreeNode(300);
        TreeNode seven = new TreeNode(500);

        one.left = two;
        one.right = three;

        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;


        System.out.println(serialize(one));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        var serializedTree = new ArrayList<Integer>();
        return serialize(root, 0, serializedTree);
    }
    
    public static String serialize(TreeNode node, int index, List<Integer> serializedTree) {
        if (serializedTree.size() <= index) {
            serializedTree.addAll(IntStream.range(0, index * 2).boxed().collect(Collectors.toList()));
        }
        serializedTree.add(index, node.val);
        
        if (node.left != null) {
            serialize(node.left, (2 * index) + 1, serializedTree);
        }

        if (node.right != null) {
            serialize(node.right, (2 * index) + 2, serializedTree);
        }
        
        return serializedTree.toString();
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
    
}
