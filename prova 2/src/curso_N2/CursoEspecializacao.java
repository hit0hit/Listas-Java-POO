package curso_N2;

import java.util.ArrayList;

public class CursoEspecializacao extends Classe_Curso {
	

	private boolean 
		latoSensu;
	
	private double 
		adicionalDiploma;
	
	
	//método
	public CursoEspecializacao(int codigo, int cargaHoraria, int sala, String nome, String nomePofessor,
			double valorCurso, ArrayList<Calsse_Aluno> aluno, boolean latoSensu) {
		super(codigo, cargaHoraria, sala, nome, nomePofessor, valorCurso, aluno);
		this.latoSensu = latoSensu;
	}

// boolean lotosunsu
	public boolean isLatoSensu() {
		return latoSensu;
	}


	public void setLatoSensu(boolean latoSensu) {
		this.latoSensu = latoSensu;
	}

// get e set add diploma
	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}


	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}

	@Override
	// cont aluno 
    public boolean isAluno(String nome) {
        return super.isAluno(nome);
    }
// soma valor
    public void setAdicionalDiploma() {
        int cont_aluno = super.getAluno().size();
        if (cont_aluno <= 10) {
            this.adicionalDiploma = 25 * cont_aluno;
        } else if (cont_aluno <= 30) {
            this.adicionalDiploma = 20 * cont_aluno;
        } else {
            this.adicionalDiploma = 18 * cont_aluno;
        }
    }
    //toString
    @Override
    public String toString() {
        return super.toString()
            + "\nLato Sensu: " + latoSensu
            + "\nAdicional Diploma: " + adicionalDiploma;
    }
}

