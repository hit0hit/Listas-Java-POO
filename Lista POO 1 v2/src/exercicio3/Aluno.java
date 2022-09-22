package exercicio3;

public class Aluno {
	private int matricula;
	private String nome;
	private double n1, n2, nT;

	public Aluno(int matricula, String nome, double n1, double n2, double nT) {
		this.matricula = matricula;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.nT = nT;
	}
	
	public String getNome() {
		return this.nome;
	}

	public double calculaMedia() {
		return (n1 + n2 + nT) / 3.0;
	}

	public double calculaFinal() {
		if (calculaMedia() < 6) {
			return 10 - calculaMedia();
		}
		
		return 0;
	}
}
