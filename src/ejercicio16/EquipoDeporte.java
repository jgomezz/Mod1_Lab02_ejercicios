package ejercicio16;

public class EquipoDeporte {
	
	// nombre del país, 
//	public String pais;
//	private String pais;
//	protected String pais;
	String pais;
	
	// nombre del deporte, 
	String deporte;
	
	// cantidad de integrantes 
	short nroIntegrantes;
	
	// nombre del equipo
	String nombre;

	public void validarEquipo(){
		
		short nroIntegrantes = 1;
		
		if ( this.nroIntegrantes > 0 &&  this.nroIntegrantes <= 5) {
			System.out.println("Equipo pequeño");
		} else if (this.nroIntegrantes > 5 &&  this.nroIntegrantes <= 10) {
			System.out.println("Equipo mediano");
		} else if (this.nroIntegrantes > 10) {
			System.out.println("Equipo grande");
		}
	}

	public boolean esDisciplinaKarate() {
		
		if( this.deporte.equals("Karate"))
			return true;
		else
			return false;
	
	}

	public String obtenerMensajeBienvenida() {
		// TODO Auto-generated method stub
		return null;
	}


}
