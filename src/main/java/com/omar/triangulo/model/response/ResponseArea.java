package com.omar.triangulo.model.response;

public class ResponseArea {
	/**
	 * Atributo de clase
	 */
	private double area;

	/**
	 * Metedo constructor vacio
	 */
	public ResponseArea() {
	}

	/**
	 * Metodo constructor parametrizado
	 * 
	 * @param area
	 */
	public ResponseArea(double area) {
		super();
		this.area = area;
	}

	/**
	 * Metodo getter
	 * 
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * Metodo setter
	 * 
	 * @param area   the area to set
	 * @param altura
	 */
	public void setArea(double area) {
		this.area = area;
	}

}
