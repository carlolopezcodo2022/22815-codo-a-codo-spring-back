package ar.com.codoacodo;

//los nombre de las clases la primer letra es en mayuscula
public class Auto {
	
	/*
	 atributos
	*/
	boolean encendido; //tipos de datos?
	float velocidad; 
	String marca;
	String modelo;
	int anio;//
	
	//todas las clases tienen un constructor por defecto
	//contructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		encendido = false;//esta apagado
	}
		
	//metodos
	void encender() {
		encendido = true;
	}
	
	void apagar() {
		
	}
	void acelerar() {
		
	}
	
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
}
