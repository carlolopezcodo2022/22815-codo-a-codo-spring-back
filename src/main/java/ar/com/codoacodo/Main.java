package ar.com.codoacodo;

public class Main {

	//voy a darle play al programa
	public static void main(String[] args) {
		
		System.out.println("hola mundo");
		
		//voy a crear una instancia de la clase Auto
			
		Auto miPrimerAuto = new Auto();//nace mi auto
		//aca ya puedo usar los metodos de ese auto
		
		miPrimerAuto.mostrarInfo();
		
		//ejecutar el metodo encender()
		miPrimerAuto.encender();
		
		miPrimerAuto.mostrarInfo();
	}

}
