package fr.iutvalence.java.projets.CourseVoiture;

// FIXME �crire un commentaire
public class Voiture
{
	//couleur d�finie ici ???
	//taille
	
	// FIXME �crire un commentaire
	// FIXME r�fl�chir au type de l'attribut
	// FIXME la couleur peut-elle changer en cours de partie ?
	private char couleur;
	
	// FIXME �crire un commentaire
	// FIXME toutes les voiture ont la m�me taille param�trable ?
	// FIXME la taille peut-elle changer en cours de partie ?
	private static int taille;
	
	// FIXME �crire un commentaire
	private Position position; 

  
	// FIXME �crire un commentaire
	public Voiture(Position position,char couleur)
	  {
	  	super();
	  	this.position = position;
	  	this.couleur=couleur;
	  }
	
	// FIXME �crire un commentaire
	  public char getCouleur()
	{
		return couleur;
	}
	 
	// FIXME �crire un commentaire  
	public void setCouleur(char couleur)
	{
		this.couleur = couleur;
	}

	// FIXME �crire un commentaire  
	public Position getPosition()
	{
		return position;
	}

	// FIXME �crire un commentaire  
	public void setPosition(Position position)
	{
		this.position = position;
	}

	/*actions effectu�es par la voiture*/
	
	// FIXME corriger le commentaire  
	/**
	   * avance si on appuie sur la fl�che du haut
	   */	
public void avancer()
  {
	  
  }

