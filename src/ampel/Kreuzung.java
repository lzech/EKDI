package ampel;

public class Kreuzung {
	private Map map;
	private static Kreuzung instance;
	
	//ToDo: Verkehrsfluss, Kollisionsabfrage

	public Kreuzung() {
		map = new Map();
		instance = this;
	}

	public static Kreuzung getKreuzung() {
		return instance;
	}

	public static void main(String[] args) {
		Kreuzung kreuzung = new Kreuzung();
		kreuzung.play();

	}

	private void play() {
		while (map.getClk() <= 240) {
			System.out.println("t= " + map.getClk());
			System.out.println(map);
			if (map.getClk() <= 240) {
				waitForSpace();
				map.setClk();
				verkehrsfluss();
			}

		}
	}

	private void waitForSpace() {
		if (IsKeyPressed.isSpacePressed()) {
			return;
		}

	}

	private void verkehrsfluss() {
		for (int i = 0; i < 10; i++) {
			if (map.getAmpeln()[i].isGruen()) {
				switch (i) {
				case 1:

				case 2:

				case 3:
				}

			}
		}

	}
}