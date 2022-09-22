package curso_N2;

import java.util.ArrayList;

public class Classe_CursoMestrado extends Classe_Curso {
	


	private boolean 
		strictoSensu;
	private double 
		adicionalDiploma;
	
	
	//métodos
	public Classe_CursoMestrado(int codigo, int cargaHoraria, int sala, String nome, String nomePofessor,
			double valorCurso, ArrayList<Calsse_Aluno> aluno, boolean strictoSensu) {
		super(codigo, cargaHoraria, sala, nome, nomePofessor, valorCurso, aluno);
		this.strictoSensu = strictoSensu;
	}

// boolean StrictoSensu
	public boolean isStrictoSensu() {
		return strictoSensu;
	}

// set isStrictoSensu
	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}

// get add diploma
	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

// soma do preço
	public void setAdicionalDiploma() {
		int contalunos = super.getAluno().size();
        if (contalunos <= 5) {
            this.adicionalDiploma = 45 * contalunos;
        } else if (contalunos <= 15) {
            this.adicionalDiploma = 43 * contalunos;
        } else if (contalunos <= 30) {   
            this.adicionalDiploma = 40 * contalunos;
        } else {
            this.adicionalDiploma = 36 * contalunos;
        }
	}
	// cont aluno
	  @Override
	    public boolean isAluno(String nome) {
	        return super.isAluno(nome);
	    }

// toString
	@Override
	public String toString() {
		return "Classe_CursoMestrado [strictoSensu=" + strictoSensu + ", adicionalDiploma=" + adicionalDiploma + "]";
	}
	  
	

}
