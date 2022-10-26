package ar.com.codoacodo.rest;

import ar.com.cododoacodo.restclient.ReqresRestService;
import ar.com.cododoacodo.restclient.dto.User;
import ar.com.cododoacodo.restclient.dto.Users;

public class ReqRestServiceDummyImpl implements ReqresRestService {

	@Override
	public Users findUsers() {
		return new Users();
	}

	@Override
	public Users findUsers(Integer page) {
		return new Users();
	}

	@Override
	public User getUser(Integer userId) {
		return new User();
	}

}
