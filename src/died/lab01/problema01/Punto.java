package died.lab01.problema01;

public class Punto {
	public Float ejeX;
	public Float ejeY;
	
	public Punto(Float x, Float y) {
		this.ejeX = x;
		this.ejeY = y;
	}
	
	public Float getX() {
		return this.ejeX;
	}
	
	public Float getY() {
		return this.ejeY;
	}
	
	public void setX(Float nuevaX) {
		this.ejeX = nuevaX;
	}
	
	public void setY(Float nuevaY) {
		this.ejeY = nuevaY;
	}
	
	public boolean equals(Object otroPunto) {
		return (otroPunto instanceof Punto && ((Punto) otroPunto).getX() == this.ejeX && ((Punto) otroPunto).getY() == this.ejeY);
	}

}
