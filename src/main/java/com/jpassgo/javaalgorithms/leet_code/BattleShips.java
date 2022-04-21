package com.jpassgo.javaalgorithms.leet_code;

/*
Given an m x n matrix board where each cell is a battleship 'X' or empty '.', return the number of the battleships on board.

Battleships can only be placed horizontally or vertically on board.
In other words, they can only be made of the shape 1 x k (1 row, k columns) or k x 1 (k rows, 1 column),
where k can be of any size. At least one horizontal or vertical cell separates between two battleships
(i.e., there are no adjacent battleships).

https://leetcode.com/problems/battleships-in-a-board/
*/

public class BattleShips {

    public static void main(String[] args) {
        char[][] board =  {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        System.out.println( countBattleships(board));
    }

    public static int countBattleships(char[][] board) {
        int battleShipCounter = 0;

        int rows = board.length;
        int columns = board[0].length;

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                if (board[x][y] == 'X') {
                    battleShipCounter++;
                    if (x < rows && board[x+1][y] == 'X') {
                        board = searchHorizontally(board, x, y);
                    } else if (y < columns && board[x][y+1] == 'X') {
                        board = searchVertically(board, x, y);
                    } else {
                        board[x][y] = '.';
                    }
                }
            }
        }
        return battleShipCounter;
    }

    public static char[][] searchVertically(char[][] board, int x, int y) {
        if (y > board[0].length || board[x][y+1] == '.') {
            return board;
        } else if (y < board[0].length && board[x][y+1] == '.') {
            board[x][y] = '.';
            return searchVertically(board, x, y+1);
        } else {
            return board;
        }
    }

    public static char[][] searchHorizontally(char[][] board, int x, int y) {
        if (x > board.length || board[x+1][y] == '.') {
            return board;
        } else if (x < board.length && board[x+1][y] == '.') {
            board[x][y] = '.';
            return searchHorizontally(board, x+1, y);
        } else {
            return board;
        }
    }


}
