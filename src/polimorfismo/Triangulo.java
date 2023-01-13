package polimorfismo;

public class Triangulo extends figuras {
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public double perimetro() {
		return base+altura*2;
	}

}
