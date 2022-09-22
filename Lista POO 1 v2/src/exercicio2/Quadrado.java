package exercicio2;

public class Quadrado {
private double lado;
	
	public Quadrado (double lado) {
		this.lado = lado;
	}
	
	public double area() {
		return Math.pow(lado, 2.0);
	}
	
	public double perimetro() {
		return 4 * lado;
	}
	
	public String toString() {
		return "lado: "  + lado;
	}
}
