/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula20.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        
        int[][] matrizM = new int[4][4];
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                matrizM[i][j] = gerador.nextInt(100);
            }
        }
        
        for (int i = 0; i< matrizM.length; i++){
            for (int j = 0; j< matrizM.length; j++){
                System.out.print(matrizM[i][j]+" "); 
                if (matrizM[i][j] > maior){
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j; 
                }
            }
            System.out.println();
        }
        System.out.println("O maior valor da matriz é "+ maior);
        System.out.println("Está posicionado na linha [ " + (linha+1) + " ] coluna [ " + (coluna+1) + " ].");
        
    }
}
