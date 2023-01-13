package polimorfismo;

public abstract class figuras {
	
	private int posX,posY;
	
	public figuras() {}
	public figuras(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public abstract double perimetro();   //declaramos perimetro pero no lo pedimos, los hijos darán el perimetro
	
	//public abstract double area() {
		
	public String toString() {
		return "Era una figura";
	}
	
	}