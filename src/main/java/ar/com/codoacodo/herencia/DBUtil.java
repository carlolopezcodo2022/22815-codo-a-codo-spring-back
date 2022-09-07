package ar.com.codoacodo.herencia;

public class DBUtil {

	/*
	 * 
	 */
	Articulo[] obtenerResultado(String claveBusqueda) {
		
		Articulo primero = new Articulo("http://sitio.com.ar/img/img1.jpg","tiulo" + claveBusqueda,"AUTOR1",4390);
		Articulo segundo = new Articulo("http://sitio.com.ar/img/img2.jpg","tiulo" + claveBusqueda,"AUTOR2",40500);
		Articulo tercero = new Articulo("http://sitio.com.ar/img/img3.jpg","tiulo" + claveBusqueda,"AUTOR3",2040);
		
		//crear un vector/array/arreglo!
		//inician en la posicion 0
		/*Articulo[] resultados = new Articulo[3];//vector vacio
		resultados[0] = primero;
		resultados[1] = segundo;
		resultados[2] = tercero;*/
		
		//Articulo[] res = new Articulo[] {primero,segundo,tercero};//vector los tres datos cargados
		
		//return primero;
		
		return new Articulo[] {primero,segundo,tercero};
	}
}
