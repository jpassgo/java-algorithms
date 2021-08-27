package com.jpassgo.javaalgorithms.trie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TrieTest {

  @Test
  void insert() {
    Trie trie = new Trie();
    trie.insert("hello");
  }

  @Test
  void print() {
    Trie trie = new Trie();
    trie.insert("hello");

    System.out.println(trie.print());
  }

}
