
public class Articolo {
	String codArticle;
	String descrArticle;
	double price;
	int stock;

	public Articolo(String codArticle, String descrArticle, double price, int stock) {
		this.codArticle = codArticle;
		this.descrArticle = descrArticle;
		this.price = price;
		this.stock = stock;
	}

	public void aggiornaDisponibilità(int quantitAggiornata) {
		this.stock += quantitAggiornata;
	}

	public String getCodArticle() {
		return codArticle;
	}

	public String getDescrArticle() {
		return descrArticle;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
}
