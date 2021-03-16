package app.poo.ito;
import clases.poo.ito.Familia;

public class MyApp {
	
	static void run(){
		System.out.println(Familia.getnumeroFamilias());
		Familia f1=new Familia("Cilantro", "Perejil");
		System.out.println(f1);
		System.out.println(Familia.getnumeroFamilias());
		
		f1.addHijos("Tomillo");
		System.out.println(f1);
		System.out.println(Familia.getnumeroFamilias());
		
		Familia f2=new Familia("Pera", "Manzana");
		System.out.println(f2);
		System.out.println(Familia.getnumeroFamilias());
		
		f2.addHijos("Fresa");
		System.out.println(f2);
	}

	public static void main(String[] args) {
		run();
	}

}
