package fr.iutvalence.java.projets.CourseVoiture;

public class Test {

	/**
	 * @param args
	 * @throws PositionInvalideException 
	 */
	
	// FIXME (fixed) le main ne peut pas soulever d'exception (cela n'a pas de sens)
	public static void main(String[] args) 
	{
		try{
			String str;
			Position p=new Position(5, 10);
			int n=2;
			Voiture v = new Voiture(p,n);
			v.haut(p);
			v.droite(p);
			str=v.toString();
			System.out.println(str);
		}
		catch (PositionInvalideException pie1){}
		
		String str;
		System.out.println("teste");
		Circuit cir=new Circuit(Circuit.C_FACIL);
		str=cir.toString();
		System.out.println(str);
		
		
		
		
	}

}
