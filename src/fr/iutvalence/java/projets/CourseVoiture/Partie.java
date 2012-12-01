package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe principale du programme qui donne le deroulement d'une partie (deroulement du jeu)
 * 
 * @author malacara
 * 
 */
public class Partie
{
	/*
	 * Boucle pour la partie :tant qu'on a pas quitté, et qu'on est pas arrivé au niveau final, on continue
	 */

	// DEBUT : quand on appuie sur le bouton "start"
	// choix de la voiture, choix de tours de circuit

	/**
	 * entier determinant le nombre de tours qui doit être fait pour réussir la course/valider le circuit elle est
	 * définie par le joueur
	 */
	private int nbTours;

	/**
	 * dans une Partie, indique le nombre de tours effectues par la voiture jusqu'a present, doit etre inferieur ou egal
	 * a nbTours
	 */
	private int nbToursCourant;

	/**
	 * variable qui détermine quand est-ce que la partie est finie si quitter = true --> la partie est terminée si
	 * quitter = false --> on continue
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
	 * 
	 * @param nbTours
	 *            le nombre de tours à effectuer
	 * @param voit
	 *            la voiture
	 * @param cir
	 *            le circuit
	 */
	public Partie(int nbTours, Voiture voit, Circuit cir)
	{
		this.nbTours = nbTours;
		this.nbToursCourant = 0;
		this.quitter = false;
		this.voiture = voit;
		this.circuit = cir;
	}

	public int getNbTours()
	{
		return this.nbTours;
	}

	public int getNbTourCourant()
	{
		return nbToursCourant;
	}

	/**
	 * methode qui incrémente la variable nbtourcourant à chaque fois qu'on a fait un tour
	 */
	// public int tourActuel()
	// {
	// /* Boucle : tant qu'on a pas fais le nb de tour d'une course prédéfinie avant par l'utilsateur,
	// * et qu'on ne quitte pas, on continue
	// */
	//
	// // FIXME on peut simplifier (à discuter)
	// int nbTC, nbT;
	// nbTC=getNbTourCourant();
	// nbT=getNbTours();
	// //FIXME pourquoi une boucle ici ?
	// while ((nbTC != nbT) && (this.quitter != false))
	// {
	//
	// // Lancement de la course
	//
	// this.nbToursCourant=this.nbToursCourant+1;
	// }
	// return this.nbToursCourant;
	// }

	// FIN : on clique sur "exit" dans la partie

	public void demarrer()
	{
		Position posaChanger;

		String strPos;
		String strCircuit;
		int valeurPosAchanger = Circuit.ROUTE;

		Deplacement dep;
		// FIXME réfléchir à l'algorithme de déroulement d'une partie

		// placement
		this.circuit.modifValeurCase(this.voiture.getPosition(), this.circuit.VOITURE);
		// depart

		// course
		while (!this.quitter)
		{

			this.nbToursCourant = 0;
			while (this.nbToursCourant <= this.nbTours)
			{

				// simuler un déplacement
				dep = Deplacement.alea();

				// traiter le déplacement (bouger la voiture si on peut, voir si le tourcourant a changé

				posaChanger = this.voiture.getPosition().translate(dep);

				strPos = posaChanger.toString();
				System.out.println(strPos);

				if (this.circuit.recupValeurCase(posaChanger) == Circuit.LIGNEA)
					this.nbToursCourant++;

				if (this.circuit.estDansCircuit(posaChanger)
						&& this.circuit.recupValeurCase(posaChanger) != Circuit.MUR)
				{
					this.circuit.modifValeurCase(this.voiture.getPosition(), valeurPosAchanger);
					valeurPosAchanger = this.circuit.recupValeurCase(posaChanger);
					this.voiture.setPosition(posaChanger);
					this.circuit.modifValeurCase(this.voiture.getPosition(), this.circuit.VOITURE);
				}

				System.out.println("tour courant " + this.nbToursCourant);

				// réafficher le circuit
				strCircuit = this.circuit.toString();
				System.out.println(strCircuit);

			}
			// tester la fin de la partie
			if (this.nbToursCourant > this.nbTours)
				this.quitter = true;
		}
		System.out.println("Bravo !!!!!!!!");
		// arrivée
	}

}

/*
 * faire une classe tour ? pour determiner le fin d'un tour en fonction du circuit et donc comptabiliser le
 * nbtourcourant et la fin de la course.
 */

