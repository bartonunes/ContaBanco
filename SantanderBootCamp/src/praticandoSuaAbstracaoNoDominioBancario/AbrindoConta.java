package praticandoSuaAbstracaoNoDominioBancario;

import java.util.Scanner;

public class AbrindoConta {
	public static void main(String[] args) {
	    // Lendo os dados de Entrada:
	    Scanner scanner = new Scanner(System.in);
	    
	    int numeroConta = scanner.nextInt();
	    scanner.nextLine(); // Consome a quebra de linha ap�s a entrada do n�mero da conta
	    String nomeTitular = scanner.nextLine();
	    double saldo = scanner.nextDouble();

	    //TODO: Criar uma inst�ncia de "ContaBancaria" com os valores de Entrada.
	  //  ContaBancaria conta =new  ContaBancaria();
	    
//	    conta.setNumero(numeroConta);
//	    conta.setTitular(nomeTitular);
//	    conta.setSaldo(saldo);
	    
	    System.out.println("Informacoes:");
	    //TODO: Imprimir as informa��es da conta usando o objeto criado no TODO acima.
//	    System.out.println("Conta: "+conta.getNumero());
//	    System.out.println("Titular: "+ conta.getTitular());
//	    System.out.println("Saldo: R$"+conta.getSaldo());
	  }
	
	
	public class ContaBancaria {
		  int numero;
		  String titular;
		  double saldo;
		  
		  public ContaBancaria(int numero, String titular, double saldo) {
		    this.numero = numero;
		    this.titular = titular;
		    this.saldo = saldo;
		  }

		
		  
		  
	}
}