/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17loopfor.labs;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int countryA = 80000;
        int countryB = 200000;
        int counterYears = 0;
        
        
        while (countryA <= countryB){
            countryA += (countryA * 0.03);
            
            countryB += (countryB * 0.015);
            
            counterYears++;
        }
        
        System.out.println("O pais A atingiu a população do pais B com " + counterYears + " anos.");
        System.out.println("O pais A estava com a populçação de "+ countryA + " habitantes.");
        System.out.println("O pais B estava com a populçação de "+ countryB + " habitantes.");
        
        
        
    }
}
