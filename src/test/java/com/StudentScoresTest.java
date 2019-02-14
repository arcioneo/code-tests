package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Given 2 dimensional array mentioning student scores, find best average score
 * for each student and return that score e.g. for scores = [ [ "charles" ,
 * "88"], ["ross" , "60"], ["charles", "90"], ["joe", "70"]] the answer should
 * "89" for charles
 * 
 * @author eduardomilpas@gmail.com
 *
 */

public class StudentScoresTest {

	private StudentScores subject;

	@Before
	public void setup() {
		subject = new StudentScores();
	}

	@Test
	public void getStudentBestAverageScore() {
		String [][] students = {{"charles", "88"}, {"ross", "60"},{"joe", "70"},{"charles", "90"},{"edu", "69"}};
		assertEquals("charles 89.0", subject.getStudentBestAverageScore(students));
		
		String [][] students2 = {{"Edu", "88"}, {"Manu", "90"},{"Dave", "70"},{"Dave", "90"},{"Manu", "95"}};
		assertEquals("Manu 92.5", subject.getStudentBestAverageScore(students2));
		
		String [][] students3 = {{"Edu", "99"}, {"Manu", "90"},{"Dave", "70"},{"Dave", "90"},{"Manu", "95"}};
		assertEquals("Edu 99.0", subject.getStudentBestAverageScore(students3));
	}

}
