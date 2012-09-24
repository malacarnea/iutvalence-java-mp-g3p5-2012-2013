package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe principale du programme
 * @author malacara
 *
 */
public class Partie
{
	//boucle pour la partie : tant qu'on a pas quitté, et qu'on est pas arrivé au niveau final, on continue
	
	
		//debut : quand on appuie sur le bouton "start"
		//choix de la voiture, choix de tours de circuit
	/**
	 * variable choisie par le joueur, indique le nombre de tours du circuit
	 */
	public int nbtour;
	//lancement de la course
		//boucle pour le circuit : tant qu'on a pas fais le nb de tour, et qu'on ne quitte pas, on continue
	/**
	 * compte le nombre de tour actuel
	 */
	int nbtourcourant=0;
	boolean quitter; 
	public Partie(int nbtour, int nbtourcourant, boolean quitter)
	{
		super();
		this.nbtour = nbtour;
		this.nbtourcourant = nbtourcourant;
		this.quitter = quitter;
	}	
	
	public int getNbtourcourant()
	{
		while (nbtourcourant != nbtour && quitter != 0)
			//la course commence
			nbtourcourant=nbtourcourant+1;
		return nbtourcourant;
		
	}
	
	//fin : on clique sur "exit" dans la partie

}
