package com.omar.triangulo.service;

import org.springframework.stereotype.Service;

@Service
public class Operaciones {
	/**
	 * metodo para sacar el area del triangulo
	 * 
	 * @param base
	 * @param altura
	 * @return
	 */
	public double getArea(double base, double altura) {
		return ((base * altura) / 2);
	}

	/**
	 * metodo para sacar el perimetro del triangulo
	 * 
	 * @param base
	 * @param altura
	 * @return
	 * @return
	 */
//	public double getPerimetro(double base, double altura) {
//		double sumadeCuadrados = Math.pow(altura, 2) + Math.pow(base, 2);
//		double raizDeSumaCuadrados = Math.sqrt(sumadeCuadrados);
//		return base + altura + raizDeSumaCuadrados;
//	}
	public static void main(String[] args) {

		double base = 10, altura = 5;
		double sumadeCuadrados = Math.pow(altura, 2) + Math.pow(base, 2);
		double raizDeSumaCuadrados = Math.sqrt(sumadeCuadrados);
		System.out.println(base + altura + raizDeSumaCuadrados);
	}

}
