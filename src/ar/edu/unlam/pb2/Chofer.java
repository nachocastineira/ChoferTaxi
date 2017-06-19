package ar.edu.unlam.pb2;


public class Chofer {
	
	private String nombre;
	private String fechaDeNacimiento;
	private Integer numeroDeLicencia;
	
	
	public Chofer (String nombre, String fechaDeNacimiento, Integer numeroDeLicencia)
	{
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.numeroDeLicencia = numeroDeLicencia;
	}

	
	// getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public Integer getNumeroDeLicencia() {
		return numeroDeLicencia;
	}


	public void setNumeroDeLicencia(Integer numeroDeLicencia) {
		this.numeroDeLicencia = numeroDeLicencia;
	}
	
	

}
