package com.omar.triangulo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.omar.triangulo.model.response.ResponseArea;
import com.omar.triangulo.model.response.ResponsePerimetro;
import com.omar.triangulo.service.Operaciones;

@RestController
public class CalculoController {
	/**
	 * Inyeccion del servicio operaciones
	 */

	@Autowired
	private Operaciones operaciones;

	/**
	 * Metodo con el param y el response
	 * 
	 * @param lado
	 * @return retorno del area
	 */
	@GetMapping("/getArea")
	public ResponseArea getArea(@RequestParam double base, @RequestParam double altura) {

		/**
		 * Valor para devolver en el response
		 */
		double area = operaciones.getArea(base, altura);
		/**
		 * Se crea el obejeto del responseArea
		 */
		ResponseArea responseArea = new ResponseArea();

		/**
		 * Se setea el valor de la operacion al objeto
		 */
		responseArea.setArea(area);

		/**
		 * Retorno del objeto con el resultado dentro
		 */
		return responseArea;

	}

	/**
	 * Metodo con el param y el response
	 * 
	 * @param lado
	 * @return retorno del perimetro
	 */
	@GetMapping("/getPerimetro")
	public ResponsePerimetro getPerimetro(@RequestParam double base, @RequestParam double altura) {

		/**
		 * Valor que se devuelve en el response
		 */
		double perimetro = operaciones.getArea(base, altura);

		/**
		 * Creacion del obejto del reponsePerimetro
		 */
		ResponsePerimetro responsePerimetro = new ResponsePerimetro();

		/**
		 * Se setea el valor de la operacion al objeto
		 */
		responsePerimetro.setPerimetro(perimetro);

		/**
		 * Retorno el resultado de perimetro
		 */
		return responsePerimetro;

	}
}
