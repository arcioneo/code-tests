package com;

import beans.WINNER;

public class TicTacToeEvaluator {

	public WINNER getWinnerPlayer(char[][] game) {
		return isInvalidBoard(game) ? WINNER.INVALID_BOARD : selectWinner(game);
	}

	private WINNER selectWinner(char[][] game) {
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[row].length; col++) {
				if ((isHorizontalWin(game, row) || isVerticalWin(game, col) || isDiagonalWin(game, row, col))
						&& game[row][col] == 'O') {
					return WINNER.PLAYER_1;
				} else if ((isHorizontalWin(game, row) || isVerticalWin(game, col) || isDiagonalWin(game, row, col))
						&& game[row][col] == 'X') {
					return WINNER.PLAYER_2;
				}
			}
		}
		return WINNER.TIE;
	}

	private boolean isHorizontalWin(char[][] game, int row) {
		return game[row][0] == game[row][1] && game[row][0] == game[row][2];
	}

	private boolean isVerticalWin(char[][] game, int col) {
		return game[0][col] == game[1][col] && game[0][col] == game[2][col];
	}

	private boolean isDiagonalWin(char[][] game, int row, int col) {
		return (game[0][0] == game[1][1] && game[0][0] == game[2][2])
				|| (game[0][2] == game[1][1] && game[0][2] == game[2][0]);
	}

	private boolean isInvalidBoard(char[][] game) {
		return isInvalidInput(game) || isInvalidCount(game);
	}

	private boolean isInvalidInput(char[][] game) {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (game[i][j] != ' ' && game[i][j] != 'O' && game[i][j] != 'X') {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isInvalidCount(char[][] game) {
		int counter = 0;
		int counterX = 0;
		int counterO = 0;

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (game[i][j] != 'O' && game[i][j] != 'X') {
					counter++;
				}
				if (game[i][j] == 'O') {
					counterO++;
				} else if (game[i][j] == 'X') {
					counterX++;
				}
			}
		}

		return counter >= 5 || !((counterX == counterO + 1) || (counterO == counterX + 1));
	}

}
