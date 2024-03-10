package ejercicio20;

public class Aplicacion {

	public static void main(String[] args) {

		EquipoDeporte miEquipo = new EquipoDeporte("Futbol");

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
		
		//
		
		miEquipo.setNroIntegrantes((short)20);
		
		System.out.println(miEquipo.toString());

		miEquipo.setNroIntegrantes((short)25);
		
		System.out.println(miEquipo.toString());

		// Invocacion del metodo estatico
		EquipoDeporte.saludar("FR");
		
		
	}


}
