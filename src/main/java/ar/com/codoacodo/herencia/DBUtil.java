package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;
import ar.com.codoacodo.herencia.clase6.Pelicula;

public class DBUtil {

	public Articulo[] obtenerResultado(String claveBusqueda) {
		
		//
		Libro l1 = new Libro("http://sitio.com.ar/img/img1.jpg","tituloz" + claveBusqueda,"AUTOR l1",4390);
		l1.setIsbn("9789876378253");
		l1.setNroPaginas(72);
		l1.setCantidadVendido(150);
		
		Libro l2 = new Libro("http://sitio.com.ar/img/img1.jpg","titulob" + claveBusqueda,"AUTOR l2",4390,72,"9789876378253");
		l2.setCantidadVendido(175);
		
		Musica m1 = new Musica("http://sitio.com.ar/img/img2.jpg","titulox" + claveBusqueda,"AUTOR2 m1",70500,"SONY MUSIC",new String[] {});
		m1.setCantidadVendido(250);
		
		Musica m2 = new Musica("http://sitio.com.ar/img/img2.jpg","tituloy" + claveBusqueda,"AUTOR2 m2",50500);
		m2.setSello("WARNER");
		m2.setCantidadVendido(500);
				
		Pelicula p1 = new Pelicula("http://sitio.com.ar/img/img3.jpg","tituloa" + claveBusqueda,"AUTOR p1",3040,"20TH CENTURY FOX","BLU-RAY");
		p1.setCantidadVendido(15);
		
		Pelicula p2 = new Pelicula("http://sitio.com.ar/img/img3.jpg","tituloc" + claveBusqueda,"AUTOR p2",4040);
		p2.setFormato("BLUE RAY 3D");
		p2.setCantidadVendido(360);
		
		Articulo a = new Articulo("/img/img1.jpg","tituloabc" + claveBusqueda,"AUTOR ARTICULO ",1390);
		a.setCantidadVendido(560);
		
		return new Articulo[] {l1,l2,m1,m2,p1,p2,a};
	}
}
