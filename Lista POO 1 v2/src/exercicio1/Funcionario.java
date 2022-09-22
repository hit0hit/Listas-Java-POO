package exercicio1;

public class Funcionario {
private double salario;
	
	public Funcionario() {
		this.salario = 0.0;
	}
	
	public double calculaSalario(double vendasBrutas) {
		if(vendasBrutas > 8000 ) {
			this.salario = 382.33 + (vendasBrutas*8.675/100);
		}
		else {
			this.salario = 177.12 + (vendasBrutas*3.87/100);
		}
		
		return this.salario;
	}
}
