package com.tec.alumnos.calificaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tec.alumnos.calificaciones.model.response.ResponseCalificacion;
import com.tec.alumnos.calificaciones.service.ValidacionCalificacion;

@RestController
public class ValidacionController {

	/**
	 * Inyeccion del servicio calificaciones
	 */
	@Autowired
	private ValidacionCalificacion calificacion;

	/**
	 * Metodo con el param y el response
	 *
	 * @param idEstudiante
	 * @return retorno datos del estudiante
	 */
	@GetMapping("/getCalificacionEstudiante")
	public ResponseCalificacion getCalificacion(@RequestParam long idEstudiante) {

		/**
		 * Retorno del objeto
		 */
		return calificacion.getCalificacion(idEstudiante);

	}
}