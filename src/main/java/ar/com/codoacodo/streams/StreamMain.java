package ar.com.codoacodo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		
		List<Integer> edades = List.of(15,25,30,20);
		
		//filtrar!
		List<Integer> edadesFilradas = new ArrayList<>();		
		for (Integer edad: edades) {
			if(edad > 20) {
				edadesFilradas.add(edad);
			}
		}
		
		System.out.println(edadesFilradas);
		//------------------------------------------------------
		//stream!
		List<Integer> ef = edades.stream()
			.filter(edad -> edad > 20)//operacion intemedia
			.collect(Collectors.toList());//operacion terminal
		System.out.println(ef);
		//------------------------------------------------------
		
		//filtrar!
		List<String> edadesString = new ArrayList<>();		
		for (Integer edad: edades) {
			edadesString.add("Valor " + edad);
		}
		System.out.println(edadesString);
		
		List<String> es = edades.stream()
			.map(edad -> "Valor " + edad)
			.collect(Collectors.toList());
		System.out.println(es);
	}

}
