package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe qui définit les caractéristique d'une voiture
 */
public class Voiture 
{
	/**
	 * chaque voiture est définie par sa couleur qui ne change pas pour le moment
	 * la couleur est désignée par une constante 
	 * 
	 */
	// FIXME (FIXED) ne pas utiliser de caractère pour représenter la couleur, mais des constantes
	private final int couleur;
	
	private Position pos;
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
	public Voiture(Position p,int c) throws CIE
	  {
	  	this.pos=p;
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
	 


	// Actions effectuées par la voiture
	
	  public Position getPos()
	{
		return pos;
	}

	/**
		 * monte la voiture d'une case vers le haut
		 */
		public void haut(Position p)
		{
		 // la position de la voiture {x,y} <-- {x,y-1} 
			int i;
			i=p.getY();
			p.setY(i-1);
		}
		
		/**
		 * descend la voiture d'une case vers le bas
		 */	
		public void bas(Position p)
		  {
			 // la position de la voiture {x,y} <-- {x,y+1} 
			int i;
			i=p.getY();
			p.setY(i+1);
		  }
		
		/**
		 * décale la voiture d'une case vers la gauche
		 */
		public void gauche(Position p)
		  {
			 // la position de la voiture {x,y} <-- {x-1,y} 
			int i;
			i=p.getX();
			p.setX(i-1);
		  }
		
		/**
		 * décale la voiture d'une case vers la droite
		 */
		public void droite(Position p)
		  {
			 // la position de la voiture {x,y} <-- {x+1,y} 
			int i;
			i=p.getX();
			p.setX(i+1);
		  }
		
		/**
		 * affiche la position et la couleur de la voiture
		 */
		public String toString()
		{
			return "position voiture : ("+this.pos.getX()+","+this.pos.getY()+") couleur "+this.couleur;
		}
		
}
