/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13.operadores.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("Digite as 4 notas bimestrais do aluno: ");
        
        Scanner scan = new Scanner(System.in);
        
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float nota4 = scan.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média do aluno é: " + media);
        
        
        
    }
}
