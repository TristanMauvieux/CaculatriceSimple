package fr.diginamic.CalculatriceSimple.test;

import fr.diginamic.calculatriceSimple.classe.Calculatrice;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClasseCalculatrice extends TestCase {

	public static Test suite() {
		return new TestSuite(TestClasseCalculatrice.class);
	}
	
	public void testAddition() {
		Calculatrice calculatrice = new Calculatrice(35, "+", 5);
		assertTrue(calculatrice.calcul()==40);
	}
	
	public void testSoustaction() {
		Calculatrice calculatrice = new Calculatrice(60, "-", 5);
		assertTrue(calculatrice.calcul() == 55);
	}
	
	public void testSoustractionNegative() {
		Calculatrice calculatrice = new Calculatrice(6, "-", 10);
		assertTrue(calculatrice.calcul() == -4);
	}
	
	public void testAdditonNegative() {
		Calculatrice calculatrice = new Calculatrice(-6, "+", -3);
		assertTrue(calculatrice.calcul()==-9);
	}
	
	public void testMultiplication() {
		Calculatrice calculatrice = new Calculatrice(6, "*", 2);
		assertTrue(calculatrice.calcul() == 12);
	}
	
	public void testMultiplicationAVirgule() {
		Calculatrice calculatrice = new Calculatrice(6, "*", 0.5f);
		assertTrue(calculatrice.calcul()==3f);
	}
	
	public void testDivision() {
		Calculatrice calculatrice = new Calculatrice(10, "/", 5);
		assertTrue(calculatrice.calcul()== 2);
	}
	
}
