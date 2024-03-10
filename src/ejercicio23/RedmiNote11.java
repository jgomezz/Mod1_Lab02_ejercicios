package ejercicio23;

public class RedmiNote11 extends EquipoMovilXiaomi{

	
	public RedmiNote11() {
		// TODO Auto-generated constructor stub
	}

//	public RedmiNote11(String marca, String modelo, int anho, int memoria) {
//		super(marca, modelo, anho, memoria);
//		// TODO Auto-generated constructor stub
//	}
	
	public RedmiNote11(String marca, String modelo, int anho, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.anho = anho;
		this.memoria = memoria;
	}	
	

	@Override
	public String toString() {
		return "RedmiNote11 [memoria=" + memoria + ", marca=" + marca + ", modelo=" + modelo + ", anho=" + anho + "]";
	}

	
	
}
