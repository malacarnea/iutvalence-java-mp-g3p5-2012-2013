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

	// FIXME (fixed) commentaire
	/**
	 * donne la position (x, y) de la voiture 
	 */
	private Position position;

	// FIXME (fixed)compléter le commentaire
	/**
	 * création de voiture de couleur et de position données
	 * @param position : coordonnées de la voiture
	 * @param couleur
	 *            : entier correspondant à une couleur
	 */
	public Voiture(Position p, int c)
	{
		this.position = p;
		this.couleur = c;

	}

	// FIXME(fixed) corriger le commentaire (à discuter)
	/**
	 * permet d'obtenir la couleur de la voiture
	 * 
	 * @return couleur de la voiture
	 */
	public int getCouleur()
	{
		return this.couleur;
	}

	/**
	 * récupère la position d'une voiture
	 * @return  position de la voiture
	 */
	public Position getPosition()
	{
		return position;
	}

	/**
	 * monte la voiture d'une case vers le haut
	 */
	public void haut(Position p)
	{
		// la position de la voiture {x,y} <-- {x,y-1}
		int i;
		i = p.getY();
		p.setY(i - 1);
	}

	/**
	 * descend la voiture d'une case vers le bas
	 */
	public void bas(Position p)
	{
		// la position de la voiture {x,y} <-- {x,y+1}
		int i;
		i = p.getY();
		p.setY(i + 1);
	}

	/**
	 * décale la voiture d'une case vers la gauche
	 */
	public void gauche(Position p)
	{
		// la position de la voiture {x,y} <-- {x-1,y}
		int i;
		i = p.getX();
		p.setX(i - 1);
	}

	/**
	 * décale la voiture d'une case vers la droite
	 */
	public void droite(Position p)
	{
		// la position de la voiture {x,y} <-- {x+1,y}
		int i;
		i = p.getX();
		p.setX(i + 1);
	}

	/**
	 * affiche la position et la couleur de la voiture
	 */
	public String toString()
	{
		return "position voiture : (" + this.position.getX() + "," + this.position.getY() + ") couleur " + this.couleur;
	}

}
