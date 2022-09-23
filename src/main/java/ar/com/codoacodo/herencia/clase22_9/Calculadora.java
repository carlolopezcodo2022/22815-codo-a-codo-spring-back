package ar.com.codoacodo.herencia.clase22_9;

public class Calculadora {

	public static float dividir(int a, int b ) throws Exception {
		if(b == 0) {
			//voy a lanzar una Exception
			throw new Exception("NO SE PUEDE DIVIR POR 0"); 
		}
		
		return a / b;
	}
}
