package ar.com.codoacodo.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseRepository<T> implements IRepository<T>{

	private Class<T> clazz;
	protected String tabla;
	
	public BaseRepository(String tabla) {
		this.tabla = tabla;
//		this.clazz = clazz;
		this.clazz = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public Collection<T> findAll() throws RuntimeException{
		
		String sql = "select * from " + this.getTabla();
		
		System.out.println("ejecutando sql: " + sql);
		
		//Clase.select(sql)
		
		Collection<T> entitys =new ArrayList<>();
		
		return entitys;
	}
	
	public T findById(Long id) {
		
		String sql = "select * from "+  this.getTabla() +" where id=" +id;  
		
		System.out.println("Ejecutando sql: " + sql);
				
		return null;
	}

	private Class<T> getClazz() {
		return clazz;
	}

	private String getTabla() {
		return tabla;
	}
}
