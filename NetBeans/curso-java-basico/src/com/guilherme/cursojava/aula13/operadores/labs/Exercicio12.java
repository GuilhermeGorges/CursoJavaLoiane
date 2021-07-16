/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13.operadores.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua altura: ");
        double height = scan.nextDouble();
        
        double imc = (72.7 * height) - 58;
        System.out.println("O seu peso ideal é = "+ imc);
        
    }
 
}
