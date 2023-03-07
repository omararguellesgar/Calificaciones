package com.student.omar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para obtener el result
 * 
 * @author omarar
 *
 */
@RestController
public class CalculoAreaController {
	@GetMapping("/getArea")
	/**
	 * Metodo con los params y el response
	 * 
	 * @param lado
	 * @return
	 */
	public Response getArea(@RequestParam int lado) {

		// operacion para sacar el area
		int area = (lado * lado);

		// se crea el objeto del response
		Response response = new Response();

		// Seteo del resultado al response
		response.setResult(area);

		// retorno el resultado
		return response;

	}
}