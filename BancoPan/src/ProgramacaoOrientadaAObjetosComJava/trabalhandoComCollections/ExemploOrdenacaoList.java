package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

	public static void main(String[] args) {
		
		List<Gatos> meusGatos = new ArrayList<Gatos>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Gatos("pixano",18,"preto"));
			add(new Gatos("miau",6,"tigrado"));
			add(new Gatos("simba",12,"amarelo"));
		}};

		System.out.println("Ordem de inserção");
		System.out.println(meusGatos);
		
		System.out.println("Ordem aleatoria");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		/*temos que implementa o comparable na classe gato*/
		System.out.println("Ordem natural");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem Idade");
		Collections.sort(meusGatos, new ComparatorIdade()); 
		//meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem Pela cor");
		//Collections.sort(meusGatos, new ComparatorCor()); 
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("Ordem Pela cor/nome/idade");
		//Collections.sort(meusGatos, new ComparatorCor()); 
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
		
		
	}

}

class Gatos  implements Comparable<Gatos>{
	private String nome;
	private Integer idade;
	private String cor;
	
	Gatos(String nome, Integer idade, String cor){
		this.nome=nome;
		this.idade=idade;
		this.cor=cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gatos [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gatos o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(getNome());
	}
	
	
}


class ComparatorIdade implements Comparator<Gatos>{

	@Override
	public int compare(Gatos o1, Gatos o2) {
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gatos> {

	@Override
	public int compare(Gatos o1, Gatos o2) {
		// TODO Auto-generated method stub
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gatos>{

	@Override
	public int compare(Gatos o1, Gatos o2) {
		
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
		
		if(nome!=0)
			return nome;
		if(cor!=0)
			return cor;
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
	
}
