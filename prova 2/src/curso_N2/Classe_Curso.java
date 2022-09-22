package curso_N2;

import java.util.ArrayList;

public class Classe_Curso {
private int 
codigo,
cargaHoraria,
sala;
public Object isAluno;
private double valorCurso;
private String 
nome,
nomePofessor;

// arraylista de alunos
ArrayList<Calsse_Aluno> Aluno;

// métodos
public Classe_Curso(int codigo, int cargaHoraria, int sala, String nome, String nomePofessor,double valorCurso,
		ArrayList<Calsse_Aluno> aluno) {
	this.codigo = codigo;
	this.cargaHoraria = cargaHoraria;
	this.sala = sala;
	this.nome = nome;
	this.nomePofessor = nomePofessor;
	this.valorCurso = valorCurso;
	this.Aluno = aluno;
}

// valor do curso
public double getValorCurso() {
	return valorCurso;
}


public void setValorCurso(double valorCurso) {
	this.valorCurso = valorCurso;
}


// codigo set e get
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}

//cargaH set e get
public int getCargaHoraria() {
	return cargaHoraria;
}
public void setCargaHoraria(int cargaHoraria) {
	this.cargaHoraria = cargaHoraria;
}
//sala set e get
public int getSala() {
	return sala;
}
public void setSala(int sala) {
	this.sala = sala;
}
//nome set e get
public String getNome() {
	return nome;
}
public boolean isAluno(String nome) {
    return Aluno.stream().anyMatch(x -> nome == x.getNome());
}
public void setNome(String nome) {
	this.nome = nome;
}
//nomeP set e get
public String getNomePofessor() {
	return nomePofessor;
}
public void setNomePofessor(String nomePofessor) {
	this.nomePofessor = nomePofessor;
}
//arraylist set e get
public ArrayList<Calsse_Aluno> getAluno() {
	return Aluno;
}
public void setAluno(ArrayList<Calsse_Aluno> aluno) {
	Aluno = aluno;
}

//toString
@Override
public String toString() {
	return "Classe_Curso [codigo=" + codigo + ", cargaHoraria=" + cargaHoraria + ", sala=" + sala + ", nome=" + nome
			+ ", nomePofessor=" + nomePofessor + ", Aluno=" + Aluno + "]";
}



}
