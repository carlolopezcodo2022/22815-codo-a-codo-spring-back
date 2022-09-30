package ar.com.codoacodo.clase11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepasoMap {

	public static void main(String[] args) {
		
		Map<String, Integer> mapAlumnos = new HashMap<>();
		//cargo en el mapa 
		
		mapAlumnos.put("JAVIER", 30);
		mapAlumnos.put("VANESA", 28);
		mapAlumnos.put("CARLOS", 36);
		mapAlumnos.put("JUAN", 50);
		
		//valor
		Integer edad = mapAlumnos.get("JUAN"); // > 50 
		
		//claves de un mapa
		Set<String> keys = mapAlumnos.keySet();
		
		//valores
		Collection<Integer> values = mapAlumnos.values();
		
		//recorrer
		Set<Entry<String, Integer>> entries = mapAlumnos.entrySet();
		for(Entry<String, Integer> entry : entries ) {
			System.out.println(entry.getKey() + " - " +entry.getValue());
		}
		
		
	}

}
