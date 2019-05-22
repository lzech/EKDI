package ampel;

import java.util.Random;

public class Map {
	public static Verkehr[][][] karte;
	private int x;
	private int y;
	private Ampel[][] ampeln;
	private Auto[] autosns;
	private Auto[] autossn;
	private Auto[] autoswo;
	private Auto[] autosow;

	private Bahn[] bahnenns;
	private Bahn[] bahnensn;
	private Passant[] passantennsl;
	private Passant[] passantennsr;
	private Passant[] passantensnl;
	private Passant[] passantensnr;
	private Passant[] passantenwoo;
	private Passant[] passantenwou;
	private Passant[] passantenowo;
	private Passant[] passantenowu;
	private int clk;

	public Map() {
		karte = new Verkehr[50][50][50];
		clk = 0;
		ampeln = new Ampel[10][2];
		createAmpeln();
	}
	public void increase(Verkehr[] arr) {
		Verkehr[] temp = new Verkehr [arr.length+1];
		temp = arr;
		
	}

	public Ampel[][] getAmpeln() {
		return ampeln;
	}
	public void sortauto(Auto[] a) {
		for(int i = 1; i>a.length; i++) {
			a[i-1] = a[i];
		}
	}
	public Auto[] getAutos(String s) {
		switch (s) {
		case "ns":
			return autosns;

		case "sn":
			return autossn;
		case "wo":
			return autoswo;
		case "ow":
			return autosow;

		}
		return null;
	}

	public Bahn[] getBahnen(String s) {
		switch (s) {
		case "ns":
			return bahnenns;

		case "sn":
			return bahnensn;
		}
		return null;
	}

	public Passant[] getPassanten(String s) {
		switch(s) {
		
		case "nsl":
			return passantennsl;
		
		case "nsr":
			return passantennsr;
			
		case "snl":
			return passantensnl;
			
		case "snr":
			return passantensnr;
			
		case "woo":
			return passantenwoo;
			
		case "wou":
			return passantenwou;
			
		case "owo":
			return passantenowo;
			
		case "owu":
			return passantenowu;
		}
		
		return null;
	}

	public void setClk() {
		clk++;
	}

	public int getClk() {
		return clk;
	}

	public int getlength(Verkehr[] arr) {
		int z = 0;
		for ( int i = 0; i<arr.length; i++) {
			if (arr[i] !=null ) {
				z++;
			}
		}
		return z;
	}
	
	public void createVerkehr() {
		int a;
		int b;
		Passant pass;
		Bahn bahn;
		Auto auto;
		a = randomNumber(5);
		b = randomNumber(24);
		switch (a) {
		default:
			break;
		case 1: // bahn
			if (b % 2 == 0) {
				bahn = new Bahn(14, 0);
				karte[0][14][getlength(karte[0][14])] = bahn;
				this.bahnenns[bahnenns.length - 1] = bahn;
			} else {
				bahn = new Bahn(5, 19);
				karte[19][5][getlength(karte[19][5])] = bahn;
				this.bahnensn[bahnensn.length - 1] = bahn;
			}
		case 2: // autos
			switch (b) {

			case 1:
			case 2:
			case 3:
			case 4:
			case 17:
			case 18:
				auto = new Auto(4, 0);
				karte[0][4][getlength(karte[0][4])] = auto;
				this.autosns[autosns.length - 1] = auto;
				break;

			case 5:
			case 6:
			case 7:
			case 8:
			case 19:
			case 20:
				auto = new Auto(0, 10);
				karte[10][0][getlength(karte[10][0])] = auto;
				this.autoswo[autoswo.length - 1] = auto;
				break;

			case 9:
			case 10:
			case 11:
			case 12:
			case 21:
			case 22:
				auto = new Auto(19, 9);
				karte[9][19][getlength(karte[9][19])] = auto;
				this.autosow[autosow.length - 1] = auto;
				break;

			case 13:
			case 14:
			case 15:
			case 16:
			case 23:
			case 24:
				auto = new Auto(15, 19);
				karte[19][15][getlength(karte[19][15])] = auto;
				this.autossn[autossn.length - 1] = auto;
				break;

			}
		case 3: // passant
			switch (b) {
			case 1:
			case 2:
			case 3:
				pass = new Passant(1, 0);
				karte[0][1][getlength(karte[0][1])] = pass;
				this.passantennsl[passantennsl.length - 1] = pass;
				break;

			case 4:
			case 5:
			case 6:
				pass = new Passant(17, 0);
				karte[0][17][getlength(karte[0][17])] = pass;
				this.passantennsr[passantennsr.length - 1] = pass;
				break;

			case 7:
			case 8:
			case 9:
				pass = new Passant(19, 3);
				karte[3][19][getlength(karte[3][19])] = pass;
				this.passantenowo[passantenowo.length - 1] = pass;
				break;

			case 10:
			case 11:
			case 12:
				pass = new Passant(0, 4);
				karte[4][0][getlength(karte[4][0])] = pass;
				this.passantenwoo[passantenwoo.length - 1] = pass;
				break;

			case 13:
			case 14:
			case 15:
				pass = new Passant(0, 17);
				karte[17][0][getlength(karte[17][0])] = pass;
				this.passantenwou[passantenwou.length - 1] = pass;
				break;

			case 16:
			case 17:
			case 18:
				pass = new Passant(19, 19);
				karte[15][19][getlength(karte[15][19])] = pass;
				this.passantenowu[passantenowu.length - 1] = pass;
				break;

			case 19:
			case 20:
			case 21:
				pass = new Passant(2, 19);
				karte[19][2][getlength(karte[19][2])] = pass;
				this.passantensnl[passantensnl.length - 1] = pass;
				break;

			case 22:
			case 23:
			case 24:
				pass = new Passant(18, 19);
				karte[19][18][getlength(karte[19][18])] = pass;
				this.passantensnr[passantensnr.length - 1] = pass;
				break;
			}
		}

	}

	private static int randomNumber(int n) {
		Random rand = new Random();
		int z = rand.nextInt(n) + 1;
		return z;
	}

	private void createAmpeln() {
		int[][] arr = new int[20][2];
		arr[0][0] = 2;
		arr[0][1] = 6;
		arr[1][0] = 5;
		arr[1][1] = 3;

		arr[2][0] = 2;
		arr[2][1] = 3;
		arr[3][0] = 17;
		arr[3][1] = 16;

		arr[4][0] = 2;
		arr[4][1] = 13;
		arr[5][0] = 5;
		arr[5][1] = 16;

		arr[6][0] = 3;
		arr[6][1] = 17;
		arr[7][0] = 2;
		arr[7][1] = 16;

		arr[8][0] = 8;
		arr[8][1] = 16;
		arr[9][0] = 11;
		arr[9][1] = 19;

		arr[10][0] = 11;
		arr[10][1] = 0;
		arr[11][0] = 8;
		arr[11][1] = 19;

		arr[12][0] = 17;
		arr[12][1] = 13;
		arr[13][0] = 14;
		arr[13][1] = 16;

		arr[14][0] = 14;
		arr[14][1] = 3;
		arr[15][0] = 17;
		arr[15][1] = 6;

		arr[16][0] = 8;
		arr[16][1] = 0;
		arr[17][0] = 11;
		arr[17][1] = 3;

		for (int i = 0, a = 0; i < ampeln.length; i++) {
			for (int j = 0; j < 2; j++, a++) {
				y = arr[a][0];
				x = arr[a][1];
				Ampel ampel = new Ampel(x, y);
				karte[y][x][0] = ampel;
				this.ampeln[i][j] = ampel;
				
				
			}

		}

	}

	@Override
	public String toString() {
		String ret = " ";
		for (int i = 0; i < karte.length; i++) {
			for (int j = 0; j < karte[i].length; j++) {
				if (karte[y][x][0] != null) {
					ret += karte[y][x][0];
				} else if (karte[i][j][1] != null) {
					ret += karte[i][j][1];
				} else if ((i != 9 || i != 10) && (j == 1 || j == 2 || j == 17 || j == 18)) {
					ret += ".";
				} else if (((i < 3 || i > 15) && (j == 4 || j == 5 || j == 14 || j == 15))) {
					ret += "|";

				} else if ((i == 9 || i == 10) && (j < 9 || j > 11)) {
					ret += "-";
				} else if ((i == 9 || i == 10) && (j == 10)) {
					ret += "x";
				} else if (((i > 4 || i < 15) && j == i - 1 || j == i)) {
					ret += "\\";
				} else if (((i > 4 || i < 15) && j == 20 - i || j == 19 - i)) {
					ret += "/";
				}

			}
			ret += "\n";
		}
		return ret;
	}
	
	
}