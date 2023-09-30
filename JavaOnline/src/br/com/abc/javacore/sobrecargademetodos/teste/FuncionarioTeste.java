package br.com.abc.javacore.sobrecargademetodos.teste;

import br.com.abc.javacore.sobrecargademetodos.classe.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.init("Ataliba", "111.111.111-11", 50000,"111.11");
		
		funcionario.imprimi();
	}
}
