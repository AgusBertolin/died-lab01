package died.lab01.problema03;

import java.util.ArrayList;
import died.lab01.problema02.Temperatura;

public class Registro {
	private String ciudad;
	private ArrayList<Temperatura> historico;
	private Integer posicionActual;
	private Integer cantidadMaxima;
	
	public Registro() {
		this.ciudad = "-";
		this.historico = new ArrayList<Temperatura>();
		this.cantidadMaxima = 30;
		this.posicionActual = 0;
	}
	
	public Registro(String nuevaCiudad) {
		this.ciudad = nuevaCiudad;
		this.historico = new ArrayList<Temperatura>();
		this.cantidadMaxima = 30;
		this.posicionActual = 0;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("TEMPERATURAS REGISTRADAS EN: " + this.ciudad);
		for(int i = 0; i < this.posicionActual; i++) {
			System.out.println(String.valueOf(i + 1) + " " + String.valueOf(this.historico.get(i).asCelcius()) + " C°");
		}
	}
	
	public void agregar (Temperatura t) {
		if ( this.posicionActual != this.cantidadMaxima ) {
			this.historico.add(t);
			this.posicionActual = this.posicionActual + 1;
		}
	}
	
	public Double mediaAsCelcius() {
		Double aux = 0d;
		for( int i = 0; i < this.posicionActual; i++) {
			aux = aux + this.historico.get(i).asCelcius();
		}
		
		return aux / (this.posicionActual + 1); 
	}
	
	public Double mediaAsFahrenheit() {
		Double aux = 0d;
		for( int i = 0; i < this.posicionActual; i++) {
			aux = aux + this.historico.get(i).asFahrenheit();
		}
		
		return aux / (this.posicionActual + 1); 
	}

	public Temperatura maximo() {
		return this.recursivoMax(this.posicionActual - 1, 0);
	}
	
	private Temperatura recursivoMax(Integer posActual, Integer posMax) {
		if (posActual == -1) {
			return this.historico.get(posMax);
		}
		else {
			if (this.historico.get(posActual) != null && this.historico.get(posActual).asFahrenheit() >= this.historico.get(posMax).asFahrenheit()) {
				posMax = posActual;
			}
			return this.recursivoMax(posActual - 1, posMax);
		}
	}
}
