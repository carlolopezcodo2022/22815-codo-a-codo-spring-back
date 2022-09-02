package ar.com.codoacodo;

public class Main2 {

	public static void main(String[] args) {
		
		//byte < short < int < long < float < double
		
		//5 km
		Auto miPrimerAuto = new Auto(5);//f3 f5		

		miPrimerAuto.encender();
		
		miPrimerAuto.quintaAFondo();
		
		System.out.println("ahora frenando....");
		
		//miPrimerAuto.detener();

		miPrimerAuto.apagar();
		
		System.out.println("fin");
	}

}
