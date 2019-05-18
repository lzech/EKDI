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
	
	@Override
	public String toString() {
		if (gruen = true) {
			return "G";
		} else {
			return "R";
		}
	}

}