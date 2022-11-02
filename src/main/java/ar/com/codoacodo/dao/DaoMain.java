package ar.com.codoacodo.dao;

import java.util.Collection;

public class DaoMain {

	public static void main(String[] args) {

		//quiero datos de la tabla socios
		//abstracta vs interface
		SocioRepository s = new SocioRepositoryImpl();		
		Collection<Socio> list = s.findAll();
		Socio socio = s.findById(1L);
		
		OrdenRepository o = new OrdenRepositoryImpl();
		Collection<Orden> ordenes = o.findAll();
		Orden orden = o.findById(1L);
		
		CategoriaRepository cri = new CategoriaRepositoryImpl();
		cri.findAll();
		cri.findById(2l);
	
	}

}
