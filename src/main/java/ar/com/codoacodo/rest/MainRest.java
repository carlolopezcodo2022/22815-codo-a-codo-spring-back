package ar.com.codoacodo.rest;

import ar.com.codoacodo.web.jerseyclient.User;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainRest {

	public static void main(String[] args) {

		/*
		 * https://reqres.in/api/users/2
		 * {
			    "data": {
			        "id": 2,
			        "email": "janet.weaver@reqres.in",
			        "first_name": "Janet",
			        "last_name": "Weaver",
			        "avatar": "https://reqres.in/img/faces/2-image.jpg"
			    },
			    "support": {
			        "url": "https://reqres.in/#support-heading",
			        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
			    }
			}
		*/
		
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users/2
		WebTarget webTarget = client.target("https://reqres.in").path("/api/users/2");
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get
		Response response = invocation.get();
		
		//read
		User user = response.readEntity(User.class);
		
		System.out.println(user);
	}

}
