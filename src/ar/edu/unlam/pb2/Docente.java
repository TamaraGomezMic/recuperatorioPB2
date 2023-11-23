package ar.edu.unlam.pb2;


import java.util.Set;
import java.util.HashSet;

public class Docente {
	
	private String nOMBRE_DEL_DOCENTE;
	private Set<Grado> competencias;
	

	public Docente(String nOMBRE_DEL_DOCENTE) {
		super();
		this.nOMBRE_DEL_DOCENTE = nOMBRE_DEL_DOCENTE;
		this.competencias = new HashSet<>();
	}

	public String getnOMBRE_DEL_DOCENTE() {
		return nOMBRE_DEL_DOCENTE;
	}

	public void setnOMBRE_DEL_DOCENTE(String nOMBRE_DEL_DOCENTE) {
		this.nOMBRE_DEL_DOCENTE = nOMBRE_DEL_DOCENTE;
	}

	
	public Set<Grado> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Set<Grado> competencias) {
		this.competencias = competencias;
	}

	public void agregarCompetencia(Grado cuarto) {
		
		competencias.add(cuarto);
	}

	public boolean tieneCompetencia(Grado grado) {
		
		return competencias.contains(grado);
	}
}
