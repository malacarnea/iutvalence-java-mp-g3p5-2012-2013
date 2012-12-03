package fr.iutvalence.java.projets.CourseVoiture.mvc;

import fr.iutvalence.java.projets.CourseVoiture.Circuit;
import fr.iutvalence.java.projets.CourseVoiture.Position;

public interface Affiche
{
	public void AfficheCir(Circuit c);
	
	public void AffichePos(Position p);
	
	public void AfficheTours(int tour);
	
	public void AfficheBravo();

}
