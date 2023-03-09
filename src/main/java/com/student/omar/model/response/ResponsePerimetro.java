package com.student.omar.model.response;

public class ResponsePerimetro {

	/**
	 * atributo de clase
	 */
	private double resultPerimetro;

	/**
	 * contructor vacio
	 */
	public ResponsePerimetro() {
	}

	/**
	 * constructor parametrizado
	 * 
	 * @param resultPerimetro
	 */
	public ResponsePerimetro(double resultPerimetro) {
		this.resultPerimetro = resultPerimetro;
	}

	/**
	 * @return getter
	 */
	public double getResultPerimetro() {
		return resultPerimetro;
	}

	/**
	 * @param setter
	 */
	public void setResultPerimetro(double resultPerimetro) {
		this.resultPerimetro = resultPerimetro;
	}

}
