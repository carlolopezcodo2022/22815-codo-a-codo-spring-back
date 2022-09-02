package ar.com.codoacodo;

//los nombre de las clases la primer letra es en mayuscula
public class Auto {
	
	/*
	 atributos
	*/
	boolean encendido; //tipos de datos?//false
	float velocidadActual;//alt+shit+r// > 0 
	String marca;//null
	String modelo;//null
	int anio;//0
	float velocidadMaxima;//0
	
	//todas las clases tienen un constructor por defecto
	//contructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		this.encendido = false;//esta apagado
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	Auto(int anio,String marca,String modelo,float vm) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadActual = vm;
		
		//no son parametrizables
		this.velocidadActual = 0;
		this.encendido = false;
	}
	
	Auto(final float velocidadMaxima) {// const algo = "";
		//this// F6
		this.velocidadActual = 0; //F6
		this.velocidadMaxima = velocidadMaxima;
	}//F6
		
	//metodos
	void encender() {
		if(!encendido) {//F6
			System.out.println("se ha encendido");
			encendido = true;
		}else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		if(encendido) {
			System.out.println("apagando");
			this.encendido = false;
			
			// this.velocidadActual = 0;
			
			//extra!!!
			this.detener();
		}else {
			System.out.println("ya esta apagado");
		}
	}
	
	/*
	 * acelera de a 1
	 */
	void acelerar() {
		if(this.encendido) {
			if(this.velocidadActual < velocidadMaxima) {//F7
				System.out.println("acelerando");
				this.velocidadActual++;//F6
			}else {
				System.out.println("se quema el auto");	
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}//F6
	
	void quintaAFondo() {
		if(this.encendido) {
			while(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;//F6
			}
			System.out.println("se quema el auto");	
		}else {
			System.out.println("debe encender el auto");
		}
	}//F6
	
	void frenar() {
		//no puedo frenar < 0
//		if(this.encendido) {
			if(this.velocidadActual > 0) {		
				System.out.println("frenando");
				this.velocidadActual--;
			}else {
				System.out.println("llegaste a 0");
			}
//		}else {
//			System.out.println("auto apagado");
//		}
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}

	
	public void detener() {
		//acceder a otro metodo, desde un metodo
		while(this.velocidadActual > 0) {
			this.frenar();
		}
	}
}
