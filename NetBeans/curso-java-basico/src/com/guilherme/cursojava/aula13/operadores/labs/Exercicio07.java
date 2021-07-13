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
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de um dos lados do quadrado: ");
        double oneSide = scan.nextDouble();
        
        double square = Math.pow(oneSide, oneSide);
        
        System.out.println("A área do quadrado mede: "+ square);
        System.out.println("O dobro da área do quadrado é de: "+ square*2);
        
    }
}
