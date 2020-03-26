package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		Punto p1 = new Punto(1f, 1f);
		Punto p2 = new Punto(2f, 2f);
		Recta r1 = new Recta(p1, p2);
		
		System.out.println("La pendiente de la recta R1 = " + r1.pendiente());
		
		Punto p3 = new Punto(3f, 3f);
		Recta r2 = new Recta(p2, p3);
		
		System.out.println(r1.equals(r2));
	}

}
