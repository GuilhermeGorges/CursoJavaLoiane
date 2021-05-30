/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.labs;

import com.guilherme.cursojava.aula15.labs.*;
import java.util.Scanner;

/**
 *
 * @author Gui e Di
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countryA;
        int countryB;
        float groutTxA;
        float groutTxB;
        int counterYears = 0;
        boolean infoValida = false;
        
        
        do {
            System.out.println("Digite a população do pais com menor população: ");
            countryA = scan.nextInt();
            
            if (countryA >= 0){
                infoValida = true;
            } else {
                System.out.println("População precisa ser maior que 0.  ");
            }
        } while (!infoValida); 
        
        
        infoValida = false;
        do {
            System.out.println("Digite a taxa de crescimento do pais: (precisa ser maior do que a do segundo)");
            groutTxA = scan.nextFloat();
            
            if (groutTxA > 0 && groutTxA <= 100){
                infoValida = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser de 0% á 100%.  ");
            }
        } while (!infoValida); 
        
        
        
        infoValida = false;
        do {
            System.out.println("Digite a população do segundo pais.");
            countryB = scan.nextInt();
            
            if (countryB > countryA){
                infoValida = true;
            } else {
                System.out.println("População do pais B precisa ser maior que a população do pais A.  ");
            }
        } while (!infoValida); 
        
        
        infoValida = false;
        do {
            System.out.println("Digite a taxa de crescimento do pais B");
            groutTxB = scan.nextFloat();
            
            if (groutTxB > 0 && groutTxB <= 100 && groutTxB < groutTxA){
                infoValida = true;
            } else {
                System.out.println("Taxa de crescimento precisa ser de 0% á 100%.   ");
                System.out.println("Taxa de crescimento precisa ser menor do que a do pais A. ");
            }
        } while (!infoValida); 
        
        groutTxA = (groutTxA / 100);
        groutTxB = (groutTxB / 100);
        
        while (countryA <= countryB){
            countryA += (countryA * groutTxA);
            
            countryB += (countryB * groutTxB);
            
            counterYears++;
        }
        
        System.out.println("O pais A atingiu a população do pais B com " + counterYears + " anos.");
        System.out.println("O pais A estava com a populçação de "+ countryA + " habitantes.");
        System.out.println("O pais B estava com a populçação de "+ countryB + " habitantes.");
        
        
        
    }
}
