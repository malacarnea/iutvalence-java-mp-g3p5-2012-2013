package fr.iutvalence.java.projets.CourseVoiture;

// FIXME écrire un commentaire
public class Voiture
{
	//couleur définie ici ???
	//taille
	
	// FIXME écrire un commentaire
	// FIXME réfléchir au type de l'attribut
	// FIXME la couleur peut-elle changer en cours de partie ?
	private char couleur;
	
	// FIXME écrire un commentaire
	// FIXME toutes les voiture ont la même taille paramètrable ?
	// FIXME la taille peut-elle changer en cours de partie ?
	private static int taille;
	
	// FIXME écrire un commentaire
	private Position position; 

  
	// FIXME écrire un commentaire
	public Voiture(Position position,char couleur)
	  {
	  	super();
	  	this.position = position;
	  	this.couleur=couleur;
	  }
	
	// FIXME écrire un commentaire
	  public char getCouleur()
	{
		return couleur;
	}
	 
	// FIXME écrire un commentaire  
	public void setCouleur(char couleur)
	{
		this.couleur = couleur;
	}

	// FIXME écrire un commentaire  
	public Position getPosition()
	{
		return position;
	}

	// FIXME écrire un commentaire  
	public void setPosition(Position position)
	{
		this.position = position;
	}

	/*actions effectuées par la voiture*/
	
	// FIXME corriger le commentaire  
	/**
	   * avance si on appuie sur la flèche du haut
	   */	
public void avancer()
  {
	  
  }

}