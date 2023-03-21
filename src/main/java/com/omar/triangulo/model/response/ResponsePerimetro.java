package com.omar.triangulo.model.response;

public class ResponsePerimetro {
	/**
	 * atributo de clase
	 */
	private double perimetro;

	/**
	 * constructor vacio
	 */
	public ResponsePerimetro() {
	}

	/**
	 * metodo constructor parametrizado
	 * 
	 * @param perimetro
	 */
	public ResponsePerimetro(double perimetro) {
		super();
		this.perimetro = perimetro;
	}

	/**
	 * metodo getter
	 * 
	 * @return the perimetro
	 */
	public double getPerimetro() {
		return perimetro;
	}

	/**
	 * metodo setter
	 * 
	 * @param perimetro the perimetro to set
	 */
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

}
