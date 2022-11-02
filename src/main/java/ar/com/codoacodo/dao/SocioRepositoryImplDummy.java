package ar.com.codoacodo.dao;

import java.util.Collection;
import java.util.List;

public class SocioRepositoryImplDummy implements SocioRepository{

	@Override
	public Collection<Socio> findAll() {
		System.out.println("creando al vuelo una lista");
		return List.of(new Socio());
	}

	@Override
	public Socio findById(Long id) {
		System.out.println("creando al vuelo un socio");
		return new Socio();
	}


}
