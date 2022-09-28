package ar.com.codoacodo.clase10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
	
		//cargar los dias como string y numero
		
		//crear
		Map<Integer, String> mapDias = new HashMap<>();
		
		//carga
		mapDias.put(1, "Lunes");
		mapDias.put(2, "Martes");
		mapDias.put(3, "Miercoles");
		mapDias.put(4, "Jueves");
		mapDias.put(5, "Viernes");
		mapDias.put(6, "Sabado");
		mapDias.put(7, "Domingo");
		
		//obtengo un valor dada su clave
		String diaEnString = mapDias.get(7);
		System.out.println(diaEnString);
		
		//vacio?
		boolean mapaVacio = mapDias.isEmpty();
		System.out.println(mapaVacio);
		
		//todas las claves que tiene un mapa
		Set<Integer> mapKeys =  mapDias.keySet();
		System.out.println(mapKeys);
		
		//todos los valores de un mapa
		Collection<String> mapValues = mapDias.values();
		System.out.println(mapValues);
		
		//el par clave-valor al mismo tiempo
		Set<Entry<Integer,String>> mapEntry = mapDias.entrySet();
		
		//????
		for(Entry<Integer,String> anEntry : mapEntry ) {
			Integer key = anEntry.getKey();
			String value = anEntry.getValue();
			System.out.println(key  + "- " + value);
		}
	}

}
