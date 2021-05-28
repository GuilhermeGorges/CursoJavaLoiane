/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19.labs;

import com.guilherme.cursojava.aula15.labs.*;
import com.guilherme.cursojava.aula13.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio18 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
                
        int[] idade = new int[10];
        int menorValor = idade[0];
        int posicaoMenor = 0;
        int maiorValor = idade[0];
        int posicaoMaior = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite a idade da pessoa Nº "+ (i+1)+" ");
            idade[i] = scan.nextInt();
            if (idade[i]>maiorValor){
                maiorValor = idade[i];
                posicaoMaior = i;
            }
            if (idade[i]<menorValor){
                menorValor = idade[i];
                posicaoMenor = i;
            }
        }
        
        System.out.println("O maior valor digitado foi "+ maiorValor+" na posição "+ posicaoMaior);
        System.out.println("O menor valor digitado foi "+ menorValor+" na posição "+ posicaoMenor);
    }
    
    
}
