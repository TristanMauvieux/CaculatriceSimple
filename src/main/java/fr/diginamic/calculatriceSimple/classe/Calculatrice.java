package fr.diginamic.calculatriceSimple.classe;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculatrice {
	
	//private ArrayList<String> cacul;
	private float nombrePremier = 0;
	private float nombresecond = 0;
	private String operante = "";
	private float resultat = -1;
	
	
	public Calculatrice() {
		
	}

	public void saisi() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entr� votre Premier nombre");
		nombrePremier = sc.nextFloat();
		System.out.println("entr�e votre op�ration");
		operante = sc.nextLine();
		System.out.println("entr�e votre Second nombre");
		nombresecond = sc.nextFloat();		
	}
	
	public float calcul() {
		
		return resultat;
	}
	/**
	 * id�e derri�re tous cela est de fragemente.
	 * saisi prend les valeurs
	 * calcul va definir le l'op�ration et va appell� la bonne fonction
	 * la fonction du calcul va retourn� le r�sultat
	 * @return
	 */
	public float addition() {
		return resultat;

	}
	
	public float soutraction() {
		return resultat;

	}
	
	public float multiplication() {
		return resultat;

	}
	
	public float division() {
		return resultat;

	}
	
	
	public float getNombrePremier() {
		return nombrePremier;
	}


	public void setNombrePremier(float nombrePremier) {
		this.nombrePremier = nombrePremier;
	}


	public float getNombresecond() {
		return nombresecond;
	}


	public void setNombresecond(float nombresecond) {
		this.nombresecond = nombresecond;
	}


	public float getResultat() {
		return resultat;
	}


	public void setResultat(float resultat) {
		this.resultat = resultat;
	}
	
	
}
