package it.unibo.pslab.oop.p10collections.set;

public class UseArchive {

	public static void main(String[] args) {
		final Archive arc = new ArchiveImpl();
		arc.add("Rossi", 1960, false);
		arc.add("Bianchi", 1980, true);
		arc.add("Verdi", 1972, true);
		arc.add("Neri", 1968, false);
		arc.remove("Neri", 1968);

		IO.println(arc.size()); // 3
		IO.println(arc.allMarried()); // [Bianchi,Verdi]
	}

}
