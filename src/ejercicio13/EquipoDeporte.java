package ejercicio13;

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


    // Declaracion de metodos
	
	// AMBITO TIPO_DE_RETORNO NOMBRE_METODO() {}

	public void mostrarInformacion() {
		System.out.println("El pais = " + pais);
		System.out.println("El deporte = " + deporte);
		System.out.println("NroIntegrantes = " + nroIntegrantes);
		System.out.println("El nombre = " + nombre);
	}

}
