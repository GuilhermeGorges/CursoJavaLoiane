/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula20z.labs.exercicios;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        int pares = 0;
        int impares = 0;
                
        int[][] matrizM = new int[3][3];
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                System.out.println("Digite um valor para ser adicionado a linha " + i + " coluna: " + j);
                matrizM[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                if (matrizM[i][j]%2 ==0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                System.out.print(matrizM[i][j]+" "); 
            }
            System.out.println();
        }
        System.out.println("A matriz possui "+ pares + " valores pares.");
        System.out.println("A matriz possui "+ impares + " valores impares.");
        
    }
    
}
