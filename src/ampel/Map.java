package ampel;

public class Map {
	public static String[][][] karte;
	public static int[] autoNS = new int[22];
	public static int[] autoSN = new int[22];
	public static int[] autoWO = new int[22];
	public static int[] autoOW = new int[22];
	public static int[] bahnNS = new int[22];
	public static int[] bahnSN = new int[22];
	public static int[] passNSL = new int[22];
	public static int[] passSNL = new int[22];
	public static int[] passNSR = new int[22];
	public static int[] passSNR = new int[22];
	public static int[] passWOO = new int[22];
	public static int[] passOWO = new int[22];
	public static int[] passWOU = new int[22];
	public static int[] passOWU = new int[22];
	//Array Dimensionen anpassen: Wege primär OW
	//Aray Karte [+3][+4] um beide Verkehrsrichtungen Darzustellen
	
	public static String[][][] karte(int a, int b) {
		karte = new String[20][34][];
		for (int i = 0; i < karte.length; i++) {
			for (int j = 0; j < karte[i].length; j++) {
				if (karte[i][j][0] == "Auto") {
					karte[i][j][0] = "1";
				}
			}
		}
		return karte;
	}
	//String ausgabe an Karte anpassen: Straßen darstellung etc.
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
}