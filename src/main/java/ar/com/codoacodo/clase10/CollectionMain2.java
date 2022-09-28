package ar.com.codoacodo.clase10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionMain2 {

	public static void main(String[] args) {
		
		//crea una collection
		Collection<String> nombres = new ArrayList<>();				

		//agregar elementos
		nombres.add("carlos");
		nombres.add("carlos");
		nombres.add("vanesa");
		nombres.add("javier");

		//recorrer una collection usando un iterator
		Iterator<String> itNombre = nombres.iterator();
		
		while(itNombre.hasNext()) {
			String nombre = itNombre.next();
			if("vanesa".equals(nombre)) {
				System.out.println(nombre);
				itNombre.remove();
			}
		}
		
		System.out.println(nombres.isEmpty());
	}

}
