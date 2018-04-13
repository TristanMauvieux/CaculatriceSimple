package fr.diginamic.calculatriceSimple;

import fr.diginamic.calculatriceSimple.classe.Calculatrice;

public class Main {
	
	public static void main(String[] args) {
		
		Calculatrice calculatrice = new Calculatrice();
		
		calculatrice.saisi();
		calculatrice.calcul();
		System.out.println(calculatrice.toString());
		
	}

}
