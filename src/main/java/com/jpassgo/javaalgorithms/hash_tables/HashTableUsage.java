package com.jpassgo.javaalgorithms.hash_tables;

public class HashTableUsage {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put("first", 1);
        String first = hashTable.get("first");
        System.out.println(first);
    }
}
