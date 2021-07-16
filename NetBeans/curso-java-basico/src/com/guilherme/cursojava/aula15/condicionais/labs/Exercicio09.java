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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro numero ");
        int num3 = scan.nextInt();
        
        if (num1 > num2 && num2 > num3){
            System.out.println("Os numeros digitados em sequência são -> " + num1 + num2 + num3);
        } else if (num1 > num3 && num3 > num2){
            System.out.println("Os numeros digitados em sequência são -> " + num1 + num3 + num2);
        } else if (num2 > num1 && num1 > num3){
            System.out.println("Os numeros digitados em sequência são -> " + num2 + num1 + num3);
        } else if (num2 > num3 && num3 > num1){
            System.out.println("Os numeros digitados em sequência são -> " + num2 + num3 + num1);
        } else if (num3 > num1 && num1 > num2){
            System.out.println("Os numeros digitados em sequência são -> " + num3 + num1 + num2);
        } else if (num3 > num2 && num2 > num1){
            System.out.println("Os numeros digitados em sequência são -> " + num3 + num2 + num1);
        } else { 
            System.out.println("Foram digitados numeros iguais");
        }
    }
}
