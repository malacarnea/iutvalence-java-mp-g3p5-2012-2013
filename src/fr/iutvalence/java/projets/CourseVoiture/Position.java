package fr.iutvalence.java.projets.CourseVoiture;

// FIXME (fixed) corriger le commentaire
/**
 * classe informant sur la postion de la voiture sur le circuit
 * donne l'abscisse x et l'ordonnée y
 */
public class Position
{
	/**
	 * constante donnant la borne inferieur, est la même pour x et y (le circuit étant carré)
	 */
		public final static int MIN= 0;
	/**
	 * constante donnant la borne supérieur, est la même pour x et y
	 */
	public final static int MAX= 17;
	
	/**
	 * x est la position de la voiture en abscisse (le numéro de la colonne)
	 */
	private final int x;

	/**
	 * y est la position de la voiture en ordonnée (le numéro de la ligne)
	 */
	private final int y;

	// FIXME (fixed) corriger le commentaire
	/**
	 * crée un objet Position prenant en paramètre l'abscisse et l'ordonnée
	 * retourne une exception si x0 ou y0 ne sont pas dans les bornes
	 * @param x0
	 * @param y0 
	 */
	public Position(int x0, int y0) throws CIE
	{
		if ((x0<MIN) || (y0<MIN)|| (x0>MAX) || (y0>MAX))
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
	
	
	
	// Position translate(int dx, int dy){...}
	
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
	
}
