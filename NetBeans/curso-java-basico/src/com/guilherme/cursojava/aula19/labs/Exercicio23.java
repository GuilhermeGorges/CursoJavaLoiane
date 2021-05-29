/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;

import java.util.Scanner;
/**
 *
 * @author Gui e Di
 */
public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor Nº "+ (i+1));
            vetorA[i] = scan.nextInt();
        }
        
        System.out.println("Os valores digitados foram =");    
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i]%2 == 0){
                break;
            }    
            System.out.println(vetorA[i]); 
        }
        
    }
}
