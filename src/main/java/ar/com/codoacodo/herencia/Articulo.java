package ar.com.codoacodo.herencia;

import java.util.Date;

public class Articulo implements Comparable<Articulo>{

	protected String img;
	private String titulo;
	private String autor;
	private Float precio;
	private Date fechaPublicacion; //usar para ordenar
	private int cantidadVendido; //usar para ordenar
	
	//alt+shit+s
	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {//img es null
		if(img != null)
			this.img = img;
		else 
			this.img = "MARCA DE AGUA";
	}

	public String getTitulo() {
		return titulo!=null ? titulo.toUpperCase() : titulo; 
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getCantidadVendido() {
		return cantidadVendido;
	}

	public void setCantidadVendido(int cantidadVendido) {
		this.cantidadVendido = cantidadVendido;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	//<0 asc
	//>0
	//=0
	public int compareTo(Articulo o) {
		//precio
		int cmp = this.getPrecio().compareTo(o.getPrecio());
		
		//cantidad de vendidos
		if(cmp == 0) {
			cmp = o.getCantidadVendido() - this.getCantidadVendido();
		}
		
		return cmp;
	}
}
