
package fr.iutvalence.java.projets.CourseVoiture.tests;

import fr.iutvalence.java.projets.CourseVoiture.Circuit;
import fr.iutvalence.java.projets.CourseVoiture.Position;
import fr.iutvalence.java.projets.CourseVoiture.PositionInvalideException;
import fr.iutvalence.java.projets.CourseVoiture.Voiture;

public class Test {

	/**
	 * @param args
	 * @throws PositionInvalideException 
	 */
	
	public static void main(String[] args) 
	{
		String str;
		Position p=new Position(5, 10);
		int n=2;
		Voiture v = new Voiture(p,n);
		
		str=v.toString();
		System.out.println(str);
		
		String str1;
		System.out.println("teste");
		Circuit cir=new Circuit(Circuit.C_FACIL);
		str1=cir.toString();
		System.out.println(str1);
		
		
	}

}
