package pe.edu.tecsup.poo._03.metodos;

public class Aplicacion {

	public static void main(String[] args) {
		
		Auto miAuto = new Auto();
		
		//color, placa, marca y año de fabricación
		miAuto.color = "Blanco";
		miAuto.placa = "PE-1000";
		miAuto.marca = "Toyota";
		miAuto.anhoFabricacion = 2020;

		// Invoca al metodo
		miAuto.imprimirValores();
		
		Auto otroAuto = new Auto();
		
		//color, placa, marca y año de fabricación
		otroAuto.color = "Amarillo";
		otroAuto.placa = "PE-2000";
		otroAuto.marca = "Nissan";
		otroAuto.anhoFabricacion = 2021;

		// Invoca al metodo
		otroAuto.imprimirValores();
		
		// Llamada a metodo que retorno valor
		String retorno = otroAuto.obtenerInfo();
		System.out.println(retorno);
		
		// Llamada a metodo que retorno valor
		String otroRetorno = otroAuto.toString();
		System.out.println(otroRetorno);
				
		System.out.println(otroAuto);
		System.out.println(otroAuto.toString());		
	}

}
