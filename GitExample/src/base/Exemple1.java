package base;

import avanzato.Example2;

public class Exemple1 {

	public static void main(String[] args) {
		System.out.println(metodo1());
		Example2 e2=new Example2();
		System.out.println(e2.metodo2("ciao","addio"));
		

	}
	public static String metodo1() {
		return "helloWorld";
	}

}
