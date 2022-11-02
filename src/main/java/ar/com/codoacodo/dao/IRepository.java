package ar.com.codoacodo.dao;

import java.util.Collection;

public interface IRepository<T> {
	public Collection<T> findAll();
	//los demas!!!
	public T findById(Long id);
}
