package ampel;

public abstract class Verkehr {
	private int x;
	private int y;

	public Verkehr(final int x, final int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}