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
public class Exercicio10 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a temperatura que deseja converter de Celsius to Farenheit: ");
    double celcius = scan.nextDouble();

    double farenheit = ((celcius * 1.8) + 32);

    System.out.println("A temperatura em Celcius é = "+ farenheit);

    }
}
