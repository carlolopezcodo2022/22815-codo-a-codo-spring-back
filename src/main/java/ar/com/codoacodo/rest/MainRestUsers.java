package ar.com.codoacodo.rest;

import ar.com.codoacodo.web.jerseyclient.Users;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainRestUsers {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users?page=2
		WebTarget webTarget = client.target("https://reqres.in")
				.path("/api/users")//los parametros que van despues /
				.queryParam("page=2");//los parametros que van luego de ?clave=valor&clave2=valor...
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get
		Response response = invocation.get();
		
		//read
		Users user = response.readEntity(Users.class);
		
		System.out.println(user);
	}

}
