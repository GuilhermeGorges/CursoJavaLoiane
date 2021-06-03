/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula33.lab;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Nome do aluno: ");
        aluno.setNome(scan.next());
        
        System.out.println("Curso do aluno: ");
        aluno.setNomeCurso(scan.next());
        
        System.out.println("Matricula do aluno: ");
        aluno.setMatricula(scan.next());
        
        for (int i = 0; i < aluno.getNomesDisciplinas().length; i++){
            System.out.println("Nome da disciplina "+ (i+1));
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
        
        for (int i = 0; i < aluno.getNotasDisciplina().length; i++){
            
            for (int j = 0; j < aluno.getNotasDisciplina()[i].length; j++){
                System.out.println("Digite a nota "+ (j+1)+" da disciplina de "+ aluno.getNomesDisciplinas()[i]+ " da aluno(a) "+ aluno.getNome());
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
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
                System.out.println("Foi aprovado na disciplina "+aluno.getNomesDisciplinas()[disciplina-1]);
            } else {
                System.out.println("Foi reprovado na disciplina "+aluno.getNomesDisciplinas()[disciplina-1]);
            }
        } while (!exit);
       

        
        
    }
}
