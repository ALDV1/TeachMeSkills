package com.homework5;

public class ChessBoard {
    public static void main(String[] args) {
        char[][] chessBoard = new char[8][8];
        for (int i = 0; i < chessBoard.length; ++i) {
            for (int j = 0; j < chessBoard.length; ++j) {
                if ((i + j) % 2 == 0) {
                    System.out.print('W' + " ");
                } else {
                    System.out.print('B' + " ");
                }
            }
            System.out.println();
        }
    }
}
