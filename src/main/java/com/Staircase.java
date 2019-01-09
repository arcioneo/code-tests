package com;

/**
 * Class who generates a stair of characters given the max number of steps
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class Staircase {

	private static final char STEP_CHARACTER = '#';

	public String getStairCase(int steps) {
		StringBuilder stairCase = new StringBuilder();

		for (int index = 0; index < steps; index++) {
			stairCase.append(getCharsString(steps - (index + 1), ' '));
			stairCase.append(getCharsString(steps - (steps - (index + 1)), STEP_CHARACTER));
			stairCase.append("\n");
		}
		stairCase.delete(stairCase.length() - 1, stairCase.length());
		return stairCase.toString();
	}

	private String getCharsString(int limit, char character) {
		StringBuilder charsString = new StringBuilder();
		for (int i = 0; i < limit; i++) {
			charsString.append(character);
		}
		return charsString.toString();
	}
}
