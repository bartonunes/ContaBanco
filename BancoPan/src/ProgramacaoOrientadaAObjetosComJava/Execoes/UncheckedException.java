package ProgramacaoOrientadaAObjetosComJava.Execoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner sc = new Scanner(System.in);
//		int a,b;
//		System.out.println("Digite o numerador");
//		a=sc.nextInt();
//		
//		System.out.println("Digite o deominador");
//		b=sc.nextInt();
		
		String a = JOptionPane.showInputDialog("numerador: ");
		String b = JOptionPane.showInputDialog("numerador: ");
		
		
		try {
		int resultado = Integer.parseInt(a)/Integer.parseInt(b);

			System.out.println("resposta: "+resultado);
		} catch ( NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "entrada invalida"+e.getMessage());
			//e.printStackTrace();
		}catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "divisão por 0 é proibido"+e.getMessage());
		}finally {
			System.out.println("chegou no finaly");
		}
		
		System.out.println("o programa continua rodando");
		
	}

}
