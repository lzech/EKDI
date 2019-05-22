package ampel;

public class Ampel extends Verkehr {
	boolean gruen;

	public Ampel(final int x, final int y) {
		super(x, y);


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
	
	@Override
	public String toString() {
		if (gruen) {
			return "G";
		} else {
			return "R";
		}
	}

}