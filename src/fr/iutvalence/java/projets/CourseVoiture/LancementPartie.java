package fr.iutvalence.java.projets.CourseVoiture;

public class LancementPartie
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
		System.out.println("teste1");
		part.demarrer();
		System.out.println("teste");

	}

}
