package ejercicio23;

public class EquipoMovil {

	protected String marca;
	protected String modelo;
	protected int anho;
	
	public EquipoMovil() {
		// TODO Auto-generated constructor stub
	}
	
	public EquipoMovil(String marca, String modelo, int anho) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anho = anho;
	}

	public String obtenerInfo() {
		// TO DO
		return "Sin info";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}
}
