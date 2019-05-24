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
		for (int b = 1; b<20;b++) {
			map.createVerkehr();
		}
		while (map.getClk() < 240) {
			/*
			 * try { TimeUnit.SECONDS.sleep(10); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
			map.setClk();
			map.createVerkehr();
			//verkehrsfluss();
			map.schalteAmpel();
			System.out.println("t= " + map.getClk());
			System.out.println(map);
		}
	}

	private void verkehrsfluss() {
		String s = "";
		String s1 = "";
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 2; j++) {
				if (map.getAmpeln()[i].isGruen()) {
					switch (i) {
					case 0:
						s = "wo";
						s1 = "ow";
						for (int d = 0; d < 18; d++) {
							if ((map.getAmpeln()[d].getX() == 2 && map.getAmpeln()[d].getY() == 6)
									 {
								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
										map.getPassanten(s1)[k].movePassant(s1);
									}
								}
							}
						}

					case 1:
						s = "ns";
						s1 = "sn";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d].getX() == 3 && map.getAmpeln()[d].getY() == 2)
									) {
								for (int k = 0; k < map.getAutos(s).length; k++) {
									if (map.getAutos(s)[k] != null) {
										map.getAutos(s)[k].moveAuto(s);
									}

								}
								for (int k = 0; k < map.getAutos(s1).length; k++) {
									if (map.getAutos(s1)[k] != null) {
										map.getAutos(s1)[k].moveAuto(s1);

									}
								}
							}
						}
					case 2:
						s = "wo";
						s1 = "ow";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d].getX() == 13 && map.getAmpeln()[d].getY() == 2)
									) {
								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
										map.getPassanten(s1)[k].movePassant(s1);
									}
								}
							}
						}
					case 3:
						s = "ns";
						s1 = "sn";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 16 && map.getAmpeln()[d][0].getY() == 2)
									|| (map.getAmpeln()[d][1].getX() == 16 && map.getAmpeln()[d][1].getY() == 2)) {
								for (int k = 0; k < map.getBahnen(s).length; k++) {
									if (map.getBahnen(s)[k] != null) {
										map.getBahnen(s)[k].moveBahn(s);
									}

								}
								for (int k = 0; k < map.getAutos(s1).length; k++) {
									if (map.getBahnen(s1)[k] != null) {
										map.getBahnen(s1)[k].moveBahn(s1);
									}

								}
							}
						}

					case 4:
						s = "ns";
						s1 = "sn";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 19 && map.getAmpeln()[d][0].getY() == 19)
									|| (map.getAmpeln()[d][1].getX() == 11 && map.getAmpeln()[d][1].getY() == 11)) {
								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
										map.getPassanten(s1)[k].movePassant(s1);
									}
								}
							}
						}

					case 5:
						s = "wo";
						s1 = "ow";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 5 && map.getAmpeln()[d][0].getY() == 11)
									|| (map.getAmpeln()[d][1].getX() == 5 && map.getAmpeln()[d][1].getY() == 11)) {

								for (int k = 0; k < map.getAutos(s).length; k++) {
									if (map.getAutos(s)[k] != null) {
										map.getAutos(s)[k].moveAuto(s);
									}

								}
								for (int k = 0; k < map.getAutos(s1).length; k++) {
									if (map.getAutos(s1)[k] != null) {
										map.getAutos(s1)[k].moveAuto(s1);

									}
								}
							}
						}

					case 6:
						s = "wo";
						s1 = "ow";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 16 && map.getAmpeln()[d][0].getY() == 14)
									|| (map.getAmpeln()[d][1].getX() == 16 && map.getAmpeln()[d][1].getY() == 14)) {
								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
										map.getPassanten(s1)[k].movePassant(s1);
									}
								}

							}
						}

					case 7:
						s = "ns";
						s1 = "sn";
						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 3 && map.getAmpeln()[d][0].getY() == 11)
									|| (map.getAmpeln()[d][1].getX() == 3 && map.getAmpeln()[d][1].getY() == 11)) {

								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
										map.getPassanten(s1)[k].movePassant(s1);
									}
								}
							}
						}

					case 8:
						s = "wo";
						s1 = "ow";

						for (int d = 0; d < 9; d++) {
							if ((map.getAmpeln()[d][0].getX() == 3 && map.getAmpeln()[d][0].getY() == 14)
									|| (map.getAmpeln()[d][1].getX() == 3 && map.getAmpeln()[d][1].getY() == 14)) {
								for (int k = 0; k < map.getPassanten(s).length; k++) {
									if (map.getPassanten(s)[k] != null) {
										map.getPassanten(s)[k].movePassant(s);
									}

								}
								for (int k = 0; k < map.getPassanten(s1).length; k++) {
									if (map.getPassanten(s1)[k] != null) {
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
}