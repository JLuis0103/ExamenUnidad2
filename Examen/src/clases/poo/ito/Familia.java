package clases.poo.ito;

import java.util.HashSet;

public class Familia {

	private String padre;
	private String madre;
	private HashSet<String> hijos= new HashSet<String>();
	private static int numeroFamilias=0;
	
	public Familia(String padre, String madre) {
		super();
		this.padre = padre;
		this.madre = madre;
		numeroFamilias++;
	}
	
	
	//=========================================
	
	public String getPadre() {
		return padre;
	}
	
	public void setPadre(String padre) {
		this.padre = padre;
	}
	
	public String getMadre() {
		return madre;
	}
	
	public void setMadre(String madre) {
		this.madre = madre;
	}
	
	public HashSet<String> getHijos() {
		return hijos;
	}
	
	public void addHijos(String Hijos) {
		this.hijos.add(Hijos);
	}

	public static int getnumeroFamilias() {
		return numeroFamilias;
	}
	
	
	//=========================================

	@Override
	public String toString() {
		return "Familia [padre=" + padre + ", madre=" + madre + ", hijos=" + hijos + "]";
	}
	

}
