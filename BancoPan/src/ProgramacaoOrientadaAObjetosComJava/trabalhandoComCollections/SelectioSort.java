package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.Scanner;

public class SelectioSort {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Scanner tam = new Scanner(System.in);
		    
		    // TODO: Crie um número inteiro da entrada padrão e um array de inteiros com tamanho n:
		    
		    int n;
		    n=tam.nextInt();
		    
		    int vetor[] = new int[n];
		    
		    for(int i =0; i<vetor.length; i ++) {
		    	vetor[i]=sc.nextInt();
		    }

		    selectionSort(vetor);
		    
		    System.out.print("[");
		    for(int i =0; i<vetor.length; i ++) {
		    	System.out.print(vetor[i]);
		    	if(i<(n-1)) {
		    		System.out.print(",");
		    	}
		    }
		    System.out.print("]");
		    

}

	public static void selectionSort(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
			
			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}
	}
	
  
}
