package com.student.omar.model.response;

public class Response {

	/**
	 * atributos de clase
	 */
	double resultArea;
	double resultPerimetro;

	/**
	 * Contructor vacio
	 */
	public Response() {
	}

	/**
	 * Contructor parametrizado
	 * 
	 * @param resultArea
	 * @param resultPerimetro
	 */
	public Response(double resultArea, double resultPerimetro) {
		this.resultArea = resultArea;
		this.resultPerimetro = resultPerimetro;
	}

	/**
	 * @return getter
	 */
	public double getResultArea() {
		return resultArea;
	}

	/**
	 * @param setter
	 */
	public void setResultArea(double resultArea) {
		this.resultArea = resultArea;
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
