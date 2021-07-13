/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula15.condicionais.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio19 {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        
        while (true) {
        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();  
        
      
        System.out.println("Digite a operação que pretende realizar:  ");
        String operador = scan.next();
        
        if ("+".equalsIgnoreCase(operador)){
            double result = num1 + num2;
            System.out.println("O resultado é "+ num1 + " " + operador + " " + num2 + " = " + result);
            if (result%2 == 0){
                System.out.println(result + " É par!");
            } else {
                System.out.println(result + " Não é par");
            }
            if (result > 0){
                System.out.println(result + " é positivo!");
            } else {
                System.out.println(result + " é negativo");
            }
        } else if ("-".equalsIgnoreCase(operador)){
            double result = num1 - num2;
            System.out.println("O resultado é "+ num1 + " " + operador + " " + num2 + " = " + result);
            if (result%2 == 0){
                System.out.println(result + " É par!");
            } else {
                System.out.println(result + " Não é par");
            }
            if (result > 0){
                System.out.println(result + " é positivo!");
            } else {
                System.out.println(result + " é negativo");
            }
                        
        } else if ("*".equalsIgnoreCase(operador)){
            double result = num1 * num2;
            System.out.println("O resultado é "+ num1 + " " + operador + " " + num2 + " = " + result);
            if (result%2 == 0){
                System.out.println(result + " É par!");
            } else {
                System.out.println(result + " Não é par");
            }
            if (result > 0){
                System.out.println(result + " é positivo!");
            } else {
                System.out.println(result + " é negativo");
            }
            
        } else if ("/".equalsIgnoreCase(operador)){
            double result = num1 / num2;            
            System.out.println("O resultado é "+ num1 + " " + operador + " " + num2 + " = " + result);
            if (result%2 == 0){
                System.out.println(result + " É par!");
            } else {
                System.out.println(result + " Não é par");
            }
            if (result > 0){
                System.out.println(result + " é positivo!");
            } else {
                System.out.println(result + " é negativo");
            }
            
        } else {  
            System.out.println("Operação inexistente ");
        }
        
        
        
        }
    }
        
}
