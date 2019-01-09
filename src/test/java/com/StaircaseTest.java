package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Class who generates a stair of characters given the max number of steps
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class StaircaseTest {

	private Staircase subject;

	@Before
	public void setup() {
		subject = new Staircase();
	}

	@Test
	public void getStairCase() {
		String expected = "         #\n" + 
						  "        ##\n" + 
						  "       ###\n" + 
						  "      ####\n" + 
						  "     #####\n" + 
						  "    ######\n" + 
						  "   #######\n" + 
						  "  ########\n" + 
						  " #########\n" + 
						  "##########";

		String result = subject.getStairCase(10);

		assertEquals(expected, result);
	}

}
