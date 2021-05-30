/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula13operadores.labs;

import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a temperatura que deseja converter de Farenheit to Celsius: ");
        double farenheit = scan.nextDouble();
        
        double celcius = (5 * (farenheit - 32)/9);
        
        System.out.println("A temperatura em Celcius é = "+ celcius);
        
    }
}
