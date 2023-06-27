
public class Main {
	public static void main(String[] args) {
		Sim user = new Sim("327/9577453");

		user.listaChiamate.add(new Chiamata("351/9580435", 7));
		user.listaChiamate.add(new Chiamata("348/4596123", 25));
		user.listaChiamate.add(new Chiamata("347/2563789", 32));
		user.listaChiamate.add(new Chiamata("320/1489526", 5));
		user.listaChiamate.add(new Chiamata("333/8532147", 15));

		user.credito = 58.70;

		user.stampaDatiSim();

	}
}
