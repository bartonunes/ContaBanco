package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {

	public void somaDoisNumeros() {
		System.out.println(5+5);
	}
	public void subtraiDoisNumeros() {
		System.out.println(6-5);
	}
	
	public void multiplicarDoisNumeros(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	public double dividirDoisNumeros(double n1, double n2) {
		//double resultado = n1/n2;
		
		if(n2==0) {
			System.out.println("Não exite divisão por zero");
			return 0;
		}
		return n1/n2;
	}




}
