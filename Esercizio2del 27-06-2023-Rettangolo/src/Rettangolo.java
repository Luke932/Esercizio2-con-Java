
public class Rettangolo {
	double altezza;
	double larghezza;

	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public double calcolaPerimetro() {
		return 2 * (altezza + larghezza);
	}

	public double calcolaArea() {
		return altezza * larghezza;
	}
}
