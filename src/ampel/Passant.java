package ampel;

public class Passant extends Verkehr {
	public Passant( int x,  int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return "P";
	}

}