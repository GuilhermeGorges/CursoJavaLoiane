
package com.guilherme.cursojava.aula27.orientacaoaobjetosmetodos.labs;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Nome do aluno: ");
        aluno.nome = scan.next();
        
        System.out.println("Curso do aluno: ");
        aluno.nomeCurso = scan.next();
        
        System.out.println("Matricula do aluno: ");
        aluno.matricula = scan.next();
        
        for (int i = 0; i < aluno.nomesDisciplinas.length; i++){
            System.out.println("Nome da disciplina "+ (i+1));
            aluno.nomesDisciplinas[i] = scan.next();
        }
        
        for (int i = 0; i < aluno.notasDisciplina.length; i++){
            
            for (int j = 0; j < aluno.notasDisciplina[i].length; j++){
                System.out.println("Digite a nota "+ (j+1)+" da disciplina de "+ aluno.nomesDisciplinas[i]+ " da aluna "+ aluno.nome);
                aluno.notasDisciplina[i][j] = scan.nextDouble();
            }
        }
        
        aluno.mostrarInfo();
        
        boolean exit = false;
        do{
            System.out.println("Consulte em qual disciplina foi aprovado [o] para sair: ");
            int disciplina = scan.nextInt();
            if (disciplina == 0){
                exit = true;
            } else if (aluno.aprovadoDisciplina(disciplina)){
                System.out.println("Foi aprovado na disciplina "+aluno.nomesDisciplinas[disciplina-1]);
            } else {
                System.out.println("Foi reprovado na disciplina "+aluno.nomesDisciplinas[disciplina-1]);
            }
        } while (!exit);
       

        
        
    }
}
