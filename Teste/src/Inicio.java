import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		System.out.println("ola");
				 Scanner scanner = new Scanner(System.in);

				    String entrada = scanner.nextLine();
				    String[] partes = entrada.split(",");
				    
				Transacao obj = new Transacao(null, null, null, 0);
				
				obj.setData(partes[0]);
				obj.setHora(partes[1]);
				obj.setDescricao(partes[2]);
				obj.setValor(Double.parseDouble(partes[3]));
				
				obj.imprimir();

	}

}

class Transacao {
	  private String data;
	  private String hora;
	  private String descricao;
	  private double valor;

	  public Transacao(String data, String hora, String descricao, double valor) {
	    this.data = data;
	    this.hora = hora;
	    this.descricao = descricao;
	    this.valor = valor;
	  }
	  
	  
	  
	  
	  public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	public String getHora() {
		return hora;
	}




	public void setHora(String hora) {
		this.hora = hora;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public void imprimir() {
	    System.out.println(this.descricao);
	    System.out.println(this.data);
	    System.out.println(this.hora);
	    System.out.printf("%.2f", this.valor);
	  }
	}