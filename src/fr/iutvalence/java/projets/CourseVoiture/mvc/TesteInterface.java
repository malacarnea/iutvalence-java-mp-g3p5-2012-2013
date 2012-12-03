package fr.iutvalence.java.projets.CourseVoiture.mvc;

import fr.iutvalence.java.projets.CourseVoiture.Circuit;
import fr.iutvalence.java.projets.CourseVoiture.Deplacement;
import fr.iutvalence.java.projets.CourseVoiture.Partie;
import fr.iutvalence.java.projets.CourseVoiture.Position;
import fr.iutvalence.java.projets.CourseVoiture.PositionInvalideException;
import fr.iutvalence.java.projets.CourseVoiture.Voiture;

public class TesteInterface
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Position pos = new Position(2,4);
		Voiture v = new Voiture(pos, 1);
		Circuit c = new Circuit (Circuit.C_FACIL);
		Partie part = new Partie(3, v, c);
		
		part.demarrer();
		

	}

}
