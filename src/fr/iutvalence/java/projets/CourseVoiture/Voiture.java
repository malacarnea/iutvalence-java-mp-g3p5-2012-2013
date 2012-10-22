package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe qui définit les caractéristique d'une voiture
 */
public class Voiture extends Position
{
	/**
	 * chaque voiture est définie par sa couleur qui ne change pas pour le moment
	 * la couleur est désignée par une constante 
	 * 
	 */
	// FIXME (FIXED) ne pas utiliser de caractère pour représenter la couleur, mais des constantes
	private final int couleur;
	
	// FIXME (Fixed) laisser la taille de côté pour le moment
	/**
	 * la taille d'une voiture est calculée par le nombre de cases qu'elle prend dans la grille.
	 * En début de jeu, toutes les voitures ont la même taille (c'est donc une variable non paramétrable
	 * par l'utilisateur).
	 * Chaque voiture (chaque joueur) a sa propre taille, 
	 */
	//private final int taille;

	/**
	 * la position de la voiture est une des caractèristique de voiture 
	 * elle est définie grâce à la classe Position
	 */
//	private Position position; 

	// FIXME (FIXED) compléter le commentaire
	/**
	 * création de voiture de Position p, Couleur c 
	 * @param x : abscisse s'obtient avec les métodes de la classe Position
	 *	@param y : ordonnée, cf x
	 * @param couleur : entier correspondant à une couleur
	 * @throws CIE 
	 */
	public Voiture(int x, int y,int c) throws CIE
	  {
	  	super(x, y);
	  	this.couleur = c;
	  	//this.taille = 1;
	  }
	
	// FIXME (FIXED) corriger le commentaire
	/**
	 * permet d'acceder à l'attribut couleur de la classe Voiture depuis l'extérieur de la classe
	 * @return couleur (un entier)
	 */
	  public int getCouleur()
	{
		return this.couleur;
	}
	 
	 // FIXME (Fixed) corriger le commentaire
	/**
	 * permet d'acceder à l'attribut Position de la classe Voiture depuis l'extérieur de la classe
	 * @return Position
	 */
//	public Position getPosition()
//	{
//		return position;
//	}
	
	// FIXME (Fixed) corriger le commentaire
	/**
	 * permet de modifier la position depuis l'extérieur
	 * @param position
	 */
//	public void setPosition(Position position)
//	{
//		this.position = position;
//	}

	// Actions effectuées par la voiture
	
	/**
	 * monte la voiture d'une case vers le haut
	 */
	public void haut()
	{
	 // la position de la voiture {x,y} <-- {x,y+1} 
	}
	
	/**
	 * descend la voiture d'une case vers le bas
	 */	
	public void bas()
	  {
		 // la position de la voiture {x,y} <-- {x,y-1} 
	  }
	
	/**
	 * décale la voiture d'une case vers la gauche
	 */
	public void gauche()
	  {
		 // la position de la voiture {x,y} <-- {x-1,y} 
	  }
	
	/**
	 * décale la voiture d'une case vers la droite
	 */
	public void droite()
	  {
		 // la position de la voiture {x,y} <-- {x+1,y} 
	  }
}
