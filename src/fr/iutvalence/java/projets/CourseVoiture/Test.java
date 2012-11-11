package fr.iutvalence.java.projets.CourseVoiture;

public class Test {

	/**
	 * @param args
	 * @throws PositionInvalideException 
	 */
	
	// FIXME le main ne peut pas soulever d'exception (cela n'a pas de sens)
	public static void main(String[] args) throws PositionInvalideException 
	{
		Position p=new Position(5, 10);
		int n=2;
		Voiture v = new Voiture(p,n);
		
		
		String str;
		System.out.println("teste");
	/*	Circuit cir=new Circuit(n);
		str=cir.toString();
		System.out.println(str);*/
		
		v.haut(p);
		v.droite(p);
		
		str=v.toString();
		System.out.println(str);
	}

}
