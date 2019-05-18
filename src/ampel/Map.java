package ampel;

import java.util.Random;

public class Map {
	public static String[][][] karte;
	private int x;
	private int y;
	private Ampel[] ampeln;
	private int clk;

	public Map() {
		clk = 0;
		ampeln = new Ampel[10];
		createAmpeln();
	}
	public Ampel[] getAmpeln() {
		return ampeln;
	}
	
	public void setClk() {
		clk++;
	}
/* KReuzungsdimensionen: [][][]
	public static String[][][] karte(int a, int b) {
		karte = new String[21][16][];
		for (int i = 0; i < karte.length; i++) {
			for (int j = 0; j < karte[i].length; j++) {

			}
		}
		return karte;
	}
*/
	public int getClk() {
		return clk;
	}
	private void createVerkehr() {
		int a;
		int b;
		a = randomNumber(5);
		b = randomNumber(24);
		switch (a) {
		default:
			break;
		case 1:
			if (b % 2 == 0) {

			} else {

			}
		case 2:
			switch (b) {

			case 1: case 2: case 3: case 4: 
				
			case 5: case 6: case 7: case 8: 
				
			case 9: case 10: case 11: case 12:
							
			case 13: case 14: case 15: case 16: 
				
			case 17: case 18: case 19: case 20: 
				
			case 21: case 22: case 23: case 24:
				
			}
		case 3:
			switch(b) {
			case 1: case 2: case 3: 
				
			case 4: case 5: case 6: 
				
			case 7: case 8: case 9: 
				
			case 10: case 11: case 12:
							
			case 13: case 14: case 15: 
				
			case 16: case 17: case 18:
				
			case 19: case 20: case 21: 
				
			case 22: case 23: case 24:
			}
		}

	}

	private static int randomNumber(int n) {
		Random rand = new Random();
		int z = rand.nextInt(n) + 1;
		return z;
	}

	/*
	 * private void createAmpeln() { int a = 5; int b = 5; int c = 1; for (int i =
	 * 0; i < 10;) { for (int j = 0; j<karte.length; j++) { for (int k = 0; k<
	 * karte[j].length; k++) {
	 * 
	 * } } if (c % 2 != 0) { Ampel ampel = new Ampel(a, b); this.ampeln[i] = ampel;
	 * a++; b++; c++; } else { Ampel ampel = new Ampel(a, b); this.ampeln[i] =
	 * ampel; a += 5; b += 5; c++;
	 * 
	 * } }
	 * 
	 * }
	 */
	// String ausgabe an Karte anpassen: Straßen darstellung etc.
	@Override
	public String toString() {
		String ret = "  ";

		for (int i = 0; i < karte[0].length; i++) {
			ret += i;
		}
		ret += "\n ";

		for (int i = 0; i < karte[0].length + 2; i++) {
			ret += "*";
		}

		for (int y = 0; y < karte.length; y++) {
			ret += "\n";
			ret += y + "*";
			for (int x = 0; x < karte[y].length; x++) {
				if (karte[y][x] != null) {
					ret += karte[y][x];
				} else {
					ret += " ";
				}
			}
			ret += "*";
		}

		ret += "\n ";

		for (int i = 0; i < karte[0].length + 2; i++) {
			ret += "*";
		}

		return ret;

	}

	/**
	 * Gibt das Objekt an dieser Position in der Map zurück
	 * 
	 * @param j x
	 * @param k y
	 * @return Zeichen, dass sich hier befindet
	 */
	private String getMapObject(int j, int k) {
		if (auto.getX() == k && auto.getY() == j) {
			return auto.toString();
		} else if (bahn.getX() == k && bahn.getY() == j) {
			return bahn.toString();
		} else if (passant.getX() == k && passant.getY() == j) {
			return passant.toString();
		}
		for (Ampel ampel : ampeln) {
			if (ampel.getY() == j && ampel.getX() == k) {
				return ampel.toString();
			}
		}
		return " ";
	}
}