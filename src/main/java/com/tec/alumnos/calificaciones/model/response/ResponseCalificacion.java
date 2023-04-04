package com.tec.alumnos.calificaciones.model.response;

public class ResponseCalificacion {
	private double calificacionFinal;
	private boolean aprobado;

	/**
	 * Constructor Vacio
	 * 
	 * @param calificacionFinal
	 * @param aprobado
	 */
	public ResponseCalificacion() {
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param calificacionFinal
	 * @param aprobado
	 */
	public ResponseCalificacion(double calificacionFinal, boolean aprobado) {
		super();
		this.calificacionFinal = calificacionFinal;
		this.aprobado = aprobado;
	}

	/**
	 * Metodo Getter
	 * 
	 * @return the calificacionFinal
	 */
	public double getCalificacionFinal() {
		return calificacionFinal;
	}

	/**
	 * Metodo Setter
	 * 
	 * @param calificacionFinal the calificacionFinal to set
	 */
	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}

	/**
	 * Metodo Getter
	 * 
	 * @return the aprobado
	 */
	public boolean isAprobado() {
		return aprobado;
	}

	/**
	 * Metodo Setter
	 * 
	 * @param aprobado the aprobado to set
	 */
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
}
