package ar.com.codoacodo.herencia;

public class Articulo {

	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
