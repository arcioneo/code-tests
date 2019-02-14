package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import beans.Student;

/**
 * Given 2 dimensional array mentioning student scores, find best average score
 * for each student and return that score e.g. for scores = [ [ "charles" ,
 * "88"], ["ross" , "60"], ["charles", "90"], ["joe", "70"]] the answer should
 * "89" for charles
 * 
 * @author eduardomilpas@gmail.com
 *
 */
public class StudentScores {

	public String getStudentBestAverageScore(String[][] students) {

		Map<String, Student>	averages		= createMap(students);
		List<Student>			studentsList	= mapToList(averages);
		Collections.sort(studentsList);

		return studentsList.get(0).toString();
	}

	private List<Student> mapToList(Map<String, Student> averages) {
		List<Student> studentsList = new LinkedList<>();

		averages.entrySet().forEach(e -> {
			studentsList.add(averages.get(e.getKey()));
		});
		return studentsList;
	}

	private Map<String, Student> createMap(String[][] students) {
		Map<String, Student>	averages	= new HashMap<>();
		Student					student;

		for (String[] s : students) {
			student = averages.get(s[0]);
			if (student == null) {
				averages.put(s[0], new Student(s[0], s[1]));
			} else {
				student.addScore(s[1]);
				averages.put(s[0], student);
			}
		}
		return averages;
	}

}
