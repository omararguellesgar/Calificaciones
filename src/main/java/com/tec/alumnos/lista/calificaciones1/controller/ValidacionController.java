package com.tec.alumnos.lista.calificaciones1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tec.alumnos.lista.calificaciones1.model.response.CalificacionResponse;
import com.tec.alumnos.lista.calificaciones1.service.ValidacionCalificacion;

@RestController
public class ValidacionController {

	/**
	 * Inyeccion del servicio calificaciones
	 */
	@Autowired
	private ValidacionCalificacion<?> calificacion;

	/**
	 * Metodo con el param y el response
	 *
	 * @param idEstudiante
	 * @return retorno datos del estudiante
	 */
	@GetMapping("/getCalificacionEstudiante")
	public CalificacionResponse<?> getCalificacion(@RequestParam long idEstudiante) {
		/**
		 * Retorno del objeto
		 */
		return calificacion.getCalificacion(idEstudiante);

	}
}