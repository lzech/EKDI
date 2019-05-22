package ampel;

public class Bahn extends Verkehr {

	public Bahn(int x, int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return "B";
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void moveBahn(String moveString) {
		switch (moveString) {
		case "sn":
			this.y--;
			if((this.x>4 && this.x < 16) && (this.y>4 && this.y <15)) {
				this.x++;
			}
			break;
		case "ns":
			this.y++;
			if((this.x>3 && this.x < 15) && (this.y>4 && this.y <15)) {
				this.x--;
			}
			break;

		}
	}
}
