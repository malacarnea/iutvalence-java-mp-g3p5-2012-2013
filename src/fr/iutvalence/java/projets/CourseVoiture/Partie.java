package fr.iutvalence.java.projets.CourseVoiture;


// FIXME détailler le commentaire
/**
 * classe principale du programme
 * @author malacara
 *
 */
public class Partie
{
	//boucle pour la partie : tant qu'on a pas quittÈ, et qu'on est pas arrivÈ au niveau final, on continue
	
	
		//debut : quand on appuie sur le bouton "start"
		//choix de la voiture, choix de tours de circuit
	
	// FIXME corriger le commentaire
	// FIXME réfléchir à la visibilité des attributs
	/**
	 * variable choisie par le joueur, indique le nombre de tours du circuit
	 */
	public int nbtour;
	//lancement de la course
		//boucle pour le circuit : tant qu'on a pas fais le nb de tour, et qu'on ne quitte pas, on continue
	

	// FIXME réfléchir à la visibilité des attributs
	// FIMXE initialisation des attributs dans le constructeur
	/**
	 * compte le nombre de tour actuel
	 */
	int nbtourcourant=0;
	
	// FIXME écrire un commentaire 
	boolean quitter; 
	
	
	// FIXME autres attributs ?
	
	
	// FIXME écrire un commentaire
	// FIXME est-il pertinent de fixer "quitter" depuis l'extérieur ?
	// FIXME est-il pertinent de fixer "nbTourCourant" depuis l'extérieur ?
	public Partie(int nbtour, int nbtourcourant, boolean quitter)
	{
		super();
		this.nbtour = nbtour;
		this.nbtourcourant = nbtourcourant;
		this.quitter = quitter;
	}	
	
	// FIXME écrire un commentaire
	public int getNbtourcourant()
	{ 
		while (nbtourcourant != nbtour && quitter != 0)
			//la course commence
			nbtourcourant=nbtourcourant+1;
		return nbtourcourant;
		
	}
	
	//fin : on clique sur "exit" dans la partie

}
