package ar.com.codoacodo.rest;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.cododoacodo.restclient.ReqresRestService;
import ar.com.cododoacodo.restclient.dto.Data;
import ar.com.cododoacodo.restclient.dto.Users;
import ar.com.cododoacodo.restclient.impl.ReqRestServiceJerseyImpl;

public class MainRestClient2 {

	public static void main(String[] args) {
		
		//configurado en un db los servicios rest que consumen 
		//tabla
		
		ReqresRestService clientRest = new ReqRestServiceJerseyImpl("https://reqres.in");
		
		Users users = clientRest.findUsers();		
		
		//filtrar los nombres que tienen "on"
		List<Data> tieneOnEnLastName = users.data.stream()
			.filter(u -> u.lastName.contains("on"))
			.collect(Collectors.toList());
		
		System.out.println(tieneOnEnLastName);
		
		//solo quiero el id
		List<Integer> ids = users.data.stream()
			.map(u -> u.id)
			.collect(Collectors.toList());
		System.out.println(ids);
		
		//-------------------------------------
		//email1,email2,email3,....
		String emails = users.data.stream()
			.map(x->x.email)
			.reduce("", (a,b) -> a + "," + b);
			
		System.out.println(emails);
		//-------------------------------------
		List<Integer> aux = List.of(10,20);
		Integer suma = aux.stream()
				.reduce(0, (a,b) -> a+b);
		System.out.println(suma);
				
		System.out.println(users.data);
		System.out.println("-------------------");
		
		//ordenar
		List<Data> sported = users.data.stream()
			.sorted(Comparator.comparingInt(Data::getId).reversed())
			.collect(Collectors.toList());
		
		Long m6 =users.data.stream()
			.filter(u->u.getId() > 5)
			.count();
		System.out.println(m6);
		
		
		System.out.println(sported);
	}

}
