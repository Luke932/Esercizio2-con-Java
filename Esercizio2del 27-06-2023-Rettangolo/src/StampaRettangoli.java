
public class StampaRettangoli {

	public static void stampaRettangolo(Rettangolo x) {
		double perimetro = x.calcolaPerimetro();
		double area = x.calcolaArea();

		System.out.println("Rettangolo:");
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area:" + area);
	}

	public static void stampaRettangoli(Rettangolo x, Rettangolo y) {
		double perimetroX = x.calcolaPerimetro();
		double areaX = x.calcolaArea();

		double perimetroY = y.calcolaPerimetro();
		double areaY = y.calcolaArea();

		double sumPerim = perimetroX + perimetroY;
		double sumArea = areaX + areaY;

		System.out.println("Rettangolo X: ");
		System.out.println("Perimetro: " + perimetroX);
		System.out.println("Area: " + areaX);

		System.out.println("Rettangolo Y: ");
		System.out.println("Perimetro: " + perimetroY);
		System.out.println("Area: " + areaY);

		System.out.println("Rettangoli: ");
		System.out.println("Somma perimetri: " + sumPerim);
		System.out.println("Somma aree: " + sumArea);
	}

	public static void main(String[] args) {
		Rettangolo x = new Rettangolo(8, 6);
		Rettangolo y = new Rettangolo(12, 7);

		stampaRettangolo(x);

		System.out.println();

		stampaRettangoli(x, y);
	}
}
