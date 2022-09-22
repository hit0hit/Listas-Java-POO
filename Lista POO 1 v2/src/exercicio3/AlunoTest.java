package exercicio3;

public class AlunoTest {

	public static void main(String[] args) {
Aluno a1 = new Aluno(123, "José", 7, 1, 4);
		
		System.out.println("Média de " + a1.getNome() + ": "+ a1.calculaMedia());
		System.out.println("Quanto falta para " + a1.getNome() + " passar no Exame: " + a1.calculaFinal());

	}

}
