package clases.poo.ito;

import java.util.ArrayList;

public class InstrumentoMusical {

	private String nombre = "";
	private String tipo = "";
	private int antiguedad = 0;
	private ArrayList<Presentaciones> usosxMusicos = new ArrayList<Presentaciones>();

	public InstrumentoMusical() {
		super();
	}
	
	public InstrumentoMusical(String nombre, String tipo, int antiguedad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.antiguedad = antiguedad;
	}

	//========================================
	public String getNombre() {
		return this.nombre;
	}

	//========================================
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	//========================================
	public String getTipo() {
		return this.tipo;
	}

	//========================================
	public void setTipo(String newTipo) {
		this.tipo = newTipo;
	}

	//========================================
	public int getAntiguedad() {
		return this.antiguedad;
	}

	//========================================
	public void setAntiguedad(int newAntiguedad) {
		this.antiguedad = newAntiguedad;
	}

	//========================================
	public ArrayList<Presentaciones> getUsosxMusicos() {
		return this.usosxMusicos;
	}
	
	//========================================
	public void addUsosxMusicos(Presentaciones usosxMusicos) {
		this.usosxMusicos.add(usosxMusicos);
	}

	@Override
	public String toString() {
		return "InstrumentoMusical [nombre=" + nombre + ", tipo=" + tipo + ", antiguedad=" + antiguedad
				+ ", usosxMusicos=" + usosxMusicos + "]";
	}

}
