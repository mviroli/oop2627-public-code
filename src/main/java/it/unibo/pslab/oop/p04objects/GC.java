package it.unibo.pslab.oop.p04objects;

class GC {
	private static long VISUALIZATION_PERIOD = 1_000;

	public static void main(String[] s) {
		// Runtime dà info sull'esecuzione
		Runtime r = Runtime.getRuntime();

		// Creo oggetti all'infinito
		for (long l = 0; true; l++) {
			new Object();
			// Stampo solo ogni tanto
			if (l % VISUALIZATION_PERIOD == 0) {
				IO.print("Objs (millions): " + l / 1_000_000);
				IO.println(" Freemem (MB):" + (r.freeMemory() >> 20));
			}
			// La memoria libera si vedrà calare lentamente
			// e poi riprendersi di colpo, ciclicamente
		}
	}
}
