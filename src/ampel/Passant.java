package ampel;

public class Passant extends Verkehr {
	public Passant(final int x, final int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return "P";
	}

}