/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno: ");
        float nota1 = scan.nextFloat();
        
        System.out.println("Digite a segunda nota do aluno: ");
        float nota2 = scan.nextFloat();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 10){
            System.out.println("A média do aluno é "+ media);
            System.out.println("Aprovado com distinção");
        } else if (media >= 7 && media < 10){
            System.out.println("A média do aluno é "+ media);
            System.out.println("Aprovado");            
        } else {
            System.out.println("A média do aluno é "+ media);
            System.out.println("Reprovado");
        }
        
    }
}
