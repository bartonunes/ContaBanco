package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {

		System.out.println("Porfessor 1:");
		Professor prof = new Professor();
		prof.cpf="132-123-312-5";
		prof.matricula="145";
		prof.nome="Ataliba";
		prof.rg=12344312;
		
		Professor prof2 = new Professor();
		prof2.cpf="234-123-312-5";
		prof2.matricula="245";
		prof2.nome="Astaoufo";
		prof2.rg=22344312;
		
		prof.imprimi(prof);
		
		System.out.println();
		System.out.println("Porfessor 2:");
		prof.imprimi(prof2);
		
		System.out.println("-----------------------");
		System.out.println("Usando o this para pegar os valotes de dentro do Obj");
		prof.imprimi();
		
		System.out.println();
		System.out.println("Porfessor 2:");
		prof2.imprimi();
	}
}
