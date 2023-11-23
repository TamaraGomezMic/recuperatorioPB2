package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class AlumnoDeSecundaria {

	private Integer dNI;
	private String nOMBRE_DEL_ESTUDIANTE;
	private LocalDate fECHA_DE_NACIMIENTO;
	public AlumnoDeSecundaria(Integer dNI, String nOMBRE_DEL_ESTUDIANTE, LocalDate fECHA_DE_NACIMIENTO) {
		super();
		this.dNI = dNI;
		this.nOMBRE_DEL_ESTUDIANTE = nOMBRE_DEL_ESTUDIANTE;
		this.fECHA_DE_NACIMIENTO = fECHA_DE_NACIMIENTO;
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
	
	

}
