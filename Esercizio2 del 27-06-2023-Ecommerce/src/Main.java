import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Client client = new Client("B02", "Riccardo Giunta", "ric.giunta@gmail.com", "25/08/1993");

		Articolo article1 = new Articolo("AFK1", "Mitra", 3999.99, 12);
		Articolo article2 = new Articolo("AFK2", "Mina", 99.99, 128);
		Articolo article3 = new Articolo("AFK3", "Pugnale", 50, 77);
		Articolo article4 = new Articolo("AFK4", "Lanciamissili", 5000, 3);
		Articolo article5 = new Articolo("AFK5", "Fucile a canne mozze", 450, 31);

		Carrello cesta = new Carrello(client);

		cesta.addArticle(article1);
		cesta.addArticle(article2);
		cesta.addArticle(article3);
		cesta.addArticle(article4);
		cesta.addArticle(article5);

		listaCarrelli.add(cesta);

		cesta.stampaDatiCliente();
		System.out.println("-----------------------------------------------");
		cesta.stampaDatiArticolo();

		double totPrice = cesta.getTotPriceArticle();
		System.out.println("Totale costo degli articoli nel carrello: " + totPrice);

	}

	private static List<Carrello> listaCarrelli = new ArrayList<>();

	public double calcolaTotaleVendite() {
		double totaleVendite = 0.0;
		for (Carrello carrello : listaCarrelli) {
			totaleVendite += carrello.getTotPriceArticle();
		}
		return totaleVendite;
	}

	public void rimuoviArticoloPerCodice(String codiceArticolo) {
		for (Carrello carrello : listaCarrelli) {
			Articolo articolo = carrello.searchArticle(codiceArticolo);
			if (articolo != null) {
				carrello.listOfArticle.remove(articolo);
				carrello.totPriceArticle -= articolo.getPrice();
				break;
			}
		}
	}
}
