package pe.edu.tecsup.poo._09.herencia;

public class EquipoMovil {

	protected String marca;
	protected String modelo;
	protected int anho;
	
	public String obtenerInfo(){
		
		return marca + " - " + modelo + " - " +anho;
		
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	
	
	
}
