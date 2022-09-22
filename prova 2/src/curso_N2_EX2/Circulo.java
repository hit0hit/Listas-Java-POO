package curso_N2_EX2;

public class Circulo implements FormaGeometrica {
	  private double raio;

	    public Circulo(double raio) {
	        this.raio = raio;
	    }
// get da area	    
	    @Override
	    public double getArea() {
	        return Math.PI * Math.pow(raio, 2);
	    }
// get perimetro
	    @Override
	    public double getPerimetro() {
	        return 2 * Math.PI * raio;
	    }

	    
//get e set raio
	    public double getRaio() {
	        return raio;
	    }
//set raio 
	    public void setRaio(double raio) {
	        this.raio = raio;
	    }
// exibir ou mostrar dados
	    @Override
	    public void exibirDados() {
	        System.out.println("\nCirculo\n" + "Raio==> " + raio + "\nÁrea==> " + getArea() + "\nPerímetro==> " + getPerimetro());
	    }
}
