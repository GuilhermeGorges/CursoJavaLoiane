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
public class Exercicio28 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0, j = (vetorA.length-1); i < vetorA.length; i++, j--){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt(); 
            vetorB[j] = vetorA[i];
        }
        
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }
    }
}
