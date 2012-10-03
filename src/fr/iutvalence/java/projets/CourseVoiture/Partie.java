package fr.iutvalence.java.projets.CourseVoiture;


/**
 *classe principale du programme qui donne le déroulement d'une partie (dérouelement du jeu)
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
	
	/**
	 * variable determinant le nombre de tours qui doit être fait pour réussir la course/valider le circuit
	 * elle est définie par le joueur
	 */
	private int nbtour;
	

	/**
	 * variable qui compte le nombre de tour actuel
	 */
	private int nbtourcourant;
	
	/**
	 * variable qui détermine quand est-ce que la partie est finie
	 * si quitter = 1 --> on stop la boucle pour terminer la partie
	 * si quitter = 0 --> on continue
	 */
	private boolean quitter; 
	
	/**
	 * déclaration d'une voiture, qui est choisie par l'utilisateur en fonction de sa couleur
	 */
	private Voiture voiture;
	
	/**
	 * instanciation des paramètres définissant une partie
	 * @param nbtour
	 * @param voiture
	 */
	public Partie(int nbtour, /* int nbtourcourant, boolean quitter, */ Voiture voiture)
	{
		super();
		this.nbtour = nbtour;
		//this.nbtourcourant = nbtourcourant = 0;
		//this.quitter = quitter;
		this.voiture = voiture;
	}	
	

	/**
	 * boucle qui incrémente la variable nbtourcourant à chaque fois qu'on a fais un tour
	 */
	public int getNbtourcourant()
	{ 
		/* Boucle : tant qu'on a pas fais le nb de tour d'une course prédéfinie avant par l'utilsateur, 
		 * et qu'on ne quitte pas, on continue 
		 */
		while (nbtourcourant != nbtour && quitter != false)
			
			// Lancement de la course
			
			nbtourcourant=nbtourcourant+1;
		return nbtourcourant;
		
	}
			
	//FIN : on clique sur "exit" dans la partie

}

/* faire une classe tour ? pour determiner le fin d'un tour en fonction du circuit et donc 
 * comptabiliser le nbtourcourant et la fin de la course.
 */

/* faire une classe bonus ? pour determiner les paramètres qui changerons sur la voiture en fonction du
 * bonus qui a été pris par le joueur. 
 */
