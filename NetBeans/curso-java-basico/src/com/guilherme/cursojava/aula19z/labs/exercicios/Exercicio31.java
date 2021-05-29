/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19z.labs.exercicios;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio31 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int countVetorB = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 == 0){
                vetorB[countVetorB] = vetorA[i];
                countVetorB++;
            }
        }
        
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 != 0){
                vetorB[countVetorB] = vetorA[i];
                countVetorB++;
            }
        }
        
        
        System.out.println("Numeros Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        
        System.out.println();
        
        System.out.println("Numeros Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
        
    }
}
