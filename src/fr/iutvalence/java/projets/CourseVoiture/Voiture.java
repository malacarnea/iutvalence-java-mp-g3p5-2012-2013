package fr.iutvalence.java.projets.CourseVoiture;

public class Voiture
{
	//couleur définie ici ???
	//taille
	
	private char couleur;
	private static int taille;
	private Position position; 

  
	public Voiture(Position position,char couleur)
	  {
	  	super();
	  	this.position = position;
	  	this.couleur=couleur;
	  }
	
	
	  public char getCouleur()
	{
		return couleur;
	}


	public void setCouleur(char couleur)
	{
		this.couleur = couleur;
	}


	public Position getPosition()
	{
		return position;
	}


	public void setPosition(Position position)
	{
		this.position = position;
	}

	/*actions effectuées par la voiture*/
	/**
	   * avance si on appuie sur la fléche du haut
	   */	
public void avancer()
  {
	  
  }

