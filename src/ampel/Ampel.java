package ampel;

public class Ampel extends Verkehr {
	boolean gruen;

	public Ampel(final int x, final int y, boolean gruen) {
		super(x, y);
		this.gruen = gruen;

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