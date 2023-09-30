package br.com.abc.intro;


public class ImprimindoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome="Roberto";
		String endereco="avenida das flores";
		String telefone= "(81) 1234-4321";
		
		String nome2="Mariaana";
		String salario="R$ 1.500";
		char sexo = 'F';
		int idade = 35;
		String estadoCivil = "Solteira";
		
		
		System.out.println("O "+ nome + " domicialiado no endereco " +endereco+ " e telefone "+ telefone + " nao possiu pendencia" );
		
		System.out.println("O trabalhador(a) " +nome2+" do  sexo " +sexo+ ", idade " +idade+ "vanos, estado civel" +estadoCivil+ 
				" e salario "+salario+ ", encontra-se empregado neste estabelecimento");
	}

}
