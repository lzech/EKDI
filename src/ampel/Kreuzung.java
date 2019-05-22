package ampel;

import java.util.concurrent.TimeUnit;

public class Kreuzung {
	private Map map;
	private static Kreuzung instance;

	// ToDo: Verkehrsfluss, Kollisionsabfrage

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
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.setClk();
			map.createVerkehr();
			verkehrsfluss();
			System.out.println("t= " + map.getClk());
			System.out.println(map);
			}
		}
	


	private void verkehrsfluss() {
		String s = "";
		String s1 = "";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 2; j++) {
				if (map.getAmpeln()[i][j].isGruen()) {
					switch (i) {
					case 0:
						s = "wo";
						s1 = "ow";
						while (map.getAmpeln()[2][6].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}

						}

					case 1:
						s = "ns";
						s1 = "sn";
						while (map.getAmpeln()[2][3].isGruen()) {
							for (int k = 0; k < map.getAutos(s).length; k++) {
								if (map.getAutos(s)[k + 1] == null) {
									map.getAutos(s)[k].moveAuto(s);
								}

							}
							for (int k = 0; k < map.getAutos(s1).length; k++) {
								if (map.getAutos(s1)[k + 1] == null) {
									map.getAutos(s1)[k].moveAuto(s1);

								}
							}

						}
					case 2:
						s = "wo";
						s1 = "ow";
						while (map.getAmpeln()[2][13].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}

						}

					case 3:
						s = "ns";
						s1 = "sn";
						while (map.getAmpeln()[2][16].isGruen()) {
							for (int k = 0; k < map.getBahnen(s).length; k++) {
								if (map.getBahnen(s)[k+1] == null) {
									map.getBahnen(s)[k].moveBahn(s);
								}
								
							}
							for (int k = 0; k < map.getAutos(s1).length; k++) {
								if (map.getBahnen(s1)[k+1] == null) {
									map.getBahnen(s1)[k].moveBahn(s1);
								}
								
							}

						}

					case 4:
						s = "ns";
						s1 = "sn";
						while (map.getAmpeln()[11][19].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}
						}

					case 5:
						s = "wo";
						s1 = "ow";
						while (map.getAmpeln()[11][5].isGruen()) {
							for (int k = 0; k < map.getAutos(s).length; k++) {
								if (map.getAutos(s)[k + 1] == null) {
									map.getAutos(s)[k].moveAuto(s);
								}

							}
							for (int k = 0; k < map.getAutos(s1).length; k++) {
								if (map.getAutos(s1)[k + 1] == null) {
									map.getAutos(s1)[k].moveAuto(s1);

								}
							}

						}

					case 6:
						s = "wo";
						s1 = "ow";
						while (map.getAmpeln()[14][16].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}

						}

					case 7:
						s = "ns";
						s1 = "sn";
						while (map.getAmpeln()[11][3].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}

						}

					case 8:
						s = "wo";
						s1 = "ow";
						while (map.getAmpeln()[14][3].isGruen()) {
							for (int k = 0; k < map.getPassanten(s).length; k++) {
								if (map.getPassanten(s)[k + 1] == null) {
									map.getPassanten(s)[k].movePassant(s);
								}

							}
							for (int k = 0; k < map.getPassanten(s1).length; k++) {
								if (map.getPassanten(s1)[k + 1] == null) {
									map.getPassanten(s1)[k].movePassant(s1);
								}
							}

						}

					}

				}
			}

		}

	}
}