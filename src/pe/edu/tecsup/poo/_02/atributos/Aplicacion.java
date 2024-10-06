package pe.edu.tecsup.poo._02.atributos;

public class Aplicacion {

	public static void main(String[] args) {
		
		Auto miAuto = new Auto();
		
		//color, placa, marca y año de fabricación
		miAuto.color = "Blanco";
		miAuto.placa = "PE-1000";
		miAuto.marca = "Toyota";
		miAuto.anhoFabricacion = 2020;

		System.out.println(miAuto.color);
		System.out.println(miAuto.placa);
		System.out.println(miAuto.marca);
		System.out.println(miAuto.anhoFabricacion);
		
	}

}
