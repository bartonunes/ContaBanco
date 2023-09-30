package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class ExemploList {
	 public static void main(String[] args) {
	
		List<Double> notas = new ArrayList<Double>();
		notas.add(1.5);
		notas.add(2.5);
		notas.add(3.5);
		notas.add(4.5);
		notas.add(5.5);
		notas.add(6.5);
		notas.add(7.5);
		notas.add(0.0);
		System.out.println(notas);

		System.out.println("Exibir a 3 nota " + notas.indexOf(3));

		System.out.println("Adicionar a nota 8 na posição 4 ");
		notas.add(4, 8.0);
		System.out.println(notas);

		System.out.println("Subistituir a nota 5 na por 6 ");
		notas.set(5, 6d);
		System.out.println(notas);

		System.out.println("Confira se a nota 5 está na lista :" + notas.contains(5));

		System.out.println("Exiba todas as notas em ordem que foram inseridas :" + notas); 
		System.out.println("Exiba teceira nota adicionada :" + notas.get(3)); 
		System.out.println("Exiba a menor nota  :" + Collections.min(notas)); 
		System.out.println("Exiba a maior nota  :" + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma=0.0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma+=next;
		}
		System.out.println("soma dos elementos da lista: "+ soma);
		System.out.println("soma a media dos elementos da lista: "+ soma/notas.size());
		System.out.println("Remova o valor 0: ");
		notas.remove(0d);
		System.out.println(notas);
		Iterator<Double> iterator1 =notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next<7.0) {
				iterator1.remove();
			}
		}
		
		System.out.println("soma dos elementos da lista: "+ notas);
		System.out.println("apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
		
	}

	@Override
	public String toString() {
		return "ExemploList [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
