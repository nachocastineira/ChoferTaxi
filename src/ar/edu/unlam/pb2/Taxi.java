package ar.edu.unlam.pb2;

public class Taxi {
	
	private Chofer miChofer;
	
	public Taxi (String nombre, String fechaDeNacimiento, Integer numeroDeLicencia)
	{
		
		this.miChofer = new Chofer("Juan","10marzo1980", 14455);
		//faltan this
		
	}

	public Chofer getMiChofer() {
		return miChofer;
	}

	public void setMiChofer(Chofer miChofer) {
		this.miChofer = miChofer;
	}
	
	
	

}
