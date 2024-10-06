package pe.edu.tecsup.poo._05.sobrecarga;

public class OperacionMatematica {

	public int multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	public int multiplicar(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a * b * c;
	}

	public int multiplicar(int... datos) {

		int mul = 1;
		for (int d : datos) {
			mul *= d;
		}
		return mul;

	}

}
