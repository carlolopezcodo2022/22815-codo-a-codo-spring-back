package ar.com.codoacodo.clase13.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.DBUtil;

public class MainCollections {

	public static void main(String[] args) {
		/*
		Collection
		Set
		List
		Map
		 */
		
		//existe var en java!!!
		//no es el var de js / 
		
		var col = new TreeSet<String>();//10/11
		
		//col = new TreeSet<String>();
		
		col.add("H");
		col.add("A");
		col.add("B");
		
		System.out.println(col);
		
		var col2 = new TreeSet<Integer>();//10/11
		
		//col = new TreeSet<String>();
		
		col2.add(9);
		col2.add(5);
		col2.add(4);
		
		System.out.println(col2);
		
		//los wrapper (Integer/Long/Double etc etc)
		//si quiero cambiar el orden natural de mis clases
		Comparator<Articulo> cmpArtXTitulo = new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
				return o2.getTitulo().compareTo(o1.getTitulo());
			}
		};
		
		var articulos = new ArrayList<Articulo>();
		
		DBUtil db = new DBUtil();
		
		articulos.addAll(List.of(db.obtenerResultado("")));
		
		//ordenar
		Collections.sort(articulos,cmpArtXTitulo);
		
		for(Articulo art : articulos)  {
			System.out.println(art.getTitulo() + " - " + art.getPrecio() + "- " + art.getCantidadVendido());
		}
	}

}
