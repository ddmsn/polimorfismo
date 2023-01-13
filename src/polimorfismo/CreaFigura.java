package polimorfismo;

public class CreaFigura {

	public static void main(String[] args) {

		Rectangulo r= new Rectangulo (10,5);
		Triangulo t=new Triangulo (20,10);
		figuras[] figuras = new figuras[2];
		figuras[0]=r;
		figuras[1]=t;
		
		//System.out.printf("%s%n%s%n%s",r,t);
		
		for (figuras f: figuras) {
			System.out.println(f.perimetro());
			System.out.println("El perimetro de la figura");
			
		}
		
		
	}

}
