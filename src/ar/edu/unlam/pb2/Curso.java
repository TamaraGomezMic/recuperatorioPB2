package ar.edu.unlam.pb2;

public abstract class Curso {
 
	private String dESCRIPCION_DEL_CURSO;
	private Integer cL;
	
	
	
	public Curso(String dESCRIPCION_DEL_CURSO, Integer cL) {
		super();
		this.dESCRIPCION_DEL_CURSO = dESCRIPCION_DEL_CURSO;
		this.cL = cL;
	}
	
	
	public String getdESCRIPCION_DEL_CURSO() {
		return dESCRIPCION_DEL_CURSO;
	}
	public void setdESCRIPCION_DEL_CURSO(String dESCRIPCION_DEL_CURSO) {
		this.dESCRIPCION_DEL_CURSO = dESCRIPCION_DEL_CURSO;
	}
	public Integer getcL() {
		return cL;
	}
	public void setcL(Integer cL) {
		this.cL = cL;
	}


	


	
	
}
