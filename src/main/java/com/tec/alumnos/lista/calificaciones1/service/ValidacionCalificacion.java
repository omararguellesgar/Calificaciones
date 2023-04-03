package com.tec.alumnos.lista.calificaciones1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tec.alumnos.lista.calificaciones1.model.response.CalificacionResponse;
import com.tec.alumnos.lista.calificaciones1.model.response.ResponseCalificacion;

@Service
public class ValidacionCalificacion<Calificacion> {
	/**
	 * Metodo para obtener el caso por alumno, su calificaion final y si esta
	 * aprobado
	 * 
	 * @param idEstudiante
	 * @return
	 */

	@SuppressWarnings({ "unchecked", "unused" })
	public CalificacionResponse<Calificacion> getCalificacion(long idEstudiante) {
		List<Calificacion> lista = new ArrayList<>();
		CalificacionResponse<Calificacion> response = new CalificacionResponse<>(lista);
		response.setCalificaciones(lista);
		if (idEstudiante == 1) {
			ResponseCalificacion cali = new ResponseCalificacion(9.9, true);
			lista.add((Calificacion) cali);
		} else if (idEstudiante == 2) {
			ResponseCalificacion cali1 = new ResponseCalificacion(6.0, false);
			lista.add((Calificacion) cali1);
		} else {
			ResponseCalificacion cali2 = new ResponseCalificacion(0.0, false);
		}
		return response;
	}

}
