package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.modelo = "camaro";
		carro.placa = "asd-1234";
		carro.velocidadeMaxima = 222;
		
		System.out.println("Modelo: " + carro.modelo );
		System.out.println("Placa: " + carro.placa );
		System.out.println("Velocidade: " + (carro.velocidadeMaxima) );
	}
}
