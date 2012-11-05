package fr.iutvalence.java.projets.CourseVoiture;

// FIXME (fixed) corriger le commentaire
/**
 * classe informant sur la postion de la voiture sur le circuit
 * donne l'abscisse x et l'ordonnée y
 */
public class Position
{
	
	
	/**
	 * x est la position de la voiture en abscisse (le numéro de la colonne)
	 */
	private int x;

	/**
	 * y est la position de la voiture en ordonnée (le numéro de la ligne)
	 */
	private int y;

	// FIXME (fixed) corriger le commentaire
	/**
	 * crée un objet Position prenant en paramètre l'abscisse et l'ordonnée
	 * retourne une exception si x0 ou y0 ne sont pas dans les bornes
	 * @param x0
	 * @param y0 
	 */
	public Position(int x0, int y0) throws CIE
	{
		if ((x0<Circuit.MIN) || (y0<Circuit.MIN)|| (x0>Circuit.MAX) || (y0>Circuit.MAX))
			throw new CIE();
		this.x = x0;
		this.y = y0;
	}

	/**
	 * méthode qui permet de retourner le numéro de la colonne
	 * @return abscisse
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * méthode qui permet de retourner le numéro de la ligne
	 * @return ordonnée
	 */
	public int getY()
	{
		return this.y;
	}
	
	
	
	/**
	 * permet de modifier l'abscisse d'une position
	 * @param x0
	 */
	public void setX(int x0)
	{
		this.x = x0;
	}

	/**
	 * permet de modifier l'ordonnée d'une position
	 * @param y0
	 */
	public void setY(int y0)
	{
		this.y = y0;
	}

	// FIXME (FIXED) redéfinir toString
	/**
	 * affiche la position de la Voiture
	 */
	public String toString()
	{
		return "Votre position actuelle est : (" + this.x+ ", "+ this.y+")";
	}
	
	// FIXME (fixed) redéfinir equals et hashCode
	/**
	 * compare 2 positions 
	 */
	public boolean equals (Object o)
	{
		if (o == null) return false;
		if (o == this) return true;
		if (!(o instanceof Position)) return false;
		Position p = (Position) o;
		return (this.x == p.x)&&(this.y == p.y);
	}
	
	/**
	 * ???
	 */
	public int hashCode ()
	{
		return this.x+this.y;
	}
	
	
	
	
	// Position translate(int dx, int dy){...}
}
