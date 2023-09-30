package br.com.abc.javacore.introducaometodos.classes;

/*
 * criar uma classe professor com 
 * nome
 * matricula
 * rg
 * cpf
 * 
 * E depois fazer uma classe para preencher e imprimir os dados da classe
 * */
public class Professor {

		public String nome;
		public String matricula;
		public int rg;
		public String cpf;
		
		public void imprimi(Professor profAux) {
			System.out.println(profAux.cpf);
			System.out.println(profAux.matricula);
			System.out.println(profAux.nome);
			System.out.println(profAux.rg);
		}

		public void imprimi() {
			System.out.println(this.cpf);
			System.out.println(this.matricula);
			System.out.println(this.nome);
			System.out.println(this.rg);
		}
		
}
