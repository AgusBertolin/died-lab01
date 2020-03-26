package died.lab01.problema01;

public class Recta {
	public Punto punto1;
	public Punto punto2;
	
	public Recta (Punto p1, Punto p2) {
		this.punto1 = p1;
		this.punto2 = p2;
	}
	
	public Recta () {
		this.punto1 = new Punto(1f, 1f);
		this.punto2 = new Punto(2f, 2f);
	}
	
	public Float pendiente() {
		return (this.punto2.getY() - this.punto1.getY())/(this.punto2.getX() - this.punto1.getX());
	}
	
	public boolean paralelas(Recta otraRecta) {
		return (this.pendiente() == otraRecta.pendiente());
	}
	
	public boolean equals(Object otraRecta) {
		if (otraRecta instanceof Recta) {
			Float m = (this.punto2.getY() - ((Recta) otraRecta).punto1.getY()) / (this.punto2.getX() - ((Recta) otraRecta).punto1.getX());
			return (m == this.pendiente() && m == ((Recta) otraRecta).pendiente());
		}
		else return false;
	}
}
