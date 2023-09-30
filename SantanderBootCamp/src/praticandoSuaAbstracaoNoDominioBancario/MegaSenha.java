package praticandoSuaAbstracaoNoDominioBancario;

import java.util.Scanner;

public class MegaSenha {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    String tipoCofre = scanner.nextLine();
		    int senha = scanner.nextInt();
		    int confirmarcaoSenha = scanner.nextInt();
		    
		    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
		    

		    if (tipoCofre.equalsIgnoreCase("digital")) {
		    	
		    	CofreDigital cd = new CofreDigital(senha);
		    	
		    	if(cd.validarSenha(confirmarcaoSenha)) {
		    		cd.imprimirInformacoes();
		    		System.out.println("Cofre aberto!");
		    	}else {
		    		cd.imprimirInformacoes();
		    		System.out.println("Senha incorreta!");
		    	}
		    }else if(tipoCofre.equalsIgnoreCase("fisico")){
		    	CofreFisico cf = new CofreFisico();
	    		cf.imprimirInformacoes();
		    }
	}

}



abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
  
  
  
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}