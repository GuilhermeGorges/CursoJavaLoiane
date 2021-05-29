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
public class Exercicio20 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        double[]vetorA = new double[20];
        double cotacao;
        
        System.out.println("Entre com a cotação do dólar: ");
        cotacao = scan.nextDouble();
        
        for (int i=0; i<vetorA.length; i++){
            vetorA[i] = cotacao * (i+1);
        }
        
        System.out.println("Vetor A =");
        for (int i =0; i<vetorA.length;i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        
    }
}
