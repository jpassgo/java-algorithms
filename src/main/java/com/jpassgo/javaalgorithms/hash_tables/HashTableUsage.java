package com.jpassgo.javaalgorithms.hash_tables;

public class HashTableUsage {
  public static void main(String[] args) {
    HashTable hashTable = new HashTable();
    hashTable.put("first", 1);
    Integer first = hashTable.get("first");
    System.out.println(first);
  }
}
