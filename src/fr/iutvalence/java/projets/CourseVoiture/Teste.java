package fr.iutvalence.java.projets.CourseVoiture;

public class Teste {

	/**
	 * @param args
	 * @throws CIE 
	 */
	public static void main(String[] args) throws CIE 
	{
		// TODO Auto-generated method stub
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
