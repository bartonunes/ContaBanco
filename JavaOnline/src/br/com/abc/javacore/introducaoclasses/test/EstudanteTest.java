package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Estudante estudante = new Estudante();
		
		estudante.nome="Ataliba";
		estudante.idade=22;
		estudante.matricula="1234";
		
		System.out.println("nome: "+ estudante.nome);
		System.out.println("idade: "+ (estudante.idade));
		System.out.println("matricula: "+ estudante.matricula);
		
	}

}
