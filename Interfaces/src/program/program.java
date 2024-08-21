package program;

import entity.UnoQuadrado;

public class program {
	 public static void main(String args[]) {
		 UnoQuadrado uno = new UnoQuadrado();
		 uno.ligar();
		 uno.buzinar();
		 uno.setCor("cinza");
		 uno.setAno("2001");
		 
		 System.out.println(uno);
	 }
	
	
}
