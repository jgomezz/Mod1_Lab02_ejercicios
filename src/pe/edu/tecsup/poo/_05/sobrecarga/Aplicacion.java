package pe.edu.tecsup.poo._05.sobrecarga;


public class Aplicacion {

	public static void main(String[] args) {
        // TODO Auto-generated method stub

		OperacionMatematica m = new OperacionMatematica();

		int a = 10;
		int b = 3;		
		int c = 13;	

		System.out.println("La suma es " + m.multiplicar(a, b));
		System.out.println("La suma es " +  m.multiplicar(a, b, c));
		System.out.println("La suma es " + m.multiplicar(1,4,2,3,4,5,6));
		
	}

}
