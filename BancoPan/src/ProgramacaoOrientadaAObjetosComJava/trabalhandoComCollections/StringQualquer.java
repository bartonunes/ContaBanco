package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.Scanner;

public class StringQualquer {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		 String s= sc.nextLine();
		 s=s.toLowerCase();
		 
		 for(int i =0; i<s.length(); i++) {
			 if(s.charAt(i)== 'a') {
				s= s.replace("a", "A");
			 }else if(s.charAt(i)== 'e') {
				 s= s.replace("e", "E");
			 }else if(s.charAt(i)== 'i') {
				 s= s.replace("i", "I");
			 }else if(s.charAt(i)== 'o') {
				 s= s.replace("o", "O");
			 }else if(s.charAt(i)== 'u') {
				 s= s.replace("u", "U");
			 }
		 }
		 
		 System.out.println(s);
	}
}
