package ar.edu.unlam.pb2;

import java.util.List;

import ar.edu.unlam.pb2.exception.NoEstaHabilitadoException;

import java.util.ArrayList;

public class Escuela {

	private String nOMBRE_DE_LA_ESCUELA;

	private List<Curso> cursos;
	
	public Escuela(String nOMBRE_DE_LA_ESCUELA) {
		this.nOMBRE_DE_LA_ESCUELA = nOMBRE_DE_LA_ESCUELA;
		this.cursos = new ArrayList<>();
	}


	public String getnOMBRE_DE_LA_ESCUELA() {
		return nOMBRE_DE_LA_ESCUELA;
	}

	public void setnOMBRE_DE_LA_ESCUELA(String nOMBRE_DE_LA_ESCUELA) {
		this.nOMBRE_DE_LA_ESCUELA = nOMBRE_DE_LA_ESCUELA;
	}


	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	

	
	public void crearCurso(GradoPrimaria cuartoGrado) {
		cursos.add(cuartoGrado);
		
	}


	public void inscribir(AlumnoDePrimaria alumno, Integer cL) throws NoEstaHabilitadoException {
		Curso curso = buscarCurso(cL);
		
		if (curso.getcL().equals(cL)) {
            GradoPrimaria grado = (GradoPrimaria) curso;
            verificarEdad(alumno, grado.geteDAD());
            alumno.inscribir(grado);
        }
		
	}

	
	private Curso buscarCurso(int cicloLectivo) {
        for (Curso curso : cursos) {
            if (curso.getcL() == cicloLectivo) {
                return curso;
            }
        }
        return null;
    }
	
	private void verificarEdad(AlumnoDePrimaria alumno, int edadMinima) throws NoEstaHabilitadoException {
        int edad = alumno.calcularEdad();
        if (edad < edadMinima) {
            throw new NoEstaHabilitadoException("El alumno no cumple con la edad mínima requerida para el curso.");
        }
    }
	
	
	
}
