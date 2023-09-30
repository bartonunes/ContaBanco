package ProgramacaoOrientadaAObjetosComJava.Execoes;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	       double saldo=0.00;
	       double valor = 0.00;
	       while(true){
	        
	         valor = scanner.nextDouble();

	        if (valor > 0) {
	            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
	            saldo+=valor;
	            System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " +saldo);
	        } else if (valor == 0) {
	            System.out.println("Encerrando o programa...");
	            break;
	        } else {
	             //TODO: Imprimir a mensagem de encerrar o programa.
	             System.out.println("Valor invalido! Digite um valor maior que zero.");
	        }
	      }
			
	}

}
