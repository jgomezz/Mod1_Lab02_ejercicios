package ejercicio14;

public class Aplicacion {

	public static void main(String[] args) {

		EquipoDeporte miEquipo = new EquipoDeporte();

		miEquipo.pais="PERU";
		miEquipo.deporte="Karate";
		miEquipo.nroIntegrantes = 11;
		miEquipo.nombre = "Los novatos";

		miEquipo.validarEquipo();
		
		
	}
}
