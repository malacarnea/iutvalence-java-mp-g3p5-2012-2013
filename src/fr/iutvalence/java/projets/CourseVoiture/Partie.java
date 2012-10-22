package fr.iutvalence.java.projets.CourseVoiture;


/**
 *classe principale du programme qui donne le deroulement d'une partie (deroulement du jeu)
 *
 * @author malacara
 *
 */
public class Partie
{
	/*Boucle pour la partie : 
	 *tant qu'on a pas quitté, et qu'on est pas arrivé au niveau final, on continue
	 */
	
	
//DEBUT : quand on appuie sur le bouton "start"
//choix de la voiture, choix de tours de circuit
	
	// FIXME corriger le commentaire
	/**
	 * entier determinant le nombre de tours qui doit être fait pour réussir la course/valider le circuit
	 * elle est définie par le joueur
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	// FIXME (FIXED)renommer l'attribut
	private int nbTour;
	
	// FIXME (FIXED) corriger le commentaire
	/**
	 * dans une Partie, indique le nombre de tours effectues par la voiture jusqu'a present, 
	 * doit etre inferieur ou egal a nbTour 
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	// FIXME (FIXED) renommer l'attribut	
	private int nbTourCourant;
	
	// FIXME corriger le commentaire
	/**
	 * variable qui détermine quand est-ce que la partie est finie
	 * si quitter = true --> on stop la boucle pour terminer la partie
	 * si quitter = false --> on continue
	 */
	private boolean quitter; 
	
	// FIXME (FIXED) corriger le commentaire
	/**
	 * déclaration d'une voiture, qui est choisie par l'utilisateur et est definie par sa taille, sa position et sa couleur
	 */
	private Voiture voiture;
	
	// FIXME (FIXED)compléter le commentaire 
	/**
	 * initialise les attributs de Partie, on obtient un objet Partie comprenant les attributs voiture, quitter, nbtour, nbtourcourant
	 * nbtourcourant : initialisé ici, changera au cours de la partie
	 * quitter : indique si on a cliqué sur le bouton qui permet de quitter la Partie, est initialisé à faux 
	 * @param nbtour qu'on peut choisir en lançant une partie, nbtour prend pour valeur ce qu'il y a en paramètre
	 * @param voiture : crée une Voiture de position p (coordonnées (x,y)), de taille 1 et de couleur c
	 */
	public Partie(int nbTour, Voiture voiture)
	{
		super();
		this.nbTour = nbTour;
		this.nbTourCourant = 0;
		this.quitter = false;
		this.voiture = voiture;
		
		// FIXME ( FIXED)tous les attributs doivent être initialisés
	}	
	

	/**
	 * methode qui incrémente la variable nbtourcourant à chaque fois qu'on a fais un tour
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	public int getNbtourcourant()
	{ 
		/* Boucle : tant qu'on a pas fais le nb de tour d'une course prédéfinie avant par l'utilsateur, 
		 * et qu'on ne quitte pas, on continue 
		 */
		while ((nbTourCourant != nbTour) && (quitter != false))
		{
			
			// Lancement de la course
			
			nbTourCourant=nbTourCourant+1;
		}
		return nbTourCourant;
	}
			
	//FIN : on clique sur "exit" dans la partie

}

/* faire une classe tour ? pour determiner le fin d'un tour en fonction du circuit et donc 
 * comptabiliser le nbtourcourant et la fin de la course.
 */


