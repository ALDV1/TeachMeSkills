package com.homework5;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; ++i) {
            for (int j = 0; j < chessBoard.length; ++j) {
                System.out.print(chessBoard[i][j] = ((i + j) % 2 == 0) ? "W " : "B ");
            }
            System.out.println();
        }
    }
}
