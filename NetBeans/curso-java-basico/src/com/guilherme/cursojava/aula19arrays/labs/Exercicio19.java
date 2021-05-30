/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula19arrays.labs;

import com.guilherme.cursojava.aula15.labs.*;

/**
 *
 * @author Gui e Di
 */
public class Exercicio19 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        double[] nota1 = new double[10];
        double[] nota2 = new double[nota1.length];
        double[] media = new double[nota1.length];
        String[] situacao = new String[nota1.length];
        
        for (int i = 0; i < nota1.length; i++){
            System.out.println("Digite a primeira nota do aluno Nº "+ (i+1));
            nota1[i] = scan.nextDouble();
            System.out.println("Digite a segunda nota do aluno Nº "+ (i+1));
            nota2[i] = scan.nextDouble();
            
        }
        for (int i = 0; i < nota1.length; i++){            
            media[i] = (nota1[i] + nota2[i]) / 2;
            
            if (media[i] >=7 ){
                situacao[i] = "Aprovado";
            }else {
                situacao[i] = "Reprovado";
            }
        }
        
        for (int i = 0; i < nota1.length; i++){
            System.out.println("Aluno "+ (i+1) + " Nota 1: "+ nota1[i] + " Nota 2: " + nota2[i] + " Media: " + media[i]+ " o aluno está "+situacao[i]);
        }
        
        
    }
    
}
