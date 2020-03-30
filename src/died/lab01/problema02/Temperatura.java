package died.lab01.problema02;

public class Temperatura {
	public Double grados;
	public Escala escala;
	
	public Temperatura() {
		this.grados = 0d;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(Double temp, Escala escalaNueva) {
		this.grados = temp;
		this.escala = escalaNueva;
	}
	
	public String toString() {
		String str = String.valueOf(this.grados);
		str.concat(" grados " + this.escala);
		return str;
	}
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS) {
			return this.grados;
		}
		else {
			return ((this.grados - 32)* 5 / 9);
		}
	}
	
	public Double asFahrenheit() {
		if(this.escala == Escala.FAHRENHEIT) {
			return this.grados;
		}
		else {
			return ((this.grados * 9 / 5) + 32);
		}
	}
	
	public Double getValor(Temperatura temperatura) {
		Double temp2 = temperatura.grados;
		switch (temperatura.escala) {
			case CELCIUS:
				if(this.escala != temperatura.escala) {
					temp2 = temperatura.asFahrenheit();
				}
				break;
			case FAHRENHEIT:
				if(this.escala != temperatura.escala) {
					temp2 = temperatura.asCelcius();
				}
				break;
			default:
				break;
		}
		return temp2;
	}
	
	public void aumentar(Temperatura temperatura ) {
		Double aux = this.grados;
		if (temperatura.grados >= 0d) {
			this.grados = aux + this.getValor(temperatura);
		}
	}
	
	public void disminuir(Temperatura temperatura ) {
		Double aux = this.grados;
		if (temperatura.grados >= 0d) {
			this.grados = aux - this.getValor(temperatura);
		}
	}
	
}
