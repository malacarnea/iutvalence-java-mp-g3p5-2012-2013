package fr.iutvalence.java.projets.CourseVoiture.mvc;

import fr.iutvalence.java.projets.CourseVoiture.Circuit;
import fr.iutvalence.java.projets.CourseVoiture.Position;

public class AfficheConsole  implements Affiche
{
	


	public void AfficheCir(Circuit c)
	{
			System.out.println(c);
	}
	
	public void AffichePos(Position p)
	{
		System.out.println(p);
	}
	
	public void AfficheTours(int tour)
	{
		System.out.println("tour courant " + tour);
	}
	
	public void AfficheBravo()
	{
		System.out.println("Bravo !!!!!!!!");
	}
}
