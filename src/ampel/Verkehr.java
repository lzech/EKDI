package ampel;

public abstract class Verkehr {
	protected int x;
	protected int y;

	public Verkehr(int x, int y) {
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