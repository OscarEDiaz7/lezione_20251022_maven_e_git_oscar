package lezione_20251022_maven_e_git_oscar;

public class Studente {
	
	String ciaoOscarSonoPablito;
	
	private String matricola;
	private String nome;
	private String cognome;
	private int eta;
	
	public Studente() {}
	
	public Studente(String matricola, String nome, String cognome, int eta) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	

}
