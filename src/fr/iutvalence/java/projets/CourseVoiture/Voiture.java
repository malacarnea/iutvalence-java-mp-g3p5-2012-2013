package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe qui définit les caractéristique d'une voiture
 */
public class Voiture
{

	/**
	 * chaque voiture est définie par sa couleur qui ne change pas pour le moment la couleur est désignée par une
	 * constante
	 * 
	 */
	private final int couleur;

	/**
	 * Position (x, y) de la voiture
	 */
	private Position position;

	/**
	 * création d'une voiture de couleur et de position données
	 * 
	 * @param position
	 *            coordonnées de la voiture
	 * @param couleur
	 *            entier correspondant à une couleur
	 */
	public Voiture(Position p, int c)
	{
		this.position = p;
		this.couleur = c;
	}

	/**
	 * permet d'obtenir la couleur de la voiture
	 * 
	 * @return la couleur de la voiture
	 */
	public int getCouleur()
	{
		return this.couleur;
	}

	/**
	 * récupère la position d'une voiture
	 * 
	 * @return position de la voiture
	 */
	public Position getPosition()
	{
		return position;
	}
	
	

	/**
	 * modifie la position courante
	 * @param position : nouvelle position
	 */
	public void setPosition(Position position)
	{
		this.position = position;
	}





	/**
	 * affiche la position et la couleur de la voiture
	 */
	public String toString()
	{
		return "position voiture : (" + this.position.getX() + "," + this.position.getY() + ") couleur " + this.couleur;
	}

}
