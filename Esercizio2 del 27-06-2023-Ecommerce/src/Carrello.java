import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Carrello {
	Client client;
	List<Articolo> listOfArticle;
	double totPriceArticle;

	public Carrello(Client client) {
		this.client = client;
		this.listOfArticle = new ArrayList<>();
		this.totPriceArticle = 0.0;
	}

	public void addArticle(Articolo articolo) {
		listOfArticle.add(articolo);
		totPriceArticle += articolo.getPrice();
	}

	public double getTotPriceArticle() {
		return totPriceArticle;
	}

	public void stampaDatiCliente() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dataIscrizioneFormatted = dateFormat.format(client.getSubscribe());

		System.out.println("Codice Cliente: " + client.getCodClient());
		System.out.println("Nome e Cognome: " + client.getCredential());
		System.out.println("Email: " + client.getEmail());
		System.out.println("Data iscrizione: " + dataIscrizioneFormatted);
	}

	public void stampaDatiArticolo() {
		for (Articolo articolo : listOfArticle) {
			System.out.println("Codice articolo: " + articolo.getCodArticle());
			System.out.println("Descrizione articolo: " + articolo.getDescrArticle());
			System.out.println("Prezzo: " + articolo.getPrice());
			System.out.println("Pezzi disponibili in magazzino: " + articolo.getStock());
		}
	}

	public void svuotaCarrello() {
		listOfArticle.clear();
		totPriceArticle = 0.0;
	}

	Articolo searchArticle(String codArticle) {
		for (Articolo articolo : listOfArticle) {
			if (articolo.getCodArticle().equals(codArticle)) {
				return articolo;
			}
		}
		return null;
	}

	public void stampaDettagliArticolo(String codArticle) {
		Articolo article = searchArticle(codArticle);
		if (article != null) {
			System.out.println("Codice articolo: " + article.getCodArticle());
			System.out.println("Descrizione: " + article.getDescrArticle());
			System.out.println("Prezzo: " + article.getPrice());
			System.out.println("Numero pezzi disponibili: " + article.getStock());
			System.out.println("-------------------");
		} else {
			System.out.println("Articolo non trovato nel carrello");
		}
	}

	public void totPricaWithDiscount(double percent) {
		double discount = totPriceArticle * (30 / 100);
		totPriceArticle -= discount;
	}

}
