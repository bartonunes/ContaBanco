import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		String agencia;
//		String nomeCliente;
//		double saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência!");
		int numero = sc.nextInt();
		
		
		System.out.println("Por favor, digite o nome da Agência!");
		String	agencia = sc.next();
		
		System.out.println("Por favor, digite o seu Nome!");
		String nomeCliente = sc.next();
		
		System.out.println("Por favor, digite o Saldo!");
		Double saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente +" obrigado por criar uma conta no nosso banco, "
		+ "sua agência é "+agencia+" conta "+numero+ " e seu saldo é "+ saldo+" já disponível para saque."); 
		
	}
}
