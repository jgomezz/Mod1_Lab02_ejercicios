package ejercicio16;

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
		
		// Crear un metodo para obtener el mensaje de Bienvenida ,
		// Si son de Perù debera devolver , "Bienvenidos equipo de [Disciplina]" ,
		// Si son de USA debera devolver el mensaje "Welcome team of [Disciplina] "
		// , para los otros casos debe devolver el mensaje "Bienvenidos"
		
		
		String mensaje = miEquipo.obtenerMensajeBienvenida();
		
		System.out.println(mensaje);
		
		
		String mensajePersonalizado
			= miEquipo.obtenerMensajePersonalizado("Lima");
		
		System.out.println(mensajePersonalizado);
	}


}
