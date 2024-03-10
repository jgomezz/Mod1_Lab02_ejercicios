package ejercicio24;

public class EquipoMovilXiaomi extends EquipoMovil {

	protected int memoria;
	
	public EquipoMovilXiaomi() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EquipoMovilXiaomi(String marca, 
				String modelo, int anho, int memoria) {
		
		// Accede al constructor de la clase base
		super(marca, modelo, anho);
		
		// TODO Auto-generated constructor stub
		this.memoria = memoria;
	}

	
	@Override
	public String obtenerInfo() {
		return "Equipo Xiaomi";
	}
	
	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	
}
