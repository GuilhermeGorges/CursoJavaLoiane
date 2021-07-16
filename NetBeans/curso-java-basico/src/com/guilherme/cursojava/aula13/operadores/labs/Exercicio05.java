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
 * 
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        while(true){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo: " );
        double raio = scan.nextDouble();
        
        double area = (raio * raio)*3.14;
        
        System.out.println("A área do circulo é: " + area);
        } 
    }
}
