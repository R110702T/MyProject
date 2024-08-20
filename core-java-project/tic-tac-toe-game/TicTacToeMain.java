package com;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.printBoard();
            System.out.println("Player " + game.getCurrentPlayer() + ", make your move (row and then next line column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                if (game.checkWin()) {
                    game.printBoard();
                    System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                    break;
                } else if (game.isBoardFull()) {
                    game.printBoard();
                    System.out.println("The game is a draw!");
                    break;
                }
                game.changePlayer();
            } else {
                System.out.println("This move is not valid.");
            }
        }
        scanner.close();
    }
}

