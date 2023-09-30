package ProgramacaoOrientadaAObjetosComJava.trabalhandoComCollections;

import java.util.HashSet;
import java.util.Set;

public class ExemploOrdenaçãoSet {

	public static void main(String[] args) {
		
		System.out.println("Odem aleatoria");
//		Set<Serie> serie = new HashSet<>() {{
//			add(new Serie(nome:"got", genero:"Fantasia", TempoEpisodio:60));
//			add(new Serie(nome:"dark", genero:"drama", TempoEpisodio:60));
//			add(new Serie(nome:"tha't anos 70", genero:"comedia", TempoEpisodio:25));
//		}};
		
	}

}


class Serie{
	private String nome;
	private String genero;
	private Integer TempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		
		this.nome = nome;
		this.genero = genero;
		TempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return TempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		TempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", TempoEpisodio=" + TempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TempoEpisodio == null) ? 0 : TempoEpisodio.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (TempoEpisodio == null) {
			if (other.TempoEpisodio != null)
				return false;
		} else if (!TempoEpisodio.equals(other.TempoEpisodio))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}