/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula34staticmetodo.labs;

/**
 *
 * @author Gui e Di
 */
public class Calculadora {
    public static double somar(double n1, double n2){
        return  n1 + n2;
    }
    
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }       
       
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }
    
    public static double pot(double n1, double n2){
        return Math.pow(n1, n2);
    }
    
    public static double potMetodo(double n1, double n2){
        double total = n1;
        for (int i = 1; i < n2; i++){
            total *= n1; 
        }
        return total;
    }
    
    public static int fatorial(int num){       // exer 03 
        
        if (num == 0){
            return 1;
        } 
        
        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i; 
        }
        return total;
    }
    
    
}
