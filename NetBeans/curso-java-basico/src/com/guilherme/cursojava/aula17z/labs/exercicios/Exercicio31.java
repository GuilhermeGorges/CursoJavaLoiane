/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17z.labs.exercicios;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        System.out.println("Qual é o seu salário inicial: ");
        double salario = scan.nextInt();
        
        System.out.println("Ano de contratação: ");
        int inicio = scan.nextInt();
        
        System.out.println("Ano de saida: ");
        int fim = scan.nextInt();
        
        double aumento = salario * 1.015;
        
        
        for (; inicio < fim; inicio++){
            aumento = aumento * 1.03;
        }
        
        System.out.println("O seu salário corrigido é R$ " + aumento);
        
        
    }   
}
