package beans;

public class PairBean implements Comparable<PairBean> {
	private int	n1;
	private int	n2;
	private int	target;

	public PairBean(int n1, int n2, int target) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.target = target;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public int getTarget() {
		return target;
	}

	@Override
	public String toString() {
		return "(" + n1 + "," + n2 + ")";
	}

	@Override
	public int compareTo(PairBean bean) {
		return this.toString().compareTo(bean.toString());
	}
}
