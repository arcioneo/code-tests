package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import beans.Coordinates;

/*+
 * Given a 2 dimensional integer array with a starting cell and destination cell, 
 * find the path from “starting cell” to “destination cell” with maximum sum of integers 
 * from starting cell to destination cell.  
 * You can only navigate “UP” and “RIGHT”.  You cannot navigate “DOWN” and “LEFT”.
 */
public class ArrayNavigator {

	private int dstY, dstX;

	@SuppressWarnings("unchecked")
	public int findPathWithMaximumSum(int[][] A, int srcY, int srcX, int dstY, int dstX) {
		this.dstX = dstX;
		this.dstY = dstY;

		List<Stack<Coordinates>>	list	= new ArrayList<>();
		Stack<Stack<Coordinates>>	ss		= new Stack<>();
		Stack<Coordinates>			s		= new Stack<>();

		s.push(new Coordinates(srcX, srcY));
		ss.push(s);

		while (!ss.isEmpty()) {
			s = ss.pop();

			if (isUp(s)) {
				Coordinates			c	= s.peek();
				Stack<Coordinates>	ns	= (Stack<Coordinates>) s.clone();
				ns.push(new Coordinates(c.getX(), c.getY() - 1));

				if (isGoal(ns)) {
					list.add(ns);
				} else {
					ss.push(ns);
				}
			}

			if (isRight(s)) {
				Coordinates			c	= s.peek();
				Stack<Coordinates>	ns	= (Stack<Coordinates>) s.clone();
				ns.push(new Coordinates(c.getX() + 1, c.getY()));

				if (isGoal(ns)) {
					list.add(ns);
				} else {
					ss.push(ns);
				}
			}

		}

		return getGreatestSum(A, list);
	}

	@SuppressWarnings("unchecked")
	private int getGreatestSum(int[][] A, List<Stack<Coordinates>> list) {
		List<Coordinates>	path	= new ArrayList<>();
		List<Coordinates>	tPath	= new ArrayList<>();
		int					bestSum	= 0;
		int					sum		= 0;

		for (Stack<Coordinates> s : list) {
			sum = 0;
			tPath	= new ArrayList<>();
			while (!s.isEmpty()) {
				Coordinates coordinates = s.pop();
				tPath.add(coordinates);
				sum += A[coordinates.getY()][coordinates.getX()];
			}
			if (sum >= bestSum) {
				bestSum = sum;
				path = (List<Coordinates>) ((ArrayList<Coordinates>) tPath).clone();
			}
		}
		printPath(path);
		return bestSum;

	}

	private void printPath(List<Coordinates> path) {
		Collections.reverse(path);
		for (Coordinates c : path) {
			System.out.print(c + " ");
		}
	}

	private boolean isRight(Stack<Coordinates> s) {
		Coordinates c = s.peek();
		return c.getX() <= dstX;
	}

	private boolean isGoal(Stack<Coordinates> s) {
		Coordinates c = s.peek();
		return dstX == c.getX() && dstY == c.getY();
	}

	private boolean isUp(Stack<Coordinates> s) {
		Coordinates c = s.peek();
		return c.getY() >= dstY;
	}

}
