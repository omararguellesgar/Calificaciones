package com.tec.alumnos.calificaciones.service;

import org.springframework.stereotype.Service;

import com.tec.alumnos.calificaciones.model.response.ResponseCalificacion;

@Service
public class ValidacionCalificacion {
	/**
	 * Metodo para obtener el caso por alumno, su calificaion final y si esta
	 * aprobado
	 * 
	 * @param idEstudiante
	 * @return
	 */

	public ResponseCalificacion getCalificacion(long idEstudiante) {
		ResponseCalificacion responseCalificacion = new ResponseCalificacion();
		if (idEstudiante == 1) {
			responseCalificacion.setCalificacionFinal(9.9);
			responseCalificacion.setAprobado(true);
		} else if (idEstudiante == 2) {
			responseCalificacion.setCalificacionFinal(6.0);
			responseCalificacion.setAprobado(false);
		} else {
			responseCalificacion.setCalificacionFinal(0.0);
			responseCalificacion.setAprobado(false);
		}

		return responseCalificacion;
	}

}
