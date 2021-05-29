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
public class Exercicio24 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor Nº "+ (i+1)+" ");
            vetorA[i] = scan.nextInt();
        }
        
        boolean palindromo = true;
        for (int i = 0, j = (vetorA.length-1); i < ((vetorA.length-1)/2); i++, j--){
            if (vetorA[i] != vetorA[j]){
                palindromo = false;
                break;
            }
        }  
        
        System.out.print("\nA sequencia do vetor A = ");
        if (palindromo) {            
            System.out.println("É UM PALINDROMO");
        } else {            
            System.out.println("NÃO É UM PALINDROMO");
        }
            
    }
    
}
