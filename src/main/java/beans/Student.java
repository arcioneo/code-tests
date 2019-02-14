package beans;

public class Student implements Comparable<Student> {
	private String	name;
	private float	score;
	private int		numberOfScores;

	public Student(String name, String score) {
		super();
		this.name = name;
		this.score = Float.parseFloat(score);
		this.numberOfScores = 1;
	}

	public String getName() {
		return name;
	}

	public void addScore(String score) {
		this.score += Float.parseFloat(score);
		this.numberOfScores += 1;
	}

	public float getAverage() {
		return this.score / this.numberOfScores;
	}

	@Override
	public int compareTo(Student o) {
		return getAverage() > o.getAverage() ? -1 : this.getAverage() == o.getAverage() ? 0 : 1;
	}

	@Override
	public String toString() {
		return name + " " + getAverage();
	}

}
