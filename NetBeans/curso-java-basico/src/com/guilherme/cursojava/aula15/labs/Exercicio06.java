/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro numero");
        int num3 = scan.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("O numero " + num1 + " é o maior.");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("O numero " + num2 + " é o maior.");
        } else {
            System.out.println("O numero " + num3 + " é o maior.");
        }
    }
}
