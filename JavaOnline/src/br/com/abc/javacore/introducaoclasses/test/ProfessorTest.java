package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor professor = new Professor();
		
		professor.nome= "joão";
		professor.matricula="asf134";
		professor.rg=134;
		professor.cpf="12332132123";
		
	
		System.out.println("nome:" + professor.nome);
		System.out.println("marticula: " + professor.matricula);
		System.out.println("rg: " + (professor.rg));
		System.out.println("CPF: " +professor.cpf);
	}

}
