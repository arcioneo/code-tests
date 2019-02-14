package beans;

public class Coordinates {
	private int	x;
	private int	y;

	public Coordinates(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "[" + y + "," + x + "]";
	}
	
	

}
