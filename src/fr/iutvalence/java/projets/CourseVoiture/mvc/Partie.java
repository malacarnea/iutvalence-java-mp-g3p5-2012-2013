package fr.iutvalence.java.projets.CourseVoiture.mvc;

import fr.iutvalence.java.projets.CourseVoiture.Circuit;
import fr.iutvalence.java.projets.CourseVoiture.Position;
import fr.iutvalence.java.projets.CourseVoiture.Voiture;
import fr.iutvalence.java.projets.CourseVoiture.Deplacement;

public class Partie 
{
	
		/*
		 * Boucle pour la partie :tant qu'on a pas quitté, et qu'on est pas arrivé au niveau final, on continue
		 */

		// DEBUT : quand on appuie sur le bouton "start"
		// choix de la voiture, choix de tours de circuit
	
		private Affiche affc;

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
			// FIXME tous els attributs doivent être initialisés
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

		public void demarrer()
		{
			Position posaChanger =this.voiture.getPosition();
			boolean etatSurLigne=false;	
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
					if (this.circuit.recupValeurCase(posaChanger) == Circuit.LIGNEA)
						dep=Deplacement.DROITE;
					else
						dep = Deplacement.alea();

					// traiter le déplacement (bouger la voiture si on peut, voir si le tourcourant a change)
					
					posaChanger = this.voiture.getPosition().translate(dep);
					this.affc.AffichePos(posaChanger);
		
					if (this.circuit.estDansCircuit(posaChanger)
							&& this.circuit.recupValeurCase(posaChanger) != Circuit.MUR)
					{
						this.circuit.modifValeurCase(this.voiture.getPosition(), valeurPosAchanger);
						valeurPosAchanger = this.circuit.recupValeurCase(posaChanger);
						this.voiture.setPosition(posaChanger);
						this.circuit.modifValeurCase(this.voiture.getPosition(), this.circuit.VOITURE);
					}

					this.affc.AfficheTours(this.nbToursCourant);

					// réafficher le circuit
					this.affc.AfficheCir(this.circuit);
					
					if (this.circuit.recupValeurCase(posaChanger) == Circuit.LIGNEA )
					{	
						if (!etatSurLigne)
						{	
							this.nbToursCourant++;
							etatSurLigne=true;
						}
						else 
							etatSurLigne=false;

					}

				}
								
				// tester la fin de la partie
				if (this.nbToursCourant > this.nbTours)
					this.quitter = true;
			}
			this.affc.AfficheBravo();
			// arrivée
		}

}
