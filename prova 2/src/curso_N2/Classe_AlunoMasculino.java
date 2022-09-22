package curso_N2;

public class Classe_AlunoMasculino extends Calsse_Aluno {
private String 
	identidadeMilitar;


public Classe_AlunoMasculino(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Classe_notas notas,String identidadeMilitar) {
		super(codigo, idade, nome, cpf, endereco, sexo, notas);
		 this.identidadeMilitar = identidadeMilitar;
	}

// identidadeMilitar set e get
public String getIdentidadeMilitar() {
	return identidadeMilitar;
}


public void setIdentidadeMilitar(String identidadeMilitar) {
	this.identidadeMilitar = identidadeMilitar;
}
// toString
@Override
public String toString() {
	return "Classe_AlunoMasculino [identidadeMilitar=" + identidadeMilitar + "]";
}


}
