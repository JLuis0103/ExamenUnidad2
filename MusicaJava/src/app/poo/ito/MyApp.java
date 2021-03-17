package app.poo.ito;

import java.time.LocalDate;

import clases.poo.ito.InstrumentoMusical;
import clases.poo.ito.Presentaciones;

public class MyApp {
	
	static void run() {
		InstrumentoMusical i1=new InstrumentoMusical("Guitarra", "Cuerdas", 6);
		System.out.println(i1);
		
		Presentaciones p1=new Presentaciones("Ayasa", LocalDate.of(2019, 1, 24));
		Presentaciones p2=new Presentaciones("Imagine Dragons", LocalDate.of(2015, 6, 18));
		Presentaciones p3=new Presentaciones("Halsey", LocalDate.of(2020, 11, 15));
		
		i1.addUsosxMusicos(p1);
		i1.addUsosxMusicos(p2);
		i1.addUsosxMusicos(p3);
		System.out.println(i1);
	}

	public static void main(String[] args) {
		run();
	}

}
