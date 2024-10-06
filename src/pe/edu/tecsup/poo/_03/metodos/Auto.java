package pe.edu.tecsup.poo._03.metodos;

public class Auto {

	String color;
	public String placa;
	public String marca;
	public int anhoFabricacion;

	public void imprimirValores() {

		System.out.println(this.color);
		System.out.println(this.placa);
		System.out.println(this.marca);
		System.out.println(this.anhoFabricacion);

	}

	public String obtenerInfo() {

		String s = this.placa + " : " + this.marca.toUpperCase();

		return s;

	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", placa=" + placa + ", marca=" + marca + ", anhoFabricacion=" + anhoFabricacion
				+ "]";
	}



}
