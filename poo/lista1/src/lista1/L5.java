package lista1;

import java.util.Scanner;

public class L5 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    double nota1, nota2, nota3, media, mediaExe;
    int numeroAluno=0;

    System.out.println("Informe o numero do aluno:");
    numeroAluno = entrada.nextInt();
    System.out.println("Escreva a nota 1:");
    nota1 = entrada.nextDouble();
    System.out.println("Escreva a nota 2:");
    nota2 = entrada.nextDouble();
    System.out.println("Escreva a nota 3:");
    nota3 = entrada.nextDouble();
    System.out.println("Escreva a media dos exercicios:");
    mediaExe = entrada.nextDouble();

    media = (nota1 + nota2 * 2 + nota3 * 3 + mediaExe) / 7;

    if (media >= 9 && media <= 10) {
        System.out.println("A");
        System.out.println("APROVADO");
    }
    if (media >= 7.5 && media < 9) {
        System.out.println("B");
        System.out.println("APROVADO");
    }
    if (media >= 6 && media < 7.5) {
        System.out.println("C");
        System.out.println("APROVADO");
    }
    if (media >= 4 && media < 6) {
        System.out.println("D");
        System.out.println("REPROVADO");
    }
    if (media < 4) {
        System.out.println("E");
        System.out.println("REPROVADO");
    }
    System.out.println("Numero do aluno: " + numeroAluno  +" media do aluno:  " +media  +" media do exercicio "  +mediaExe);

}
}
