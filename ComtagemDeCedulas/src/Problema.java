import java.util.Scanner;

public class Problema {

	public static void main(String[] args) {
	      
	      
	      
	      
	      Scanner sc = new Scanner(System.in);
	      
	      int valor = sc.nextInt();
	      
	      int v100=valor/100;
	      System.out.println( v100 +" nota(s) de R$ 100,00");
	      
	      int vM100=valor%100;
	      System.out.println( (vM100/50)+ " nota(s) de R$ 50,00");
	      
	      int vM20= vM100%50;
	      System.out.println((vM20/20) + " nota(s) de R$ 20,00");
	      
	      int vM10=vM20%20;
	      System.out.println( (vM10)/10 + " nota(s) de R$ 10,00");
	      
	      int vM5=vM10%10;
	      System.out.println((vM5)/5 + " nota(s) de R$ 5,00");
	      
	      int vM2=vM5%5;
	      System.out.println((vM2)/2 + " nota(s) de R$ 2,00");
	      System.out.println(vM2%2 + " nota(s) de R$ 1,00");
	      
	    }
    
	
}
