package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.exception.DocenteNoTieneCompetencia;

public class GradoPrimaria extends Curso{
	
	private Integer eDAD;
	private Grado grado;
	private List<Docente> docentes;
	
	
	public GradoPrimaria(String dESCRIPCION_DEL_CURSO, Integer cL, Integer eDAD, Grado grado) {
		super(dESCRIPCION_DEL_CURSO, cL);
		this.eDAD = eDAD;
		this.grado = grado;
		this.docentes = new ArrayList<>();
	}
	
	
	public Integer geteDAD() {
		return eDAD;
	}
	public void seteDAD(Integer eDAD) {
		this.eDAD = eDAD;
	}
	public Grado getGrado() {
		return grado;
	}
	public void setGrado(Grado grado) {
		this.grado = grado;
	}


	public List<Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}


	public void setDocente(Docente susana) throws DocenteNoTieneCompetencia{ 
		
			if (susana.tieneCompetencia(this.grado)) {
		           asignarDocente(susana);
		    } else {
		            
		    	throw new DocenteNoTieneCompetencia("\"El docente no tiene competencia para este grado.");
		    }
	
	}


	private void asignarDocente(Docente susana) {
		docentes.add(susana);
		
	}
}
