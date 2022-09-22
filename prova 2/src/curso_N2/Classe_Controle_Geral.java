package curso_N2;

import java.util.ArrayList;
import java.util.Arrays;

public class Classe_Controle_Geral {

	public static void main(String[] args) {
		
		 ArrayList<Calsse_Aluno> alunos = new ArrayList<>();
	     ArrayList<Classe_Curso> cursos = new ArrayList<>();
	     ArrayList<CursoEspecializacao> cursosEspecializacao = new ArrayList<>();
	     ArrayList<Classe_CursoMestrado> cursosMestrado = new ArrayList<>();
		

	        alunos.add(new Classe_AlunoMasculino(0011, 15, "kaname", "60447252194", "Rua X-4 Pq. das Bananas", true, new Classe_notas(10, 9.3, 8), null));
	        alunos.add(new Calsse_Aluno (0022, 13, "aiya", "46838908107", "Rua Midio St. Velha Suiça", false, new Classe_notas(9, 6.5, 4)));

	        cursos.add(new Classe_Curso(0033, 80, 04, "Administração", "Hit", 124,new ArrayList<Calsse_Aluno>(Arrays.asList(alunos.get(0), alunos.get(1)))));
	        cursos.add(new Classe_Curso(0044, 24, 9, "Direito", "yuno", 90, new ArrayList<Calsse_Aluno>()));

	        cursosEspecializacao.add(new CursoEspecializacao(0055, 84, 07, "Arte", "Ema", 60,new ArrayList<Calsse_Aluno>(), true));
	        cursosEspecializacao.add(new CursoEspecializacao(0066, 120, 10, "rh","katarina", 129, new ArrayList<Calsse_Aluno>(Arrays.asList(alunos.get(0))), true));

	        cursosMestrado.add(new Classe_CursoMestrado(0077, 450, 25, "ADM", "yui", 30,new ArrayList<Calsse_Aluno>(), true));
	        cursosMestrado.add( new Classe_CursoMestrado(00, 1575, 21, "poo", "azi", 99, new ArrayList<Calsse_Aluno>(), true));
	     
	     
	     
	     
	     
	}

}
