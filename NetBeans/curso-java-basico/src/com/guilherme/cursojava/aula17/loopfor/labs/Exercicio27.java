/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guilherme.cursojava.aula17.loopfor.labs;

import java.util.Scanner;

/**
 *
 * 
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        double media = 0;
        
        System.out.println("Informe a quantidade de temperaturas");
        int qtdTemperaturas = scan.nextInt();
                
        for (int i = 1; i <= qtdTemperaturas ;i++){
        System.out.println("Digite a "+ i + " temperatura.");
        temp = scan.nextDouble();
        
        soma += temp;
        
        if (temp >= maior){
            maior = temp; 
        } 
        if (temp <= menor){
            menor = temp; 
        }
        
        }
        media = soma / qtdTemperaturas;
        
        System.out.println("A menor temperatura informada foi " + menor + "Cº");
        System.out.println("A maior temperatura informada foi " + maior + "Cº");
        System.out.println("A média das temperaturas informadas foram " + media + "Cº");
        
    }
}
