package pe.edu.tecsup.poo._09.herencia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi();
		
		xiaomi.setMarca("Xiaomi");
		xiaomi.setModelo("Redmi 12");
		xiaomi.setAnho(2023);
		
		System.out.println(xiaomi.obtenerInfo());

		EquipoMovilApple apple = new EquipoMovilApple();
		
		apple.setMarca("Apple");
		apple.setModelo("iPhone 14c");
		apple.setAnho(2022);
		
		System.out.println(apple.obtenerInfo());

	
	}

}
