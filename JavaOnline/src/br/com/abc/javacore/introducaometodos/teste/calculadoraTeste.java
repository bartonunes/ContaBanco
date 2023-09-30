package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

class calculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		 System.out.println("soma de dois numeros:");
		 calc.somaDoisNumeros();

		 System.out.println("subtração de dois numeros:");
		 calc.subtraiDoisNumeros();
		 
		 
		 System.out.println("multiplicação de dois numeros:");
		 calc.multiplicarDoisNumeros(5, 4);
		 
		 /*como esse metod retorna um valor pode-se chamalo dentro de um sysOut, 
		  * ou colocalo em uma variavel EX: double cal = calc.dividirDoisNumeros(20, 2);
		  * 
		  * */
		 System.out.println("Divisao de dois numeros: "+ calc.dividirDoisNumeros(20, 2));
		 
	
	
	}
}
