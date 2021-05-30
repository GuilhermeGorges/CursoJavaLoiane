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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        int maiorLinha5 = 0;
        int menorLinha5 = Integer.MAX_VALUE;
        int maiorColuna7 = 0;
        int menorColuna7 = Integer.MAX_VALUE;
        
        int[][] matrizM = new int[10][10];
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                matrizM[i][j] = gerador.nextInt(9);
            }
        }
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                System.out.print(matrizM[i][j]+" "); 
                if (matrizM[4][j] > maiorLinha5){
                    maiorLinha5 = matrizM[4][j];
                }
                if (matrizM[4][j] < menorLinha5){
                    menorLinha5 = matrizM[4][j];
                }
                if (matrizM[i][6] > maiorColuna7){
                    maiorColuna7 = matrizM[i][6];
                }
                if (matrizM[i][6] < menorColuna7){
                    menorColuna7 = matrizM[i][6];
                }
            }
        System.out.println();
        }
        
        System.out.println("O maior valor da Linha 5 é "+ maiorLinha5);
        System.out.println("O menor valor da Linha 5 é "+ menorLinha5);
        System.out.println("O maior valor da Coluna 7 é "+ maiorColuna7);
        System.out.println("O menor valor da Coluna 7 é "+ menorColuna7);
        
    }
    
}
