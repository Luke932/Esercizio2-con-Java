import java.util.ArrayList;
import java.util.List;

public class Sim {
	String phoneNum;
	double credito;
	List<Chiamata> listaChiamate;

	public Sim(String phoneNum) {
		this.phoneNum = phoneNum;
		this.credito = 0;
		this.listaChiamate = new ArrayList<>(5);
	}

	public void stampaDatiSim() {
		System.out.println("Numero di telefono: " + phoneNum);
		System.out.println("Credito disponibile: " + credito);

		System.out.println("Ultime chiamate effettuare: ");
		for (Chiamata chiamata : listaChiamate) {
			System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato());
			System.out.println("Durata: " + chiamata.duration + "minuti");
			System.out.println("----------------------------------------");
		}
	}
}
