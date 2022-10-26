package ar.com.codoacodo.rest;

import ar.com.cododoacodo.restclient.ReqresRestService;
import ar.com.cododoacodo.restclient.dto.User;
import ar.com.cododoacodo.restclient.dto.Users;
import ar.com.cododoacodo.restclient.impl.ReqRestServiceJerseyImpl;

public class MainRestClient {

	public static void main(String[] args) {
		
		//configurado en un db los servicios rest que consumen 
		//tabla
		
		ReqresRestService clientRest = new ReqRestServiceJerseyImpl("https://reqres.in");
		
		Users users = clientRest.findUsers();		
		System.out.println(users);
		
		System.out.println("-------");
		
		User u = clientRest.getUser(2);
		System.out.println(u);
	}

}
