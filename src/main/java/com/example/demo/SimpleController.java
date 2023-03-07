package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SimpleController {
	// variable de un lado del cuadrado
	int lado = 10;

	@GetMapping("/getArea")
	// metodo con los params y el response
	public Response getArea(@RequestParam int lado) {

		// operacion para sacar el area
		int Area = (lado * lado);

		// se crea el objeto del response
		Response response = new Response();

		// Seteo del resultado al response
		response.setResult(Area);

		// retorno el resultado
		return response;

	}
}