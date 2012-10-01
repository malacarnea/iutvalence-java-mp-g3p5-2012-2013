package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe qui définie les caractéristique d'une voiture
 */
public class Voiture
{

	// FIXME r�fl�chir au type de l'attribut
	// FIXME la couleur peut-elle changer en cours de partie ?
	/**
	 * chaque voiture est définie par sa couleur
	 * elle peut être modifiée en cours de partie, entre chaque course
	 */
	private char couleur;
	
	// FIXME toutes les voiture ont la m�me taille param�trable ?
	// FIXME la taille peut-elle changer en cours de partie ?
	/**
	 * la taille d'une voiture est calculée par le nombre de cases qu'elle prend dans la grille.
	 * En début de jeu, toutes les voitures ont la même taille (c'est donc une variable non paramétrable
	 * par l'utilisateur).
	 * Chaque voiture (chaque joueur) a sa propre taille, elle n'est pas la même tout le temps
	 * elle peut évoluer pendant le jeu (si elle rétrécie ou grossie).
	 */
	private int taille;

	/**
	 * la position de la voiture est une des caractèristique de voiture 
	 * elle est définie grâce à la classe Position
	 */
	private Position position; 

  
	// FIXME �crire un commentaire
	/**
	 * 
	 * @param position
	 * @param couleur
	 */
	public Voiture(Position position,char couleur, int taille)
	  {
	  	super();
	  	this.position = position;
	  	this.couleur = couleur;
	  	this.taille = taille;
	  }
	
	// FIXME �crire un commentaire
	/**
	 * retourne la couleur de la voiture (un de ces paramètres)
	 * @return
	 */
	  public char getCouleur()
	{
		return couleur;
	}
	 
	// FIXME �crire un commentaire  
	  /**
	   * 
	   * @param couleur
	   */
	public void setCouleur(char couleur)
	{
		this.couleur = couleur;
	}

	// FIXME �crire un commentaire  
	/**
	 * 
	 * @return
	 */
	public Position getPosition()
	{
		return position;
	}

	// FIXME �crire un commentaire  
	/**
	 * 
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
