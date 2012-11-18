package fr.iutvalence.java.projets.CourseVoiture;

/**
 * Position définie par un couple de coordonnees (x,y)
 */
public class Position
{
	
	public final static int XINIT=5;
	
	public final static int YINIT=3;
	/**
	 * Abscisse
	 */
	private int x;

	/**
	 * Ordonnée
	 */
	private int y;
	
	/**
	 * construction d'une position initiale
	 */
	public Position ()
	{
		this.x=XINIT;
		this.y=YINIT;
	}

	/**
	 * crée un objet d'abscisse et d'ordonnée fixées
	 * @param x0
	 * @param y0 
	 */
	public Position(int x0, int y0) 
	{
		
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

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Votre position actuelle est : (" + this.x+ ", "+ this.y+")";
	}
	
	
	// FIXME compléter le commentaire (dire en quoi 2 positions sont égales)
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
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
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode ()
	{
		return this.x+this.y;
	}
	
	// Position translate(int dx, int dy){...}
}
