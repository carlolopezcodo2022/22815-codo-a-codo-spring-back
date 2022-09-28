package ar.com.codoacodo.clase10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMain {

	public static void main(String[] args) {
		//interface i = new clasequeimplementalainterface();
		
		//crea una collection
		Collection<String> nombres = new ArrayList<>();				

		//agregar elementos
		nombres.add("carlos");
		nombres.add("carlos");
		nombres.add("vanesa");
		nombres.add("javier");
		
		//tamaño de la collection
		int size = nombres.size();
		System.out.println(size);
		
		//vacia??
		//nombres.size() == 0
		boolean isEmpty = nombres.isEmpty();
		System.out.println(isEmpty);
		
		//filtrar antes de recorrer ?????
		nombres = new HashSet<>(nombres);
		
		//recorrer la collection
		for(String unDatoDentroDeLaCollection : nombres ) {
			System.out.println(unDatoDentroDeLaCollection);
		}
	}

}
