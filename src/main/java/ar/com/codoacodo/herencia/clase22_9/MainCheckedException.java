package ar.com.codoacodo.herencia.clase22_9;

public class MainCheckedException {

	public static void main(String[] args) {
		
		//bloque de control de error: Exception
		try {
			//sale todo bien
			System.out.println("antes de invocar al metodo"
					+ "que genera error");
			Calculadora.dividir(10, 0);
			System.out.println("todo bien");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Termina el programa... con errores");
		}
	}

}
