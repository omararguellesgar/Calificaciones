package com.tec.alumnos.lista.calificaciones1.model.response;

import java.util.List;

public class CalificacionResponse<Calificacion> {
	private List<Calificacion> calificaciones;

	/**
	 * @param calificaciones
	 */
	public CalificacionResponse(List<Calificacion> calificaciones) {
		super();
		this.calificaciones = calificaciones;
	}

	/**
	 * @return the calificaciones
	 */
	public List<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	/**
	 * @param calificaciones the calificaciones to set
	 */
	public void setCalificaciones(List<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}
}
