package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<Double>(Arrays.asList(7d,8.5,9.3,5d,7d,8d,0d,3.6));
		
		System.out.println(notas);
		
		System.out.println("Exiba a posição da nota 5: não tem como.");
		System.out.println("Adicione a nota 8 na posição 4: Não temcomo");
		System.out.println("Substitua a nota5 pela nota 6: Não temcomo");
		System.out.println("Confira se a nota5 existe:" + notas.contains(5d));
		System.out.println("Exiba a menor nota:" +  Collections.min(notas));
		System.out.println("Exiba a menor maior:" +  Collections.max(notas));

		
		Iterator<Double> iterator = notas.iterator();
		Double soma= 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
				soma+= next;
				
		}
		System.out.println("Exiba a soma:" +  soma);
		System.out.println("Exiba a média:" +  soma/notas.size());
		
		System.out.println("Remova o nota 0: ");
		notas.remove(5d);
		System.out.println(notas);
		
		System.out.println("Remova o nota na posição 0: Não temcomo");
		
		System.out.println("Remova as notas 7: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas em ordem que foram inseridas :" + notas); 
		
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(8d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("Eximba as novas notas em ordem crescente: ");
		Set<Double> notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		System.out.println("O conjunto   est fazio?: "+ notas.isEmpty());
		System.out.println("O conjunto 2 est fazio?: "+ notas2.isEmpty());
		System.out.println("O conjunto 3 est fazio?: "+ notas3.isEmpty());
	}
}
