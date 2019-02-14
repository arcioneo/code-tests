package beans;

public class NumberFrequency implements Comparable<NumberFrequency> {

	private int	number;
	private int	timesShown;

	public NumberFrequency(int number) {
		super();
		this.number = number;
		this.timesShown = 1;
	}

	public int getNumber() {
		return number;
	}

	public int getTimesShown() {
		return timesShown;
	}

	public void addOneTimeShown() {
		this.timesShown += 1;
	}

	@Override
	public int compareTo(NumberFrequency o) {
		return getTimesShown() > o.getTimesShown() ? -1 : this.getTimesShown() == o.getTimesShown() ? 0 : 1;
	}

}
