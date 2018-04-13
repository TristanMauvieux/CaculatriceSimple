package fr.diginamic.calculatriceSimple.classe;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Calculatrice {
	



	//private ArrayList<String> cacul;
	private float nombrePremier = 0;
	private float nombreSecond = 0;
	private String operante = "";
	private float resultat = -1;
	/**
	 * 
	 */
	public Calculatrice() {
		
	}
	
	public Calculatrice(float nombrePremier, String operation, float NombreSeconde) {
		this.nombrePremier = nombrePremier;
		this.nombreSecond = NombreSeconde;
		this.operante = operation;
		
	}

	public void saisi() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entré votre Premier nombre");
		nombrePremier = sc.nextFloat();
		boolean notOk = true;
		do {
			System.out.println("entrée votre opération");

			operante = sc.nextLine();
			if (!StringUtils.equals(operante, "")) {
				notOk = false;
			}
		}
		while(notOk );
		System.out.println("entrée votre Second nombre");
		nombreSecond = sc.nextFloat();		
		sc.close();
	}
	
	public float calcul() {
		
		if (StringUtils.equals(operante, "+")) {
			addition();
		}else if (StringUtils.equals(operante, "-")) {
			soutraction();
		}else if (StringUtils.equals(operante, "*")) {
			multiplication();
		}else if (StringUtils.equals(operante, "/")) {
			division();
		}else {
			System.out.println("Votre opération n'est pas valide");
		}
		
		return resultat;
	}
	/**
	 * idée derrière tous cela est de fragemente.
	 * saisi prend les valeurs
	 * calcul va definir le l'opération et va appellé la bonne fonction
	 * la fonction du calcul va retourné le résultat
	 * @return
	 */
	private void addition() {
		resultat = nombrePremier+nombreSecond;

	}
	
	private void soutraction() {
		resultat = nombrePremier-nombreSecond;

	}
	
	private void multiplication() {
		resultat = nombrePremier*nombreSecond;

	}
	
	private void division() {
		resultat = nombrePremier/nombreSecond;

	}
	
	
	public float getNombrePremier() {
		return nombrePremier;
	}


	public void setNombrePremier(float nombrePremier) {
		this.nombrePremier = nombrePremier;
	}


	public float getNombresecond() {
		return nombreSecond;
	}


	public void setNombresecond(float nombreSecond) {
		this.nombreSecond = nombreSecond;
	}


	public float getResultat() {
		return resultat;
	}


	public void setResultat(float resultat) {
		this.resultat = resultat;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calculatrice [nombrePremier=");
		builder.append(nombrePremier);
		builder.append(", nombreSecond=");
		builder.append(nombreSecond);
		builder.append(", operante=");
		builder.append(operante);
		builder.append(", resultat=");
		builder.append(resultat);
		builder.append("]");
		return builder.toString();
	}
	
}
