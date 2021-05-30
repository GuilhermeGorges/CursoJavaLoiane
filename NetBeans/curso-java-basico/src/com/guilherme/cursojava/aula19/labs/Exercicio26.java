/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio26 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor para o vetor A Nº "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Digite o valor para o vetor B Nº "+ (i+1));
            vetorB[i] = scan.nextInt();
            
            if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " "); 
        }        
        System.out.println();
        
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " "); 
        }
        System.out.println();
        
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " "); 
        }
    }
}
