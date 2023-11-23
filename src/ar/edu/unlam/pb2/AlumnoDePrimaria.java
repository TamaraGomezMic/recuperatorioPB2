package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.time.Period;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class AlumnoDePrimaria {
	
	private Integer dNI;
	private String nOMBRE_DEL_ESTUDIANTE;
	private LocalDate fECHA_DE_NACIMIENTO;
	private List<GradoPrimaria> grados;
	private Set<LocalDate> asistencias;

	
	public AlumnoDePrimaria(Integer dNI, String nOMBRE_DEL_ESTUDIANTE, LocalDate fECHA_DE_NACIMIENTO) {
		
		this.dNI = dNI;
		this.nOMBRE_DEL_ESTUDIANTE = nOMBRE_DEL_ESTUDIANTE;
		this.fECHA_DE_NACIMIENTO = fECHA_DE_NACIMIENTO;
		this.asistencias = new HashSet<>();
		this.grados = new ArrayList<>();
	}
	

	public Set<LocalDate> getAsistencias() {
		return asistencias;
	}


	public void setAsistencias(Set<LocalDate> asistencias) {
		this.asistencias = asistencias;
	}
	
	


	public Integer getdNI() {
		return dNI;
	}


	public void setdNI(Integer dNI) {
		this.dNI = dNI;
	}


	public String getnOMBRE_DEL_ESTUDIANTE() {
		return nOMBRE_DEL_ESTUDIANTE;
	}


	public void setnOMBRE_DEL_ESTUDIANTE(String nOMBRE_DEL_ESTUDIANTE) {
		this.nOMBRE_DEL_ESTUDIANTE = nOMBRE_DEL_ESTUDIANTE;
	}


	public LocalDate getfECHA_DE_NACIMIENTO() {
		return fECHA_DE_NACIMIENTO;
	}


	public void setfECHA_DE_NACIMIENTO(LocalDate fECHA_DE_NACIMIENTO) {
		this.fECHA_DE_NACIMIENTO = fECHA_DE_NACIMIENTO;
	}


	public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        
   
        Period periodo = Period.between(fECHA_DE_NACIMIENTO, fechaActual);
        return periodo.getYears();
    }



	public List<GradoPrimaria> getGrados() {
		return grados;
	}


	public void setGrados(List<GradoPrimaria> grados) {
		this.grados = grados;
	}


	public void inscribir(GradoPrimaria grado) {
		grados.add(grado);
		
	}


	public void asistir(LocalDate now) {
		
		asistencias.add(now);
	}


	public boolean asistio(LocalDate now) {
		
		return asistencias.contains(now);
	}
	
}
