package ejercicio15;

public class Aplicacion {

	public static void main(String[] args) {

		EquipoDeporte miEquipo = new EquipoDeporte();

		miEquipo.pais="PERU";
		miEquipo.deporte="Karate";
		miEquipo.nroIntegrantes = 11;
		miEquipo.nombre = "Los novatos";

		miEquipo.validarEquipo();
		
		// Si el equipo es de la disciplina de Karate
		// tiene un descuento por hospedaje
		
		boolean esKarate = miEquipo.esDisciplinaKarate();
		
		if(esKarate) {
			System.out.println("Tienes descuento de hospedaje");
		}
		
	}


}
