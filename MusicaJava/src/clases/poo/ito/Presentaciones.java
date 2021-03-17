package clases.poo.ito;

import java.time.LocalDate;

public class Presentaciones {

	private String musico = "";
	private LocalDate fecha = null;

	
	public Presentaciones() {		
		super();
	}
	
	public Presentaciones(String musico, LocalDate fecha) {
		super();
		this.musico = musico;
		this.fecha = fecha;
	}

	//========================================
	public String getMusico() {
		return this.musico;
	}

	//========================================
	public void setMusico(String newMusico) {
		this.musico = newMusico;
	}

	//========================================
	public LocalDate getFecha() {
		return this.fecha;
	}

	//========================================
	public void setFecha(LocalDate newFecha) {
		this.fecha = newFecha;
	}

	@Override
	public String toString() {
		return "musico=" + musico + ", fecha=" + fecha;
	}

}
