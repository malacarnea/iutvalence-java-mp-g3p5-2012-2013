package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe qui définit les caractéristique d'une voiture
 */
public class Voiture
{
	/**
	 * chaque voiture est définie par sa couleur qui ne change pas pour le moment
	 * la couleur est désignée par un char : R=rouge, V=vert...
	 */
	// FIXME ne pas utiliser de caractère pour représenter la couleur, mais des constantes
	private final char couleur;
	
	// FIXME laisser la taille de côté pour le moment
	/**
	 * la taille d'une voiture est calculée par le nombre de cases qu'elle prend dans la grille.
	 * En début de jeu, toutes les voitures ont la même taille (c'est donc une variable non paramétrable
	 * par l'utilisateur).
	 * Chaque voiture (chaque joueur) a sa propre taille, 
	 */
	private final int taille;

	/**
	 * la position de la voiture est une des caractèristique de voiture 
	 * elle est définie grâce à la classe Position
	 */
	private Position position; 

	// FIXME compléter le commentaire
	/**
	 * constructeur de Voiture
	 * @param position
	 * @param couleur
	 * @param taille
	 * création de voiture de Position p, Couleur c et taille 1
	 */
	public Voiture(Position p,char c)
	  {
	  	super();
	  	this.position = p;
	  	this.couleur = c;
	  	this.taille = 1;
	  }
	
	// FIXME corriger le commentaire
	/**
	 * permet de "lire" la couleur de la voiture (un de ces paramètres)
	 * @return couleure
	 */
	  public char getCouleur()
	{
		return couleur;
	}
	 
	 // FIXME corriger le commentaire
	/**
	 * permet d'obtenir la position depuis l'extérieur
	 * @return Position
	 */
	public Position getPosition()
	{
		return position;
	}
	
	// FIXME corriger le commentaire
	/**
	 * permet de modifier la position depuis l'extérieur
	 * @param position
	 */
	public void setPosition(Position position)
	{
		this.position = position;
	}

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
