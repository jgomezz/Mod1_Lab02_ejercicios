package ejercicio24;

public class Aplicacion {

	public static void main(String[] args) {
		// 
		
		EquipoMovilApple ema =  new EquipoMovilApple();
		
		String info = ema.obtenerInfo();
		
		System.out.println(info);
		
		// Redmi Note 11
		
		RedmiNote11 redmi =  new RedmiNote11();
		redmi.setMarca("Xiaomi");
		redmi.setModelo("Redmi Note 11");
		redmi.setAnho(2022);
		redmi.setMemoria(6);
		
		System.out.println(redmi.toString());
		
		RedmiNote11 redmi2 =  
				new RedmiNote11("Xiaomi","Redmi Note 11",2022,6);
		
		System.out.println(redmi.toString());
		
		
	
	}

}
