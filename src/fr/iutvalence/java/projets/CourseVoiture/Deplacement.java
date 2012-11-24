package fr.iutvalence.java.projets.CourseVoiture;

import java.util.Random;

public enum Deplacement
{
	HAUT, BAS, GAUCHE, DROITE;

	public static Deplacement alea()
	{
		int d = new Random().nextInt(4);

		switch (d)
		{
			case 0:
				return HAUT;
			case 1:
				return BAS;
			case 2:
				return GAUCHE;
			default:
				return DROITE;

		}
	}
}