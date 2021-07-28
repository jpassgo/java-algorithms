package com.jpassgo.javaalgorithms.hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable {

  private List<List<Node>> hashTable;

  public HashTable() {
    this.hashTable = new ArrayList<>(200000000);
  }

  public <T> T get(String key) {
    int index = hash(key);

    T value = null;

    for (Node node : hashTable.get(index)) {
      if (node.getKey().equals(key)) {
        value = (T) node.getValue();
      }
    }

    return value;
  }

  public <T> int put(String key, T value) {
    int index = hash(key);
    if (index > hashTable.size()) {
      resize(index);
    }
    try {
      hashTable.get(index).add(new Node<T>(key, value));
    } catch (IndexOutOfBoundsException e) {
      resize(index);
      hashTable.add(index, Arrays.asList(new Node<T>(key, value)));
    }
    return index;
  }

  private int resize(int newSize) {
    for (int i = hashTable.size(); i < newSize; i++) {
      hashTable.add(null);
    }
    return newSize;
  }

  private int hash(String key) {
    int hash = 7;
    for (int i = 0; i < key.length(); i++) {
      hash = hash * 21 + key.charAt(i);
    }
    return hash;
  }
}
