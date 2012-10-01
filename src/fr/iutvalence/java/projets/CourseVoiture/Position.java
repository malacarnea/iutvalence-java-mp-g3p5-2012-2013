package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe informant sur la postion de la voiture sur le circuit
 */
public class Position
{
	/**
	 * x est la position de la voiture en abscisse (le numéro de la colonne)
	 */
	private final int x;

	/**
	 * y est la position de la voiture en ordonnée (le numéro de la ligne)
	 */
	private final int y;

	/**
	 * instanciation de x et de y
	 * @param x
	 * @param y
	 */
	public Position(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * méthode qui permet de retourner le numéro de la colonne
	 * @return
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * méthode qui permet de retourner le numéro de la ligne
	 * @return
	 */
	public int getY()
	{
		return y;
	}
	
	// Position translate(int dx, int dy){...}
	
	
}
