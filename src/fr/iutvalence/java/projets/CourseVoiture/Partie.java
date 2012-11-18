package fr.iutvalence.java.projets.CourseVoiture;

import java.util.Random;


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
	
	// FIXME déclarer l'énumération dans un fichier à part
	public enum Deplacement{HAUT, BAS, GAUCHE, DROITE;}
	
	/**
	 * entier determinant le nombre de tours qui doit être fait pour réussir la course/valider le circuit
	 * elle est définie par le joueur
	 */
	private int nbTours;
	
	/**
	 * dans une Partie, indique le nombre de tours effectues par la voiture jusqu'a present, 
	 * doit etre inferieur ou egal a nbTours
	 */
	private int nbToursCourant;
	
	/**
	 * variable qui détermine quand est-ce que la partie est finie
	 * si quitter = true --> la partie est terminée
	 * si quitter = false --> on continue
	 */
	private boolean quitter; 
	
	/**
	 * la voiturequi se déplace sur le circuit
	 */
	private final Voiture voiture;
	
	/**
	 * le circuit
	 */
	private final Circuit circuit;
	
	/**
	 * Création d'une partie avec une voiture, un circuit et un nombre de tours donnés 
	 * @param nbTours le nombre de tours à effectuer
	 * @param voit la voiture 
	 * @param cir le circuit
	 */
	public Partie(int nbTours, Voiture voit, Circuit cir)
	{
		this.nbTours = nbTours;
		this.nbToursCourant = 0;
		this.quitter = false;
		this.voiture = voit;
		this.circuit=cir;
	}	
	
	
	public int getNbTours()
	{
		return this.nbTours;
	}


	public boolean isQuitter()
	{
		return quitter;
	}


	public Voiture getVoiture()
	{
		return voiture;
	}


	public Circuit getCircuit()
	{
		return circuit;
	}
	

	public int getNbTourCourant()
	{
		return nbToursCourant;
	}


	/**
	 * methode qui incrémente la variable nbtourcourant à chaque fois qu'on a fait un tour
	 */
	public int tourActuel()
	{ 
		/* Boucle : tant qu'on a pas fais le nb de tour d'une course prédéfinie avant par l'utilsateur, 
		 * et qu'on ne quitte pas, on continue 
		 */
		
		// FIXME on peut simplifier (à discuter)
		int nbTC, nbT;
		nbTC=getNbTourCourant();
		nbT=getNbTours();
		//FIXME pourquoi une boucle ici ?
		while ((nbTC != nbT) && (this.quitter != false))
		{
			
			// Lancement de la course
			
			this.nbToursCourant=this.nbToursCourant+1;
		}
		return this.nbToursCourant;
	}
			
	//FIN : on clique sur "exit" dans la partie


public void demarrer()
{
	circuit.modifValeurCase(voiture.getPosition(), circuit.VOITURE );

	// FIXME réfléchir à l'algorithme de déroulement d'une partie
	while (!quitter)
	{
		int deplacement = new Random().nextInt(Deplacement.values().length);
		
		//simuler un déplacement
		switch (deplacement)
		{
			case  0:
			{
				
					switch (circuit.recupValeurCase(voiture.getPosition()))
					{
						case  Circuit.MUR:
							break;
						
					}
			}
			case 1:
			case 2:
			case 3:
		}
	}
}


}

/* faire une classe tour ? pour determiner le fin d'un tour en fonction du circuit et donc 
 * comptabiliser le nbtourcourant et la fin de la course.
 */


