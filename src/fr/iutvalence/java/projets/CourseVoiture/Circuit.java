package fr.iutvalence.java.projets.CourseVoiture;

/**
 * classe permettant de définir un circuit, et la position de la voiture dans ce circuit
 */
public class Circuit
{
	
	
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
	public final static int ROUTE=1;
	
	/**
	 * un mur
	 */
	public final static int MUR=0;
	
	/**
	 * matérialise la ligne d'arrivée
	 */
	public final static int LIGNEA=2;
	
	/**
	 * une voiture sur le circuit
	 */
	public final static int VOITURE=3;
	
	
	
	/**
	 * définition d'un circuit facile
	 */
	public final static int [][] C_FACIL= new int [][]
			
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
	
	/**
	 * circuit moyen
	 */
	public final static int [][] C_MOYEN = new int[][] 
			
			{{MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,LIGNEA,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
			{MUR,ROUTE,ROUTE,ROUTE,MUR,ROUTE,ROUTE,ROUTE,ROUTE,ROUTE,MUR,MUR,MUR,ROUTE,ROUTE,ROUTE,MUR},
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
	 * création d'un circuit avec une matrice cir donnée
	 * @param circuit
	 */
	public Circuit(int [][] cir)
	{
		this.tab=cir;
	}
	
	
	/**
	 * récupère se qu'il y a à une position donnée du circuit
	 * @param p position donnée
	 * @return valeur contenue dans la case se trouvant à la postion p dans le circuit
	 */
	public int recupValeurCase (Position p)
	{
		return this.tab [p.getX()][p.getY()];
	}
	
	/**
	 * modifie la valeur se trouvant à une position donnée
	 * @param p position donnée
	 * @param valeur à inserrer à la position p dans le circuit
	 */
	public void modifValeurCase (Position p, int valeur)
	{
		this.tab  [p.getX()][p.getY()]=valeur;
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
