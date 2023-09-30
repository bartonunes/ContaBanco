package ProgramacaoOrientadaAObjetosComJava.Execoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionCustomizada_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeDoArquivo =	"teste.txt";
		
		imprimirArquivoNoConsole(nomeDoArquivo);

		System.out.println("Apesar de exceptio ou não o progrma contunua, ....");
	
	}

	
	public static void imprimirArquivoNoConsole(String nomeDoArquivo){
		
		
		
		try {
			
			BufferedReader br = lerArqivo(nomeDoArquivo);
			String line = br.readLine();
			BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
			do {
				bw.write(line);
				bw.newLine();
				line=br.readLine();
			} while (line != null);
			bw.flush();
			br.close();
		}catch (ImpossivelAberturaDeArquivoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, "nome do arquivo errado "+e.getMessage());
			e.getStackTrace();
		}
	}
	
	
	public static 	BufferedReader lerArqivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
		File file = new File(nomeDoArquivo);
		
		try {
			return  new BufferedReader(new FileReader(file.getName()));
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
		}
	}
	
}

class ImpossivelAberturaDeArquivoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeArquivo;
	private String diretorio;
	public ImpossivelAberturaDeArquivoException(String nomeArquivo, String diretorio) {
		super("o arquivo "+ nomeArquivo+ " não foi encontrado no diretorio "+diretorio);
		this.nomeArquivo = nomeArquivo;
		this.diretorio = diretorio;
	}
	@Override
	public String toString() {
		return "ImpossivelAberturaDeArquivoException [nomeArquivo=" + nomeArquivo + ", diretorio=" + diretorio + "]";
	}
	
	
}
