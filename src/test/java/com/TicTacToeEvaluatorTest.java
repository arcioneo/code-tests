package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import beans.WINNER;

/*

Tic-Tac-Toe Solver

|X X O|
|O X O|
|X O X|

Requirements:

* Class that uses the board to determine winner with a few options
	* Simply check if there is a winner
	* Check if a particular player won
	* Check if the provided board ends in a tie
	* Check if the board is valid


*/
public class TicTacToeEvaluatorTest {
	
	private TicTacToeEvaluator subject;

    @Before
    public void setUp() {
        subject = new TicTacToeEvaluator();
    }

    @Test
    public void getWinnerPlayer() {
    	char [][]playerOneWins = {
    		{'X', 'X', 'X'},
    		{' ', ' ', 'O'},
    		{' ', ' ', 'O'}
    	};
    	
    	char [][]playerTwoWins = {
        		{'X', ' ', 'X'},
        		{'O', 'O', 'O'},
        		{' ', ' ', ' '}
        	};
    	
    	char [][]tie = {
        		{'X', 'X', 'O'},
        		{'O', 'O', 'X'},
        		{'X', 'O', 'X'}
        	};
    	
    	char [][]invalidBoard1 = {
        		{'X', 'X', ' '},
        		{' ', ' ', 'O'},
        		{' ', ' ', 'O'}
        	};
    	
    	char [][]invalidBoard2 = {
        		{'X', 'X', 'X'},
        		{' ', ' ', ' '},
        		{' ', ' ', ' '}
        	};
    	
    	char [][]invalidBoard3 = {
        		{'X', ' ', ' '},
        		{' ', ' ', ' '},
        		{' ', ' ', 'O'}
        	};
    	
    	assertEquals(WINNER.PLAYER_2, subject.getWinnerPlayer(playerOneWins));
    	assertEquals(WINNER.PLAYER_1, subject.getWinnerPlayer(playerTwoWins));
    	assertEquals(WINNER.TIE, subject.getWinnerPlayer(tie));
    	assertEquals(WINNER.INVALID_BOARD, subject.getWinnerPlayer(invalidBoard1));
    	assertEquals(WINNER.INVALID_BOARD, subject.getWinnerPlayer(invalidBoard2));
    	assertEquals(WINNER.INVALID_BOARD, subject.getWinnerPlayer(invalidBoard3));
    }

}
