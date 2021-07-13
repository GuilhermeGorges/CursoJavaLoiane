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
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite quantos KG de MORANGO você quer: ");
        double morango = scan.nextDouble();
        double precoMorango = 0;
        if (morango < 5){
            precoMorango = morango * 2.5;            
        } else {
            precoMorango = morango * 2.2;            
        }
        
        System.out.println("Digite quantos KG de MACA você quer: ");
        double maca = scan.nextDouble();
        double precoMaca = 0;
        if (maca < 5){
            precoMaca = maca * 1.8;            
        } else {
            precoMaca = maca * 1.5;            
        }
        
        double pesoTotal = maca + morango;
        double valorTotal = precoMorango + precoMaca;
        
        if (valorTotal > 25 || pesoTotal > 8){
            double desc10 = valorTotal * 0.1;
            double valorDesc = valorTotal - desc10;
            System.out.println("Você comprou " + morango + " KG de MORANGOS");
            System.out.println("Você comprou " + maca + " KG de MACAS");
            System.out.println("Você recebeu R$ " + desc10 + " de desconto.");
            System.out.println("O valor a ser pago é de R$ "+ valorDesc);
        } else {
            System.out.println("Você comprou " + morango + " KG de MORANGOS");
            System.out.println("Você comprou " + maca + " KG de MACAS");
            System.out.println("O valor a ser pago é de R$ "+ valorTotal); 
        }

    }
}
      
        