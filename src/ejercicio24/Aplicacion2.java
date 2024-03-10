package ejercicio24;

public class Aplicacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EquipoMovilApple apple = new EquipoMovilApple();
//		EquipoMovilSamsung samsung = new EquipoMovilSamsung();
//		EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi();
		
		
		
//		EquipoMovil apple = new EquipoMovilApple();
//		EquipoMovil samsung = new EquipoMovilSamsung();
//		EquipoMovil xiaomi = new EquipoMovilXiaomi();
//				
//		System.out.println(apple.obtenerInfo());
//		System.out.println(samsung.obtenerInfo());
//		System.out.println(xiaomi.obtenerInfo());
		

//		EquipoMovil em;
//		
//		em = new EquipoMovilApple();
//		System.out.println(em.obtenerInfo());
//		
//		em = new EquipoMovilSamsung();
//		System.out.println(em.obtenerInfo());
//		
//		em = new EquipoMovilXiaomi();
//		System.out.println(em.obtenerInfo());
		

		
		EquipoMovil em[] = {new EquipoMovilApple(),
							new EquipoMovilSamsung(),
							new EquipoMovilXiaomi()};
		
		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i].obtenerInfo());			
		}
		
	}

}
