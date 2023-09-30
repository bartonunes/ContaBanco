package br.com.abc.javacore.introducaometodos.teste;

import java.util.Scanner;

import br.com.abc.javacore.introducaometodos.classes.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno alunoTeste = new Aluno();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o nome do aluno: ");
		alunoTeste.setNome(sc.nextLine());
		
		System.out.println("Digite a idade do aluno");
		alunoTeste.setIdade(sc.nextInt());
		
		System.out.println("Digite a 1° nota do aluno");
		alunoTeste.setNota1(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Digite a 2° nota do aluno");
		alunoTeste.setNota2(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("Digite a 3° nota do aluno");
		alunoTeste.setNota3(sc.nextDouble());
		
		//alunoTeste.Media(alunoTeste.getNota1(), alunoTeste.getNota2(), alunoTeste.getNota3());
		
		System.out.println("nome do aluno: " + alunoTeste.getNome());
		System.out.println("nome do Idade: " + alunoTeste.getIdade());
		System.out.println("nnota 1: " +alunoTeste.getNota1());
		System.out.println("nnota 2: " +alunoTeste.getNota2());
		System.out.println("nnota 3: " +alunoTeste.getNota3());
		System.out.println("a media do anluno: ");
		System.out.println( alunoTeste.Media(alunoTeste.getNota1(), alunoTeste.getNota2(), alunoTeste.getNota3()) );
		
	}	
	
}
