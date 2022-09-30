package ar.com.codoacodo.clase11;

public class Turno {

	private Long id;
	private String sector;//caja/oficial
	public Turno(Long id, String sector) {
		super();
		this.id = id;
		this.sector = sector;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
}
