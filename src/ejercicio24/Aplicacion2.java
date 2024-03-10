package ejercicio24;

public class Aplicacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EquipoMovilApple apple = new EquipoMovilApple();
		EquipoMovilSamsung samsung = new EquipoMovilSamsung();
		EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi();
		
		System.out.println(apple.obtenerInfo());
		System.out.println(samsung.obtenerInfo());
		System.out.println(xiaomi.obtenerInfo());
		
		
	}

}
