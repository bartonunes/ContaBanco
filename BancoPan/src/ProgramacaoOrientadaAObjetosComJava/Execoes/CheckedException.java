package ProgramacaoOrientadaAObjetosComJava.Execoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String nomeDoArquivo =	"teste.txt";
		try {
			imprimirArquivoNoConsole(nomeDoArquivo);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "nome do arquivo errado "+e.getMessage());
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu algum erro inesperado "+e.getMessage());
		}

		System.out.println("Apesar de exceptio ou não o progrma contunua, ....");
	
	}
	
	
	public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException  {
	
		File file = new File(nomeDoArquivo);
		
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(line);
			bw.newLine();
			line=br.readLine();
		} while (line != null);
		bw.flush();
		br.close();
		
	}

}

