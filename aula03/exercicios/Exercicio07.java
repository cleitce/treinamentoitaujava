package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        final int QTDE_TURMAS = 2;
        final int QTDE_ALUNOS = 3;
        Scanner entrada = new Scanner(System.in);
        double notaDoAluno = 0, somaNotasDosAlunos = 0, mediaDaTurma = 0, somaMediaDasTurmas = 0, mediaGeralTurmas = 0;

        for(int contturma = 1; contturma <= QTDE_TURMAS ; contturma ++)
        {
            somaNotasDosAlunos = 0;
            mediaDaTurma = 0;
            for(int contaluno = 1; contaluno <= QTDE_ALUNOS ; contaluno ++)
            {            
                System.out.print("Digite a média do "+ contaluno + "º aluno da turma " + contturma  + ": ");
                notaDoAluno = entrada.nextDouble();

                somaNotasDosAlunos = (somaNotasDosAlunos + notaDoAluno);
            }
            mediaDaTurma = (mediaDaTurma + somaNotasDosAlunos) / QTDE_ALUNOS;
            System.out.printf("A média da turma " + contturma + " é: %.2f\n", mediaDaTurma);
            somaMediaDasTurmas = (somaMediaDasTurmas + mediaDaTurma);
        }
        mediaGeralTurmas = (mediaGeralTurmas + somaMediaDasTurmas) / QTDE_TURMAS;
        System.out.printf("A média geral das turmas é: %.2f\n", mediaGeralTurmas);

        entrada.close();
    }   
}
