/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.arrays.labs;

/**
 *
 * 
 */
public class Exercicio34 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] vetorA = new int[10];
        String msg = "";
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Os valores pares de 0 até "+ vetorA[i]+ " são: ");
            for (int j = 0; j <= vetorA[i];j++){
                if (j%2 == 0){
                    System.out.print(j+" - ");
                }
            }
            System.out.println();
        }
    }
    
}
