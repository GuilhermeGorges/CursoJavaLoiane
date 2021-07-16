/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero de turmas a serem analizadas");
        int turmas = scan.nextInt();
        int alunosNaTurma = 0;
        int somaAlunos = 0;        
        double mediaPorTurma;
        
        
        for (int i = 0; i < turmas;){
            System.out.println("Quantos alunos há na turma Nº "+ (i+1) );
            alunosNaTurma = scan.nextInt();
            if (alunosNaTurma < 40){
                somaAlunos += alunosNaTurma;
                i++;
            } else {
                System.out.println("Quantidade de alunos acima do limite...");
                System.out.println("Tente novamente!");
            }
        }
        
        mediaPorTurma = somaAlunos / turmas;
        
        System.out.println("Foram cadastradas " + turmas + " turmas.");
        System.out.println("O total de alunos é "+ somaAlunos);
        System.out.println("A quantidade media de alunos por turma é de "+ mediaPorTurma);
        
        
    }
}
