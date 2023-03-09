
package com.student.omar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.omar.model.response.Response;
import com.student.omar.model.response.ResponsePerimetro;

/**
 * Controlador para obtener el result
 * 
 * @author omarar
 *
 */
@RestController
public class CalculoAreaController {

	/**
	 * Metodo con el param y el response
	 * 
	 * @param lado
	 * @return
	 */
	@GetMapping("/getOperaciones")
	public Response getArea(@RequestParam double lado) {

		/**
		 * operacion para sacar el area
		 */
		double area = (lado * lado);

		/**
		 * operacion para sacar el perimetro
		 */
		double perimetro = (lado * 4);

		/**
		 * se crea el objeto del response y se pasan valores a traves de los parametros
		 */
		Response response = new Response(area, perimetro);

		/**
		 * retorno el resultado
		 */
		return response;

	}

	/**
	 * Metodo con el param y el response
	 * 
	 * @param lado
	 * @return
	 */
	@GetMapping("/getPerimetro")
	public ResponsePerimetro getPerimetro(@RequestParam double lado) {

		/**
		 * operacion para sacar el perimetro
		 */
		double perimetro = (lado * 4);

		/**
		 * se crea el objeto del response y se pasan valores a traves de los parametros
		 */
		ResponsePerimetro response = new ResponsePerimetro(perimetro);

		/**
		 * retorno el resultado
		 */
		return response;

	}
}
