package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe permettant de définir un circuit, et la position de la voiture dans ce circuit
 */
public class Circuit
{
	
	// reste à définir des méthodes...
	
	/**
	 * constante donnant la borne inferieur, est la même pour x et y (le circuit étant carré)
	 */
	public final static int MIN= 0;
	
	/**
	 * constante donnant la borne supérieur, est la même pour x et y
	 */
	public final static int MAX= 17;
	
	/**
	 * espace où roule la voiture
	 */
	private final static int ROUTE=1;
	
	/**
	 * un mur
	 */
	private final static int MUR=0;
	
	/**
	 * matérialise la ligne d'arrivée
	 */
	private final static int LIGNEA=2;
	
	private final static int [][] C_FACIL= new int [][]
			
			{{MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR}
		};
	
	private final static int [][] C_MOYEN = new int[][] 
			
			{{MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,ROUTE,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,LIGNEA,LIGNEA,LIGNEA,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,ROUTE,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,MUR,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR}
		};
	
	// FIXME corriger le commentaire (à discuter)
	/**
	 * Il faut faire un tableau / une grille d'entiers (17/17, le point d'origine est en haut à gauche) 
	 * qui nous permettra de determiner le circuit :
	 * dans chaque case on aura soit :
	 * 1 pour rien (endroit où la voiture pourra se placer)
	 * 0 pour un mur
	 * 2 matérialise la ligne d'arrivée
	 */
	private int[][] tab;
	
	/**
	 * entier à choisir pour sélectionner un niveau
	 */
	private int niveau;
	
	
	// FIXME corriger le commentaire  (à discuter)
	/**
	 * construit un tableau d'entiers matérialisant le circuit en fonction de l'entier niveau passé en paramètre
	 * @param niveau
	 */
	public Circuit(int [][] cir)
	{
		this.tab=cir;
	}
	
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		int i, j;
		i=0;
		String s="";
		while (i<MAX  )
		{
			j=0;
			while (j<MAX)
			{
				s=s + this.tab[i][j];
				j++;
			}
			s=s+"\n";
			i++;
		}
		return s;
	}

}
