package ampel;

public class Ampel {
	boolean gruen;
	int id;
	private int x;
	private int y;
	public Ampel(final int x, final int y, final int id) {
		this.x = x;
		this.y = y;
		this.id = id;


	}
	public boolean isGruen() {
		if (gruen) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setGruen(boolean b) {
		this.gruen = b;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void setId(int s) {
		this.id = s;
	}
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		if (gruen) {
			return "G";
		} else {
			return "R";
		}
	}

}